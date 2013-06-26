/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.diagram.dg;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.IDiagramNode;

/**
 * This class represents a diagram graphic for the diagram itself.
 */
@objid ("55f641c9-6b43-11e0-b0b9-002564c97630")
public interface IDiagramDG extends IDiagramNode {
    /**
     * Return the list of children links of this diagram.
     * @return A list of links in any case, possibly an empty one. Never returns null
     */
    @objid ("55f668da-6b43-11e0-b0b9-002564c97630")
    List<IDiagramLink> getLinks();

}
