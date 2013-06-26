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
                                    

package org.modelio.audit.service;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.audit.plugin.Audit;

@objid ("0a0b3839-3b73-4b21-8e76-9293ffc730ff")
public enum AuditSeverity {
    AuditSuccess (Audit.I18N.getString("Audit.Severity.AuditSuccess"),"icons/idle.png"),
    AuditAdvice (Audit.I18N.getString("Audit.Severity.AuditAdvices"),"icons/advice.png"),
    AuditWarning (Audit.I18N.getString("Audit.Severity.AuditWarnings"),"icons/warning.png"),
    AuditError (Audit.I18N.getString("Audit.Severity.AuditErrors"),"icons/error.png");

    @objid ("e0b1e5ac-53fa-4633-8a0e-37cef4a9d2b4")
    private String label;

    @objid ("0303caa2-f1df-44e3-94e4-8d19e9ed5eab")
    private Image image;

    @objid ("ad9fdb86-b7ec-4df0-823b-f154bec40c13")
    private AuditSeverity(String label, String image) {
        this.image = Audit.getImageDescriptor(image).createImage();
        this.label = label;
    }

    @objid ("45ae6e86-ccc1-48c5-bfbc-f83669bb47e9")
    public Image getImage() {
        return this.image;
    }

    @objid ("a3e9ee2c-3a61-47ed-9ea3-7e930a6cb531")
    public String getLabel() {
        return this.label;
    }

    @objid ("7f116674-7e37-4ec9-ba9a-f53d71d66d81")
    public static String[] getRuntimeValues() {
        return new String[]{AuditSeverity.AuditAdvice.getLabel(),AuditSeverity.AuditWarning.getLabel(),AuditSeverity.AuditError.getLabel()};
    }

    @objid ("ac48ee03-e231-4779-9586-ef1179093bc6")
    public static Image[] getRuntimeImages() {
        return new Image[]{AuditSeverity.AuditAdvice.getImage(),AuditSeverity.AuditWarning.getImage(),AuditSeverity.AuditError.getImage()};
    }

    @objid ("1b7791d0-fec6-4fb2-82ca-c24cbb22480a")
    public static AuditSeverity findByLabel(String value) {
        if(AuditSuccess.getLabel().equals(value)) {
            return AuditSuccess;
        } else  if(AuditAdvice.getLabel().equals(value)) {
            return AuditAdvice;
        } else  if(AuditWarning.getLabel().equals(value)) {
            return AuditWarning;
        } else  if(AuditError.getLabel().equals(value)) {
            return AuditError;
        }
        return null;
    }

}
