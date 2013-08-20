/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.mda.infra.service.dynamic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.diagram.tools.IAttachedBoxCommand;
import org.modelio.api.diagram.tools.IBoxCommand;
import org.modelio.api.diagram.tools.IDiagramCommand;
import org.modelio.api.diagram.tools.ILinkCommand;
import org.modelio.api.diagram.tools.IMultiLinkCommand;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.ActionLocation;
import org.modelio.api.module.commands.DefaultModuleAction;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.api.module.commands.IModuleContextualCommand;
import org.modelio.api.module.propertiesPage.IModulePropertyPage;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.gproject.module.jaxbmodel.JxbContextualCommand.Contribution;
import org.modelio.gproject.module.jaxbmodel.JxbContextualCommand;
import org.modelio.gproject.module.jaxbmodel.JxbDiagramCommand;
import org.modelio.gproject.module.jaxbmodel.JxbDiagramCommandBox;
import org.modelio.gproject.module.jaxbmodel.JxbDiagramCommandLink;
import org.modelio.gproject.module.jaxbmodel.JxbHandler;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.Command;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.CustomizedDiagram.Palette;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.CustomizedDiagram;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.ElementCreationCommand;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.PropertyPage;
import org.modelio.gproject.module.jaxbmodel.JxbScope;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ElementNotUniqueException;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Helper class handling creation of commands, diagram tools & diagram customizers and registering them on a given module.
 */
@objid ("796e7728-1279-41e4-a421-d9e6575b5833")
public class DynamicGuiCreationHelper {
    @objid ("0dea8c47-8be8-413b-bf54-524e99986968")
    public DynamicGuiCreationHelper(final File bundleDir) {
    }

    @objid ("1efb4a15-df5b-4f26-810f-e81856ffbd5f")
    public boolean registerCommand(final JxbDiagramCommand command, final IModule module) throws IOException {
        String name = module.getLabel(command.getName());
        String group = module.getLabel(command.getGroup());
        JxbHandler handler = command.getHandler();
        if (handler != null) {
            String stereotype = handler.getStereotype();
            String relation = handler.getRelation();
        
            try {
                ClassLoader loader = module.getSession().getClass().getClassLoader();
                Class<?> commandClass = loader.loadClass(handler.getClazz());
                String label = module.getLabel(command.getLabel());
        
                String tooltype = module.getLabel(command.getTooltip());
        
                IDiagramCommand commandInstance = (IDiagramCommand) commandClass.newInstance();
                if (label != null)
                    commandInstance.setLabel(label);
                if (tooltype != null)
                    commandInstance.setTooltip(tooltype);
                if (command.getImage() != null && !command.getImage().equals("")) {
                    String bitmap = module.getConfiguration().getModuleResourcesPath() + "/" + module.getLabel(command.getImage());
                    ImageDescriptor descriptor = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(),
                            bitmap));
                    commandInstance.setBitmap(descriptor);
                }
        
                MClass metaclass = null;
                if (handler.getMetaclass() != null) {
                    metaclass = Metamodel.getMClass(handler.getMetaclass());
                } else {
                    metaclass = Metamodel.getMClass("Element");
                }
        
                Stereotype stereotypeClass = null;
                if (stereotype != null && metaclass != null) {
                    stereotypeClass = getStereotype(metaclass, stereotype);
                }
        
                if (commandInstance instanceof IAttachedBoxCommand) {
                    module.registerCustomizedTool(name,
                            Metamodel.getJavaInterface(metaclass),
                            stereotypeClass,
                            relation,
                            (IAttachedBoxCommand) commandInstance);
                } else if (commandInstance instanceof IBoxCommand) {
                    module.registerCustomizedTool(name,
                            Metamodel.getJavaInterface(metaclass),
                            stereotypeClass,
                            relation,
                            (IBoxCommand) commandInstance);
                } else if (commandInstance instanceof ILinkCommand) {
                    module.registerCustomizedTool(name,
                            Metamodel.getJavaInterface(metaclass),
                            stereotypeClass,
                            relation,
                            (ILinkCommand) commandInstance);
                } else if (commandInstance instanceof IMultiLinkCommand) {
                    module.registerCustomizedTool(name,
                            Metamodel.getJavaInterface(metaclass),
                            stereotypeClass,
                            relation,
                            (IMultiLinkCommand) commandInstance);
                }
                return true;
            } catch (ClassNotFoundException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", handler.getClazz()));
            } catch (InstantiationException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", handler.getClazz()));
            } catch (IllegalAccessException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", handler.getClazz()));
            } catch (ClassCastException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L45_class_cast_exception", handler.getClazz()));
            }catch (Exception e) {
                throw new IOException(e.toString());
            }
        } else if (name != null && group != null) {
            return true;
        }
        return false;
    }

    @objid ("a92fd10d-786d-4320-93ab-4d900fbe9e2b")
    public void registerPropertyPage(final PropertyPage property, final IModule module) throws IOException {
        try {
            ClassLoader loader = module.getSession().getClass().getClassLoader();
            Class<?> commandClass = loader.loadClass(property.getClazz());
            String name = module.getLabel(property.getName());
            String label = module.getLabel(property.getLabel());
        
        
            IModulePropertyPage propertypage = (IModulePropertyPage) commandClass.newInstance();
            if (name != null)
                propertypage.setName(name);
            if (label != null)
                propertypage.setLabel(label);
            if (property.getImage() != null && !property.getImage().equals("")) {
                // TODO image
        //                 String bitmap = module.getConfiguration().getModuleResourcesPath() + "/" +module.getLabel(property.getImage());
        //                 ImageDescriptor descriptor = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(),bitmap));
        //                 propertypage.setBitmap(descriptor);
            }
            propertypage.setModule(module);
            module.getPropertyPages().add(propertypage);
        } catch (ClassNotFoundException e) {
            throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", property.getClazz()));
        } catch (InstantiationException e) {
            throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", property.getClazz()));
        } catch (IllegalAccessException e) {
            throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", property.getClazz()));
        } catch(ClassCastException e){
            throw new IOException(MdaInfra.I18N.getMessage("L45_class_cast_exception", property.getClazz()));
        }catch (Exception e) {
            throw new IOException(e.toString());
        }
    }

    @objid ("36b004a6-045b-4c0f-a15e-bd9d32ade266")
    public void registerPalette(final CustomizedDiagram diagram, final IModule module) throws IOException {
        List<GenericDiagramCustomizer.CommandRegistry> commands = new ArrayList<>();
        
        for (Object diagramChild : diagram.getPaletteOrStyle()) {
            if (diagramChild instanceof Palette) {
                Palette palette = (Palette) diagramChild;
        
                for (JAXBElement<?> paletteChild : palette.getDiagramCommandOrDiagramCommandBoxOrDiagramCommandLink()) {
                    if (paletteChild.getValue() instanceof JxbDiagramCommand) {
                        JxbDiagramCommand command = (JxbDiagramCommand) paletteChild.getValue();
                        boolean isValid = registerCommand(command, module);
        
                        if (isValid) {
                            commands.add(new GenericDiagramCustomizer.CommandRegistry(command.getName(), command.getGroup()));
                        }
                    } else if (paletteChild.getValue() instanceof JxbDiagramCommandBox) {
        
                        JxbDiagramCommandBox command = (JxbDiagramCommandBox) paletteChild.getValue();
                        boolean isValid = registerCommand(command, module);
        
                        if (isValid) {
                            commands.add(new GenericDiagramCustomizer.CommandRegistry(command.getName(), command.getGroup()));
                        }
                    } else if (paletteChild.getValue() instanceof JxbDiagramCommandLink) {
                        JxbDiagramCommandLink command = (JxbDiagramCommandLink) paletteChild.getValue();
                        boolean isValid = registerCommand(command, module);
        
                        if (isValid) {
                            commands.add(new GenericDiagramCustomizer.CommandRegistry(command.getName(), command.getGroup()));
                        }
                    } else if (paletteChild.getValue() instanceof JxbDiagramCommandBox) {
                        JxbDiagramCommandBox command = (JxbDiagramCommandBox) paletteChild.getValue();
                        boolean isValid = registerAttachedBoxCommand(command, module);
        
                        if (isValid) {
                            commands.add(new GenericDiagramCustomizer.CommandRegistry(command.getName(), command.getGroup()));
                        }
                    }
                }
            }
        }
        registerPalette(diagram, commands, module);
    }

    @objid ("d6cc5a61-a631-474d-99f2-e7f6b1c64cab")
    private void registerPalette(final CustomizedDiagram diagram, final List<org.modelio.mda.infra.service.dynamic.GenericDiagramCustomizer.CommandRegistry> commands, final IModule module) throws IOException {
        try {
            MClass metaclass = null;
            if (diagram.getBaseDiagram() != null) {
                metaclass = Metamodel.getMClass(diagram.getBaseDiagram());
            } else {
                metaclass = Metamodel.getMClass("AbstractDiagram");
            }
        
            String stereotype = diagram.getStereotype();
            Stereotype stereotypeClass = null;
            if (stereotype != null && metaclass != null) {
                stereotypeClass = getStereotype(metaclass, stereotype);
                GenericDiagramCustomizer customizer = new GenericDiagramCustomizer(commands, diagram.isKeepBasePalette(), module);
                module.registerDiagramCustomization(stereotypeClass, (Class<? extends AbstractDiagram>) Metamodel.getJavaInterface(metaclass), customizer);
            }
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
    }

    @objid ("4dfdf10a-75db-473e-9ca1-6e3b20543a68")
    public boolean registerCommand(final JxbDiagramCommandBox command, final IModule module) throws IOException {
        String stereotype= "";
        try {
            String name = module.getLabel(command.getName());
            String group = module.getLabel(command.getGroup());
        
            List<GenericScope> scopes = new ArrayList<>();        
            GenericHandler handler = null;
            for (Object child : command.getScopeOrHandler()) {
                if (child instanceof JxbHandler) {
                    JxbHandler jxbHandler = (JxbHandler) child;
                    handler = new GenericHandler(jxbHandler.getMetaclass(), jxbHandler.getRelation(), jxbHandler.getStereotype());
                } else if (child instanceof JxbScope) {
                    JxbScope jxbScope = (JxbScope) child;
                    scopes.add(new GenericScope(jxbScope.getMetaclass(), jxbScope.getStereotype()));
                }
            }
        
            if (handler != null && scopes.size() > 0) {
        
                ImageDescriptor descriptor = null;
                String label = module.getLabel(command.getLabel());
        
                String tooltype = module.getLabel(command.getTooltip());
        
                if (command.getImage() != null && !command.getImage().equals("")) {
                    String bitmap = module.getConfiguration().getModuleResourcesPath() +"/" + module.getLabel(command.getImage());
                    descriptor = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(), bitmap));
        
                }
        
                IBoxCommand commandInstance = new GenericBoxCommand(label, descriptor, tooltype, handler, scopes);
                stereotype = handler.getStereotype();
        
                String relation = handler.getRelation();
        
                MClass metaclass = null;
                if (handler.getMetaclass() != null)
                    metaclass = Metamodel.getMClass(handler.getMetaclass());
        
                Stereotype stereotypeClass = null;
                if (stereotype != null && metaclass != null) {
                    stereotypeClass = getStereotype(metaclass, stereotype);
                }
        
                module.registerCustomizedTool(name,
                        Metamodel.getJavaInterface(metaclass),
                        stereotypeClass,
                        relation,
                        commandInstance);
        
                return true;
            } else if (name != null && group != null) {
                return true;
            }
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
        return false;
    }

    @objid ("177bb9e6-20b3-4f68-8160-65c4032e16eb")
    public boolean registerAttachedBoxCommand(final JxbDiagramCommandBox command, final IModule module) throws IOException {
        String stereotype = "";
        try {
            String name = module.getLabel(command.getName());
            String group = module.getLabel(command.getGroup());
        
            List<GenericScope> scopes = new ArrayList<>();        
            GenericHandler handler = null;
            for (Object child : command.getScopeOrHandler()) {
                if (child instanceof JxbHandler) {
                    JxbHandler jxbHandler = (JxbHandler) child;
                    handler = new GenericHandler(jxbHandler.getMetaclass(), jxbHandler.getRelation(), jxbHandler.getStereotype());
                } else if (child instanceof JxbScope) {
                    JxbScope jxbScope = (JxbScope) child;
                    scopes.add(new GenericScope(jxbScope.getMetaclass(), jxbScope.getStereotype()));
                }
            }
        
            if (handler != null && scopes.size() > 0) {
        
                ImageDescriptor descriptor = null;
                String label = module.getLabel(command.getLabel());
        
                String tooltype = module.getLabel(command.getTooltip());
                if (command.getImage() != null && !command.getImage().equals("")) {
                    String bitmap = module.getConfiguration().getModuleResourcesPath() + "/" + module.getLabel(command.getImage());
                    descriptor = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(), bitmap));
                }
                IAttachedBoxCommand commandInstance = new GenericAttachedBoxCommand(label, descriptor, tooltype, handler, scopes);
        
                stereotype = handler.getStereotype();
                String relation = handler.getRelation();
        
                MClass metaclass = null;
                if (handler.getMetaclass() != null) {
                    metaclass = Metamodel.getMClass(handler.getMetaclass());
                } else {
                    metaclass = Metamodel.getMClass("Element");
                }
        
                Stereotype stereotypeClass = null;
                if (stereotype != null && metaclass != null) {
                    stereotypeClass = getStereotype(metaclass, stereotype);
                }
        
                module.registerCustomizedTool(name, Metamodel.getJavaInterface(metaclass), stereotypeClass, relation, commandInstance);
        
                return true;
            } else if (name != null && group != null) {
                return true;
            }
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
        return false;
    }

    @objid ("3b3a1a80-c2e9-4803-8775-dfeac389545d")
    public boolean registerCommand(final JxbDiagramCommandLink command, final IModule module) throws IOException {
        String stereotype = "";
        try {
            String name = module.getLabel(command.getName());
            String group = module.getLabel(command.getGroup());
        
            JxbHandler jxbHandler = command.getHandler();
            GenericHandler handler = jxbHandler != null ? new GenericHandler(jxbHandler.getMetaclass(), jxbHandler.getRelation(), jxbHandler.getStereotype()) : null;
        
            List<GenericScope> sources = new ArrayList<>();
            if (command.getScopeSource() != null) {
                for (JxbScope jxbScope : command.getScopeSource()) {
                    sources.add(new GenericScope(jxbScope.getMetaclass(), jxbScope.getStereotype()));
                }
            }
            List<GenericScope> target = new ArrayList<>();
            if (command.getScopeTarget() != null) {
                for (JxbScope jxbScope : command.getScopeTarget()) {
                    target.add(new GenericScope(jxbScope.getMetaclass(), jxbScope.getStereotype()));
                }
            }
        
            if (handler != null && sources.size() > 0 && target.size() > 0 && target.size() > 0) {
                ImageDescriptor descriptor = null;
                String label = module.getLabel(command.getLabel());
        
                String tooltype = module.getLabel(command.getTooltip());
                if (command.getImage() != null && !command.getImage().equals("")) {
                    String bitmap = module.getConfiguration().getModuleResourcesPath() +"/" + module.getLabel(command.getImage());
                    descriptor = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(), bitmap));
                }
        
                stereotype = handler.getStereotype();
                String relation = handler.getRelation();
        
                MClass metaclass = null;
                if (handler.getMetaclass() != null) {
                    metaclass = Metamodel.getMClass(handler.getMetaclass());
                } else {
                    metaclass = Metamodel.getMClass("Element");
                }
        
                Stereotype stereotypeClass = null;
                if (stereotype != null && metaclass != null) {
                    stereotypeClass = getStereotype(metaclass, stereotype);
                }
        
                ILinkCommand commandInstance = new GenericLinkCommand(label, descriptor, tooltype, handler, sources, target);
                module.registerCustomizedTool(name,Metamodel.getJavaInterface(metaclass), stereotypeClass, relation, commandInstance);
        
                return true;
            } else if (name != null && group != null) {
                return true;
            }
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
        return false;
    }

    @objid ("60b90e31-e4b4-4695-967c-4b883761c810")
    private Stereotype getStereotype(MClass metaclass, String stereotype) {
        return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, metaclass);
    }

    @objid ("c69e4f45-c8f9-4ead-8e1c-9d73b7efa6c9")
    public void registerDefaultElementCreationCommand(final ElementCreationCommand command, final IModule module, final IMModelServices mModelServices) throws IOException {
        // Get the JaxB Handler that holds the name of the metaclass and stereotype to create
        JxbHandler jaxbHandler = null;
        for (Object child : command.getScopeOrHandlerOrContribution()) {
            if (child instanceof JxbHandler) {
                jaxbHandler = (JxbHandler) child;
            }
        }
        
        if (jaxbHandler != null) {
            String name = module.getLabel(command.getName());
            GenericElementCreationCommand handler = new GenericElementCreationCommand(name, jaxbHandler.getMetaclass(), jaxbHandler.getStereotype(), jaxbHandler.getRelation());
            registerCommand(command, module, mModelServices, handler);
        
        }
    }

    @objid ("95bc7d3f-bfe7-436e-918e-c0e3b9adb1ad")
    public void registerStandardCommand(final Command command, final IModule module, final IMModelServices mModelServices) throws IOException {
        // Get the JaxB Handler that holds the name of the handler class to instantiate.
        JxbHandler jaxbHandler = null;
        for (Object child : command.getScopeOrHandlerOrContribution()) {
            if (child instanceof JxbHandler) {
                jaxbHandler = (JxbHandler) child;
            }
        }
        if (jaxbHandler != null) {
            try {
                // Load and instantiate the handler class in the same class loader as the module.
                ClassLoader loader = module.getClass().getClassLoader();
                Class<?> handlerClass = loader.loadClass(jaxbHandler.getClazz());
                IModuleContextualCommand handler = (IModuleContextualCommand) handlerClass.newInstance();
        
                registerCommand(command, module, mModelServices, handler);
            } catch (ClassNotFoundException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", jaxbHandler.getClazz()));
            } catch (InstantiationException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", jaxbHandler.getClazz()));
            } catch (IllegalAccessException e) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", jaxbHandler.getClazz()));
            } catch (Exception e) {
                throw new IOException(e.toString());
            }
        }
    }

    @objid ("9323a530-caac-44c8-b3ec-d9f9339be819")
    private void registerCommand(final JxbContextualCommand command, final IModule module, final IMModelServices mModelServices, IModuleContextualCommand handler) throws IOException {
        // Instantiate a module action wrapping this handler so it can be used with the platform mechanisms.
        String name = module.getLabel(command.getName());
        String label = module.getLabel(command.getLabel());
        String bitmap = module.getLabel(command.getImage());
        String tooltype = module.getLabel(command.getTooltip());
        String group = module.getLabel(command.getGroup());
        String imageGroup = module.getLabel(command.getGroupImage());
        boolean editionMode = command.getModifyModel() == null && command.getModifyModel().equals("true");
        
        IModuleAction action = new DefaultModuleAction(module, name, label, tooltype, bitmap, group, imageGroup,
                editionMode, editionMode, handler);
        
        // Define for which metaclass/stereotype this command should be available.
        for (Object child : command.getScopeOrHandlerOrContribution()) {
            if (child instanceof JxbScope) {
                JxbScope scope = (JxbScope) child;
                if (scope.getStereotype() != null && scope.getMetaclass() != null) {
                    MClass metaclass = SmClass.getClass(scope.getMetaclass());
                    Class<? extends MObject> javaClass = SmClass.getClass(scope.getMetaclass()).getJavaInterface();
                    if (Element.class.isAssignableFrom(javaClass)) {
                        try {
                            Stereotype stereotype = mModelServices.getStereotype(scope.getStereotype(), metaclass);
                            action.addAllowedStereotype(stereotype);
                            action.addAllowedMetaclass(javaClass);
                        } catch (ElementNotUniqueException e) {
                            throw new IOException(MdaInfra.I18N.getMessage("L44_stereotype_not_found",
                                    scope.getStereotype()));
                        }
                    }
                } else if (scope.getMetaclass() != null) {
                    Class<? extends MObject> metaclass = SmClass.getClass(scope.getMetaclass()).getJavaInterface();
                    action.addAllowedMetaclass(metaclass);
                }
        
            }
        }
        
        // Define where that command should appear
        for (Object child : command.getScopeOrHandlerOrContribution()) {
            if (child instanceof Contribution) {
                Contribution contribution = (Contribution) child;
                module.registerAction(ActionLocation.getValue(contribution.getLocation()), action);
            }
        }
    }

}
