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
                                    

package org.modelio.app.project.core.creation;

import java.io.File;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.osgi.framework.Version;

/**
 * Placeholder to avoid compilation errors...
 * @author chm
 */
@objid ("0044a0b6-cc35-1ff2-a7f4-001ec947cd2a")
public class MdacArchiveInfo {
    @objid ("0048eb30-cc35-1ff2-a7f4-001ec947cd2a")
    public boolean licenseRequired;

    @objid ("0048ebf8-cc35-1ff2-a7f4-001ec947cd2a")
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("0048ec98-cc35-1ff2-a7f4-001ec947cd2a")
    public ClassWithPath getArchive() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("00472b2e-cc35-1ff2-a7f4-001ec947cd2a")
    public Version getVersion() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("00472bc4-cc35-1ff2-a7f4-001ec947cd2a")
    public List<Object> getRequiredMdacs() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("00472c5a-cc35-1ff2-a7f4-001ec947cd2a")
    public class ClassWithPath {
        @objid ("0048e5e0-cc35-1ff2-a7f4-001ec947cd2a")
        public File getPath() {
            // TODO Auto-generated method stub
            return null;
        }

    }

}
