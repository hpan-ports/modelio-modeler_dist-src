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


package org.modelio.patterns.engine;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.modelio.patterns.api.IPatternService;

/**
 * This class is used as a processor (see the plugin.xml file) to make the
 * injection framework instantiate the Pattern service and put it in the context.
 */
@objid ("fdcd50ea-d6c8-4d2a-8ddd-2e856b96a1b6")
class PatternServiceInitializer {
    @objid ("7999b23b-d0c2-4aae-bcee-dfd62cfa2c3a")
    @Execute
    public void execute(IEclipseContext context) {
        context.set(IPatternService.class, ContextInjectionFactory.make(PatternService.class, context));
    }

    /**
     * Default c'tor.
     */
    @objid ("608a9efe-0555-4976-b855-af1e14b29100")
    public PatternServiceInitializer() {
        // Nothing to do
    }

}
