package org.modelio.api.impl.exchange;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.modelio.api.exchange.IExchangeService;
import org.modelio.api.exchange.XmiException;
import org.modelio.api.exchange.XmiExportConfiguration;
import org.modelio.api.exchange.XmiImportConfiguration;

@objid ("e29dd4a2-f42e-4042-89a9-78d6b1b6db15")
public class ExchangeService implements IExchangeService {
    @objid ("b305a0a6-6a0c-4b7d-a58f-489ee0a9c977")
    @Override
    public void exportXmiFile(final XmiExportConfiguration configuration, final IProgressMonitor monitor) throws XmiException {
        //        ExportConfiguration exportConf = new ExportConfiguration();
        //        IPackage entryPoint = configuration.getEntryPoint();
        //        exportConf.setEntryPoint(entryPoint);
        //        exportConf.setExportedAnotation(configuration.isExportAnnotations());
        //        exportConf.setVersionExport(VersionExport.valueOf(configuration.getVersionExport().name()));
        //        exportConf.setXmiFile(configuration.getXmiFile());
        //        
        //        try {
        //            if (entryPoint instanceof IProfile) {
        //                XMI.getInstance().exportXMIProfile(exportConf);
        //            } else {
        //                XMI.getInstance().exportXMIFile(exportConf);
        //            }
        //        } catch (Exception e) {
        //            throw new XmiException(e);
        //        }
        // TODO exportXmiFile
        throw new UnsupportedOperationException();
    }

    @objid ("9433ced9-94a0-49b5-a64b-5d71b9148f83")
    @Override
    public void importXmiFile(final XmiImportConfiguration configuration, final IProgressMonitor monitor) throws XmiException {
        //        ImportConfiguration importConf = new ImportConfiguration();
        //        Element owner = configuration.getOwner();
        //        importConf.setOwner(owner);
        //        importConf.setXmiFile(configuration.getXmiFile());
        //        
        //        try {
        //            if (owner instanceof IModule) {
        //                XMI.getInstance().importXMIProfile(importConf);
        //            } else if (owner instanceof IPackage) {
        //                XMI.getInstance().importXMIModel(importConf);
        //            } else {
        //                throw new XmiException("Owner must be an IPackage or an IModule");
        //            }
        //        } catch (Exception e) {
        //            throw new XmiException(e);
        //        }
        // TODO importXmiFile
        throw new UnsupportedOperationException();
    }

}
