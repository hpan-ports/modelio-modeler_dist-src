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


package org.modelio.patterns.plugin;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.script.engine.core.engine.IClassLoaderProvider;

/**
 * Class loader provider for Jython script engine.
 * <p>
 * Gives the Patterns plugin class loader.
 */
@objid ("bb3981f2-ff43-4da0-875f-66eeda7d0426")
public class PatternsClassLoaderProvider implements IClassLoaderProvider {
    @objid ("cdc92d5b-eff2-43fe-8028-0fd799556fb9")
    @Override
    public ClassLoader getClassLoader() {
        return Patterns.class.getClassLoader();
    }

}
