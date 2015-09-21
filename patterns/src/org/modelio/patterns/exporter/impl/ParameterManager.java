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


package org.modelio.patterns.exporter.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.patterns.exporter.PatternModelAnalysis;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("e2906bfc-2e08-41f5-89bb-157c43f771a7")
class ParameterManager {
    @objid ("14a2afce-f19f-4c78-9c70-46dd76061634")
    private static final String START_MARKER = "$(";

    @objid ("862a1baf-af86-44b1-bc4b-a2ca66c867cf")
    private static final char END_MARKER = ')';

    @objid ("0e07ed12-f779-4059-a02b-05aa25cf8206")
    private static final char SEPARATOR_MARKER = ',';

    @objid ("f7271d0c-492f-46a8-b14d-c2f89e36f6f8")
    private static final String UPPER = "upper";

    @objid ("8ed19875-f0e7-40ed-ae1a-79e2a8fe8a84")
    private static final String LOWER = "lower";

    @objid ("fc427ace-487a-434e-bcb8-3823a12b89d8")
    private static final String FIRST = "cfirst";

    @objid ("7a09b984-7814-4502-8fc0-67e07e667cbc")
    private static final String LOWERFIRST = "lfirst";

    @objid ("2361fc6e-cbc8-484d-969a-ac38604f6a04")
    private PatternModelAnalysis report;

    @objid ("6b806399-debd-4df6-9cc1-550474f65c84")
    public ParameterManager(PatternModelAnalysis report) {
        this.report = report;
    }

    @objid ("c66e9564-e53f-4fd5-ba07-067ce301cd72")
    public String parameterFormater(ModelElement element) {
        this.report.addElementParameter(element);
        return "(MObject) parameters.get(\"" + element.getName() + "\")";
    }

    @objid ("1f25e551-9a73-4f96-a8c3-853a9f4514c2")
    public String parameterFormater(String initialValue, MObject element) {
        String value = escape(initialValue);
        String resultValue = "";
        
        int valueIdx = 0;
        int startIdx = value.indexOf(START_MARKER, 0);
        
        while (startIdx != -1) {
            int endIdx = startIdx;
            String parameterName = "";
            String mode = "";
        
            for (endIdx = startIdx; endIdx < value.length(); endIdx++) {
                if (value.charAt(endIdx) == SEPARATOR_MARKER) {
                    for (endIdx = endIdx + 1; endIdx < value.length(); endIdx++) {
                        if (value.charAt(endIdx) == END_MARKER) {
                            break;
                        } else {
                            mode = mode + value.charAt(endIdx);
                        }
                    }
                    parameterName = parameterName + ")";
                    break;
                } else if (value.charAt(endIdx) == END_MARKER) {
                    parameterName = parameterName + ")";
                    break;
                } else {
                    parameterName = parameterName + value.charAt(endIdx);
                }
            }
            if (endIdx > startIdx) {
                this.report.addStringParameter(parameterName, new MRef(element));
        
                resultValue = resultValue + value.substring(valueIdx, startIdx);
        
                if (mode.equals(UPPER)) {
                    resultValue = resultValue + "\" + ((String) parameters.get(\"" + parameterName + "\")).toUpperCase()+\"";
                } else if (mode.equals(LOWER)) {
                    resultValue = resultValue + "\" + ((String) parameters.get(\"" + parameterName + "\")).toLowerCase()+\"";
                } else if (mode.equals(FIRST)) {
                    resultValue = resultValue + "\" + ((String) parameters.get(\"" + parameterName
                            + "\")).substring(0, 1).toUpperCase() + ((String) parameters.get(\"" + parameterName
                            + "\")).substring(1, ((String) parameters.get(\"" + parameterName + "\")).length())  +\"";
                } else if (mode.equals(LOWERFIRST)) {
                    resultValue = resultValue + "\" + ((String) parameters.get(\"" + parameterName
                            + "\")).substring(0, 1).toLowerCase() + ((String) parameters.get(\"" + parameterName
                            + "\")).substring(1, ((String) parameters.get(\"" + parameterName + "\")).length())  +\"";
                } else {
                    resultValue = resultValue + "\" + (String) parameters.get(\"" + parameterName + "\")+\"";
                }
        
            }
            valueIdx = endIdx + 1;
            startIdx = value.indexOf(START_MARKER, valueIdx);
        }
        
        if (valueIdx < value.length()) {
            resultValue = resultValue + value.substring(valueIdx, value.length()) + "\" +\"";
        }
        return resultValue;
    }

    @objid ("c363f1cb-ea88-4e9e-b6f8-10b5a59a0d97")
    private String escape(String value) {
        // Replace character constants to avoid error in the generated file
        String result = value;
        result = result.replace("\n", "\\n");
        result = result.replace("\r", "\\r");
        result = result.replace("\f", "\\f");
        result = result.replace("\t", "\\t");
        result = result.replace("\b", "\\b");
        result = result.replace("\"", "\\\"");
        result = result.replace("\\:", "\\\\:");
        return result;
    }

}
