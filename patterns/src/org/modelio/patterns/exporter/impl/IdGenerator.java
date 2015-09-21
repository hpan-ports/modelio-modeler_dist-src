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

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("90021636-add4-4e37-b4b4-f78217cd1ab8")
class IdGenerator {
    @objid ("221b6cf0-4580-402a-87e5-dc0f92dfc8a6")
    private int id;

    @objid ("96826af7-9990-4da7-9c8b-0352c2170638")
    private Map<MObject, Integer> idMap;

    @objid ("267fa894-957d-40c8-b0c2-2e22c70a2eab")
    private static final IdGenerator INSTANCE = new IdGenerator();

    @objid ("5bc5aec1-aa37-4547-8686-fd5fdd06a2c4")
    public void reset() {
        this.idMap.clear();
        this.id = -1;
    }

    @objid ("e675567b-74fb-45f3-a43f-9d6c027810af")
    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    @objid ("2bbb705d-c6f2-4ee7-8383-3610af7acd62")
    private IdGenerator() {
        this.idMap = new HashMap<>();
        this.id = -1;
    }

    @objid ("4e766608-34c2-4d35-8ab3-4f436a56804a")
    public int getId(MObject element) {
        Integer idStr = this.idMap.get(element);
        
        if (idStr == null) {
            idStr = ++this.id;
            this.idMap.put(element, idStr);
        }
        return idStr;
    }

    @objid ("e787a9be-dd92-4910-ab51-11e28490e901")
    public boolean exists(MObject element) {
        return this.idMap.containsKey(element);
    }

    @objid ("47b3a937-3a15-4f87-aa85-b9ff8207cf76")
    public String computeNextId() {
        return "node_" + String.valueOf(++this.id);
    }

}
