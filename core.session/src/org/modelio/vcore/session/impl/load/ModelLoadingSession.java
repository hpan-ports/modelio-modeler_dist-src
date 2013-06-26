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
                                    

package org.modelio.vcore.session.impl.load;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.impl.storage.IModelLoader;
import org.modelio.vcore.session.impl.storage.IModelLoadingSession;
import org.modelio.vcore.session.impl.storage.IModelRefresher;

/**
 * {@link IModelLoadingSession} implementation.
 * <p>
 * There are many concurrent instances of this class for a IRepository instance.
 * These instances are returned by {@link ModelLoaderProvider#beginLoadSession()} and
 * they are maintained by {@link ModelLoadingSessionManager}.
 */
@objid ("57c47f43-439a-11e2-91c9-001ec947ccaf")
class ModelLoadingSession implements IModelLoadingSession {
    @objid ("e393100f-9d0a-481c-967e-a6049dd08558")
    private ModelLoader loader;

    @objid ("581e2f2b-4ef5-4b8b-a8d5-9509951e9257")
    private ModelRefresher refresher;

    @objid ("420cb40f-bde6-4068-90da-2ac65baae0ea")
    private ModelLoaderProvider owner;

    @objid ("1e204d2b-4379-4ffe-ac1f-d80ca9d55127")
    private ModelLoaderConfiguration loaderConfig;

    @objid ("67aa2e9d-43a3-11e2-91c9-001ec947ccaf")
    ModelLoadingSession(ModelLoaderConfiguration loaderConfig, ModelLoaderProvider owner) {
        this.owner = owner;
        this.loaderConfig = loaderConfig;
    }

    @objid ("67aa2ea6-43a3-11e2-91c9-001ec947ccaf")
    @Override
    public void close() {
        if (this.loader != null)
            this.loader.close();
        
        if (this.refresher != null) {
            // Nullify the refresher to avoid calling close() for nothing next times,
            // it is used much less often than ModelLoader.
            // The #getRefresher() will instantiate another one if needed.
            this.refresher.close();
            this.refresher = null;
        }
        
        this.owner.sessionClosed(this);
    }

    @objid ("67aa2ea9-43a3-11e2-91c9-001ec947ccaf")
    @Override
    public IModelLoader getLoader() {
        if (this.loader==null)
            this.loader = new ModelLoader(this.loaderConfig);
        return this.loader;
    }

    @objid ("67aa2eae-43a3-11e2-91c9-001ec947ccaf")
    @Override
    public IModelRefresher getRefresher() {
        if (this.refresher == null)
            this.refresher = new ModelRefresher(this.loaderConfig);
        return this.refresher;
    }

}
