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
                                    

package org.modelio.admtool.plugin;

import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.modelio.log.writers.PluginLogger;
import org.modelio.ui.i18n.BundledMessages;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

@objid ("7b8c48a2-df35-403b-932e-a4f61d53081a")
public class AmdTool extends AbstractUIPlugin {
    @objid ("e2716058-3977-498f-9b2a-c777c1ea38bc")
    public static final String PLUGIN_ID = "org.modelio.admtool"; // $NON-NLS-1$

    @objid ("6b854323-7ef8-44c4-bbae-3d13e9c560dc")
    public static PluginLogger LOG;

    @objid ("43bf0ae9-4a89-4a83-8548-117954a1362f")
    public static BundledMessages I18N;

    @objid ("cb9a1f2c-e4b5-485d-a77a-86b9b4be84b5")
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        ServiceReference<ExtendedLogService> ref = bundleContext.getServiceReference(ExtendedLogService.class);
        ExtendedLogService service = bundleContext.getService(ref);
        LOG = new PluginLogger(service.getLogger(null));
        I18N = new BundledMessages(LOG, ResourceBundle.getBundle("admtool"));
    }

    @objid ("6f31e588-eb44-4353-870c-029b3b6178be")
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        // Nothing to do
    }

}
