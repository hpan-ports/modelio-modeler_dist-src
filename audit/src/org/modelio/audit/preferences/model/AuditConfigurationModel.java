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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Manage a set of RulePref objects
 */
@objid ("cdb4ddee-3343-4c5e-a946-b75d7831e450")
public class AuditConfigurationModel {
    @objid ("8de3a60a-149b-46d4-baee-dcdaf98b585b")
    private SortedMap<String, AuditCategory> categories;

    @objid ("e8cca3d0-bdef-4228-ac8f-5f71e7fe6971")
    private Map<String, AuditRule> rulesById;

    @objid ("9a09fa7e-3563-4daa-9a6f-cca8bc956e57")
    public AuditConfigurationModel() {
        this.categories = new TreeMap();
        this.rulesById = new HashMap<>();
    }

    /**
     * @param rulePref the rulePref to add
     */
    @objid ("4720dd93-0e5a-49b4-82b7-0dd9648ebafc")
    public void add(AuditRule rulePref) {
        AuditCategory category = this.categories.get(rulePref.category);
        
        if(category == null){
            category = new AuditCategory(rulePref.category);
            this.categories.put(rulePref.category, category);
        }
        category.add(rulePref);
        
        this.rulesById.put(rulePref.ruleId, rulePref);
    }

    @objid ("9b534d19-86a7-49fc-9ccb-84e55dbaf9c5")
    public Collection<AuditCategory> getCategories() {
        return this.categories.values();
    }

    @objid ("835caa71-750a-4a02-96e0-08755636e4e5")
    public Collection<AuditCategory> AuditRule() {
        return this.categories.values();
    }

    @objid ("bd3cb4ed-cee1-418a-b89f-1dbb1d952f79")
    public List<AuditRule> getRules() {
        List<AuditRule>  result = new ArrayList<>();
        for(AuditCategory category : this.categories.values()){
            result.addAll(category.getRules());
        }
        return result;
    }

    @objid ("33a1d265-c00f-4d65-a68c-4979b588f990")
    public AuditRule get(String ruleId) {
        return this.rulesById.get(ruleId);
    }

}
