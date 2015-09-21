/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.patterns.api.IPatternRepository;
import org.modelio.patterns.model.information.Category;
import org.modelio.patterns.model.information.ConstantParameter;
import org.modelio.patterns.model.information.Parameter;
import org.modelio.patterns.model.information.StringParameter;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Pattern manipulation services at model level.
 */
@objid ("3a676736-7b29-4976-a4c9-cb0c0169f58f")
public class ProfileUtils {
    @objid ("41025beb-60df-48fa-bbbc-3305994a470d")
    public static final String MODULE_NAME = "ModelerModule";

    @objid ("ddcdd259-30b7-42c8-bff7-a9f70f1cad10")
    public static Package createPattern(Package owner, IPatternRepository patternCatalog) throws ExtensionNotFoundException {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        
        Package pattern = session.getModel().createPackage("Pattern", owner, MODULE_NAME, PatternDesignerStereotypes.PATTERN);
        
        session.getModel().createTaggedValue(MODULE_NAME, "nocode", pattern);
        return pattern;
    }

    @objid ("3fa6eda5-06bf-4e37-8987-1fd3a7a2c762")
    public static Package createPatternFromModel(ModelElement topElement, IPatternRepository patternCatalog) throws ExtensionNotFoundException {
        // Create new pattern
        IModelingSession session = Modelio.getInstance().getModelingSession();
        final Package rootPackage = ((Project) session.getModel().getRoot(topElement)).getModel();
        Package target = createPattern(rootPackage, patternCatalog);
        
        // Name the pattern from the model top element name
        target.setName(topElement.getName());
        
        // FIXME: when elements are not part of a ModelTree, it should also copy the composition parents up to the nearest NameSpace
        // and add <<PatternRoot>> on these not selected elements.
        
        // Add elements into the new pattern
        Modelio.getInstance().getModelManipulationService().copyTo(Arrays.asList(topElement), target);
        return target;
    }

    @objid ("1f3888f3-76e5-4529-be15-98c72141d549")
    public static void updatePatternModel(Package patternModel, RuntimePattern information) throws ExtensionNotFoundException {
        patternModel.setName(information.getInfos().getName());
        
        patternModel.putTagValue(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_VERSION, information.getInfos().getVersion());
        
        patternModel.putTagValue(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_IMAGE, information.getInfos().getImage());
        
        patternModel.putNoteContent(MODULE_NAME, "description", information.getInfos().getDescription());
        
        List<Category> categories = information.getCategories();
        if (!categories.isEmpty()) {
            List<String> params = patternModel.getTagValues(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_CATEGORIES);
        
            if (params == null) {
                params = new ArrayList<>();
            }
        
            if (params.size() > 1) {
                params.set(0, categories.get(0).getName());
            } else {
                params.add(categories.get(0).getName());
            }
        
            for (int i = 1; i < 3; i++) {
                if (params.size() <= i) {
                    params.add("");
                }
            }
        
            patternModel.putTagValues(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_CATEGORIES, params);
        } else {
            patternModel.removeTags(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_CATEGORIES);
        }
        
        // Clean tags before adding new ones
        patternModel.removeTags(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_PARAMETERS);
        patternModel.removeTags(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_STRINGPARAMETERS);
        
        IModelingSession session = Modelio.getInstance().getModelingSession();
        for (Parameter param : information.getParameters()) {
            if (param instanceof StringParameter) {
                saveParameterInModel(patternModel, param);
            } else if (!(param instanceof ConstantParameter)) {
                MObject element = session.findElementById(patternModel.getMClass().getMetamodel().getMClass(param.getMetaclass()), param.getId());
                if (element != null && element instanceof ModelElement) {
                    saveParameterInModel(patternModel, param);
                }
            }
        
        }
    }

    /**
     * Get a {@link ParameterModelData} from an id by parsing the {@link PatternDesignerTagTypes#PATTERN_TEMPLATE_PARAMETERS} annotation on a model pattern.
     */
    @objid ("bfa20383-7efe-460a-b889-a5382b0c5edf")
    static ParameterModelData getParameterData(String id, MObject element) {
        Package patternModel = getPatternModel(element);
        if (patternModel != null) {
            List<String> params = patternModel.getTagValues(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_PARAMETERS);
            if (params != null) {
                for (int i = 0; i < params.size() - 1; i = i + 4) {
                    if (params.get(i).equals(id)) {
                        ParameterModelData data = new ParameterModelData();
                        data.id = params.get(i);
                        data.name = params.get(i + 1);
                        data.label = params.get(i + 2);
                        data.description = params.get(i + 3);
                        return data;
                    }
                }
            }
        }
        return null;
    }

    @objid ("b919a0cc-d11e-4750-b9c7-db2319e55436")
    private static Package getPatternModel(MObject element) {
        if (element instanceof Package && ((Package) element).isStereotyped(MODULE_NAME, PatternDesignerStereotypes.PATTERN)) {
            return (Package) element;
        } else if (element.getCompositionOwner() == null) {
            return null;
        } else {
            return getPatternModel(element.getCompositionOwner());
        }
    }

    /**
     * Private c'tor to prevent class instantiation.
     */
    @objid ("de972673-a0f8-412b-885f-70639b59eb20")
    private ProfileUtils() {
        // Empty
    }

    @objid ("ce7a5811-59ee-42fb-9144-52ceea54b5c0")
    private static void saveParameterInModel(Package patternModel, Parameter param) throws ExtensionNotFoundException {
        String id = param instanceof StringParameter ? param.getName() : param.getId();
        String name = param.getName();
        String label = param.getLabel();
        String description = param.getDescription();
        
        if (patternModel != null) {
            boolean found = false;
            List<String> params = patternModel.getTagValues(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_PARAMETERS);
            if (params != null) {
                for (int i = 0; i < params.size() - 1; i = i + 4) {
                    if (params.get(i).equals(id)) {
                        params.set(i, id);
                        params.set(i + 1, name);
                        params.set(i + 2, label);
                        params.set(i + 3, description);
                        found = true;
                    }
                }
            } else {
                params = new ArrayList<>();
            }
            if (!found) {
                params.add(id);
                params.add(name);
                params.add(label);
                params.add(description);
            }
            patternModel.putTagValues(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_PARAMETERS, params);
        }
    }

    /**
     * Get label for a StringParameter using the deprecated {@link PatternDesignerTagTypes#PATTERN_TEMPLATE_STRINGPARAMETERS} annotation.
     */
    @objid ("0842c8d9-fcde-455e-947d-c147818ee375")
    static String getStringParameterLabel(String name, MObject element) {
        Package patternModel = getPatternModel(element);
        if (patternModel != null) {
            List<String> params = patternModel.getTagValues(MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_STRINGPARAMETERS);
            if (params != null) {
                for (int i = 0; i < params.size() - 1; i = i + 2) {
                    if (params.get(i).equals(name)) {
                        return params.get(i + 1);
                    }
                }
            }
        }
        
        // No label found, return name
        return name;
    }

    @objid ("9bc6e1a0-115f-41d3-929e-b4b604ec506d")
    public interface PatternDesignerStereotypes {
        @objid ("85b585e9-b3ec-4333-94c4-69f767212d9c")
        public static final String PATTERN = "Pattern";

        @objid ("c2463711-2f0e-4390-838f-c1732996e722")
        public static final String PATTERNROOT = "PatternRoot";

        @objid ("979ee21d-fb58-4c28-a6de-a5c47a461e5d")
        public static final String PATTERNPARAMETER = "PatternParameter";

    }

    @objid ("d9d7404c-2a74-4b94-a538-19616afe3ed7")
    public interface PatternDesignerTagTypes {
        @objid ("bb383e04-ff20-4bc1-b648-c3d357e575bf")
        public static final String PATTERN_TEMPLATE_VERSION = "Template.Version";

        @objid ("1085552b-54e7-4a87-a6ac-1205b73107da")
        public static final String PATTERN_TEMPLATE_IMAGE = "Template.Image";

        @objid ("9d68d228-fa58-45d8-a0a0-d19d146e5b2e")
        public static final String PATTERN_TEMPLATE_CATEGORIES = "Template.Categories";

        @objid ("4e913753-fd64-4ee4-8b23-9b7f5b01d7c7")
        @Deprecated
        public static final String PATTERN_TEMPLATE_STRINGPARAMETERS = "Template.StringParameters";

        @objid ("d82fee2e-1f89-4bf6-b5af-5c241e1cbc25")
        @Deprecated
        public static final String PATTERNPARAMETER_PATTERNPARAMETER_NAME = "PatternParameter.Name";

        @objid ("f676acb6-12b4-4c76-90de-eeb1020c019f")
        @Deprecated
        public static final String PATTERNPARAMETER_PATTERNPARAMETER_LABEL = "PatternParameter.Label";

        @objid ("746e9efa-e7a3-4231-a593-7858a00f8b1f")
        public static final String PATTERN_TEMPLATE_PARAMETERS = "Template.Parameters";

    }

    /**
     * Simple data structure used when parsing parameter-related information from the model.
     */
    @objid ("19b30ef0-84c0-439f-a19f-34594c96b8c5")
    static class ParameterModelData {
        @objid ("657a9819-5f40-4217-b1a2-2da6c014b453")
        public String id;

        @objid ("d425f536-65dd-4c2d-b6ae-bebfe557e34b")
        public String name;

        @objid ("d7567aea-7109-4ff5-9bce-30cafa471204")
        public String label;

        @objid ("f2d77a69-eab8-40bb-b0e5-34adcfe21e5a")
        public String description;

    }

}
