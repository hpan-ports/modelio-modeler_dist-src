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
                                    

package org.modelio.audit.preferences.model;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5dee0e78-97c3-42cb-9aaf-fb8a86256294")
public class AuditCategory {
    @objid ("32f2cc5d-90f4-4cd5-b330-17af3baccdd4")
    private String name;

    @objid ("a836f660-1c6c-403c-8aa7-9293ee4ced33")
    private List<AuditRule> rules;

    @objid ("dd86bc9d-fcea-431c-8d95-a8ff8ae67480")
    public AuditCategory(String categoryName) {
        this.rules = new ArrayList<>();
        this.name = categoryName;
    }

    @objid ("8b55405a-7b63-4fe8-beda-96d41cbb0aa0")
    public void add(AuditRule rulePref) {
        this.rules.add(rulePref);
    }

    @objid ("9102932c-a9bc-43da-84c5-912b1cd6b158")
    public List<AuditRule> getRules() {
        return this.rules;
    }

    @objid ("60e9623b-a3ff-4c1a-90de-bc64ebab1f4b")
    public String getName() {
        return this.name;
    }

}
