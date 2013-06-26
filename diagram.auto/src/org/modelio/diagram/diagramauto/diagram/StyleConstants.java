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
                                    

package org.modelio.diagram.diagramauto.diagram;

import java.net.URL;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.modelio.api.diagram.style.IStyleHandle;
import org.modelio.diagram.diagramauto.plugin.DiagramAuto;
import org.modelio.diagram.styles.plugin.DiagramStyles;

@objid ("5dc7cf70-82d4-4460-8470-d8dd45e37c84")
public class StyleConstants {
    @objid ("52e94d19-ece6-47c9-9c75-b3bd38d37bf9")
    public static final String DEFAULT = "default";

    @objid ("e4546265-f81d-4d33-91bf-071f52ac7029")
    public static final String MAIN = "main";

    @objid ("7da1e9fb-1560-40dd-b46b-c05c36ac68cd")
    public static final String EXTERN = "extern";

    @objid ("880a0009-d362-4a4c-b49c-8ce555781eb1")
    public static final String INTERN = "intern";

    @objid ("0f49f252-dcae-4382-b2e0-2c46f9f59e80")
    public static final String RAMC = "ramc";

    @objid ("f73e5d53-75c6-46aa-aed2-62d89effb324")
    public static IStyleHandle getStyleHandle(final String styleName) {
        if (DiagramStyles.getStyleManager().getStyle(StyleConstants.EXTERN) == null) {
            URL url = FileLocator.find(DiagramAuto.context.getBundle(), new Path("res/style/extern.style"), null);
            if (url != null) {
                DiagramStyles.getStyleManager().createStyle("extern", "default", url);
            }
        }
        
        if (DiagramStyles.getStyleManager().getStyle(StyleConstants.INTERN) == null) {
            URL url  = FileLocator.find(DiagramAuto.context.getBundle(), new Path("res/style/intern.style"), null);
            if (url != null) {
                DiagramStyles.getStyleManager().createStyle("intern", "default", url);
            }
        }
        
        if (DiagramStyles.getStyleManager().getStyle(StyleConstants.MAIN) == null) {
            URL url =  FileLocator.find(DiagramAuto.context.getBundle(), new Path("res/style/main.style"), null);
            if (url != null) {
                DiagramStyles.getStyleManager().createStyle("main", "default", url);
            }
        }
        return new DiagramStyleHandle(styleName);
    }

}
