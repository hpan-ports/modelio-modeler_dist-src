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

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.impl.storage.IModelLoaderProvider;
import org.modelio.vcore.session.impl.storage.IModelLoadingSession;

/**
 * Implementation of {@link IModelLoaderProvider}.
 * <p>
 * Handles a concurrent pool of {@link ModelLoadingSession} and
 * provides the first free one in {@link #beginLoadSession()}.
 */
@objid ("a55c7527-1a03-11e2-8eb9-001ec947ccaf")
public class ModelLoaderProvider implements IModelLoaderProvider {
    @objid ("b42ab8d9-a2ba-4f87-bd56-95d820c702d6")
    private Queue<ModelLoadingSession> sessionPool;

    @objid ("ec10b3aa-88ee-47f4-a299-96858cfffa9e")
    private ModelLoaderConfiguration loaderConfig;

    /**
     * Initialize the model loader provider.
     * @param loaderConfig The model loaders configuration.
     */
    @objid ("7dc20091-1c43-11e2-8eb9-001ec947ccaf")
    public ModelLoaderProvider(ModelLoaderConfiguration loaderConfig) {
        this.sessionPool = new ConcurrentLinkedQueue<>();
        this.loaderConfig = loaderConfig;
    }

    @objid ("f69ee879-3948-11e2-920a-001ec947ccaf")
    @Override
    public short getKid() {
        return this.loaderConfig.getKid();
    }

    @objid ("1fc5fb7a-3a2d-11e2-bf6c-001ec947ccaf")
    @Override
    public IModelLoadingSession beginLoadSession() {
        ModelLoadingSession ret = this.sessionPool.poll();
        if (ret == null) {
            return new ModelLoadingSession(this.loaderConfig, this);
        }
        return ret;
    }

    /**
     * Called by {@link ModelLoadingSession#close()}
     * @param repositoryLoadingSession the closed loading session.
     */
    @objid ("4f2127a9-5c15-4b11-b686-b8c64f684a0c")
    public void sessionClosed(ModelLoadingSession repositoryLoadingSession) {
        this.sessionPool.add(repositoryLoadingSession);
    }

}
