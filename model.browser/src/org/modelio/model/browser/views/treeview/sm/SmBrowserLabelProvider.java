/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.model.browser.views.treeview.sm;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.TextStyle;
import org.modelio.core.ui.labelprovider.BrowserLabelProvider;
import org.modelio.ui.CoreColorRegistry;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.SmStatus;
import org.modelio.vcore.smkernel.mapi.MAttribute;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmFeature;

/**
 * Browser tree label provider.
 */
@objid ("25a09ec0-e542-491f-9a08-9a6a1d670643")
public class SmBrowserLabelProvider extends BrowserLabelProvider {
    @objid ("ddabdf43-de94-48be-b89f-04d8ab59ede9")
    private static final Image MDEPENDENCY = BrowserLabelProvider.loadImage("meta/metaassoc.png");

    @objid ("de2fa181-d067-457c-add5-44706beaa720")
    private static final Image MATTRIBUTE = BrowserLabelProvider.loadImage("meta/metaatt.png");

    @objid ("e9cd2dfd-39f6-4c3d-9e76-057c77d4e11b")
    private final Styler metaStyler;

    @objid ("ff45ff5c-3d84-4d5e-bd05-4bfd8e4ec8b3")
    protected final Color METACOLOR = CoreColorRegistry.getColor(new RGB(191,0,255));

    @objid ("de26ae97-3afd-4d1b-9a45-395541462c55")
    private static final Image MCOMPOSITION = BrowserLabelProvider.loadImage("meta/metacomp.png");

    /**
     * Default c'tor.
     */
    @objid ("1eb7b400-ac6d-406e-899b-bf4058354273")
    public SmBrowserLabelProvider() {
        super();
        
        this.metaStyler =  new Styler() {
            @Override
            public void applyStyles(TextStyle textStyle) {
                textStyle.foreground = SmBrowserLabelProvider.this.METACOLOR;
                textStyle.font = BrowserLabelProvider.italicFont;
            }
        };
    }

    @objid ("26f36d73-1260-4ff4-8cdb-731bee2e8a16")
    @Override
    public Image getImage(Object obj) {
        if (obj != null && obj instanceof SmNode) {
            final SmFeature feature = ((SmNode) obj).getFeature();
            if (feature instanceof MAttribute) {
                return MATTRIBUTE;
            } else if (feature instanceof MDependency) {
                return ((MDependency)feature).isComposition()  ? MCOMPOSITION : MDEPENDENCY;
            } else {
                return MDEPENDENCY;
            }
        } else {
            return super.getImage(obj);
        }
    }

    @objid ("cf2ad6c4-67ab-4228-84b5-6724f3fed8e6")
    @Override
    public StyledString getStyledText(Object obj) {
        if (obj != null) {
            if (obj instanceof SmNode) {
                final SmNode node = (SmNode) obj;
                if (node.getFeature() instanceof MAttribute) {
                    SmObjectImpl smObj = (SmObjectImpl) node.getObj();
                    final MAttribute statusSmAtt = smObj.getClassOf().statusAtt();
                    final MAttribute mAtt = (MAttribute) node.getFeature();
        
                    final StyledString s = new StyledString(mAtt.getName(), this.metaStyler);
                    Object attVal = smObj.mGet(mAtt);
                    if (mAtt == statusSmAtt) {
                        long lstatus = smObj.getData().getStatus();
                        String status = SmStatus.toString(lstatus);
                        s.append(String.format(" = %s (%#16X)", status, lstatus));
                    } else {
                        s.append(" = " + attVal);
                    }
                    s.setStyle(0, s.length(), this.metaStyler);
                    s.getStyleRanges();
                    return s;
                }
        
                if (node.getFeature() instanceof MDependency) {
                    final MDependency mDep = (MDependency) node.getFeature();
                    return new StyledString(mDep.getName() + " [" + node.getContent().size() + "]", this.metaStyler);
                }
            } else if (obj instanceof MObject) {
                return super.getStyledText(obj).append(" : ").append(((MObject) obj).getMClass().getName());
            }
        }
        return super.getStyledText(obj);
    }

}
