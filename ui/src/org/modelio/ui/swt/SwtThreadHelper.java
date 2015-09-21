/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.ui.swt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.ui.plugin.UI;

/**
 * Helper service to create proxy objects that run all methods in the SWT Display thread.
 * <p>
 * This helper may be used to proxy model listeners so that listener methods are called in the SWT thread.
 * 
 * @author cmarin
 * @since 3.4
 */
@objid ("de38fcad-0be4-450b-a85d-d20dc3383519")
public class SwtThreadHelper {
    /**
     * Proxy an object so that the given interface methods are called in the display thread
     * using {@link Display#syncExec(Runnable)}.
     * <p>
     * As the call is synchronous, the return parameter and all thrown exceptions are sent back to the caller.
     * @param d the SWT display
     * @param target the object to proxy
     * @param interfaceToProxy the object interface to proxy
     * @return a proxy object that dispatch all interface method calls in the SWT thread
     */
    @objid ("882c3d6d-709f-48b0-9a67-fa59fd7b99b9")
    @SuppressWarnings("unchecked")
    public static <T> T syncProxy(Display d, final T target, Class<T> interfaceToProxy) {
        return (T) Proxy.newProxyInstance
                  (target.getClass().getClassLoader(),
                        new Class[] { interfaceToProxy },
                        new InvocationHandler() {
                            @Override
                            public Object invoke(Object proxy, Method method,
                              Object[] args) throws Throwable {
        
                                Throwable[] t = {null};
                                Object[] ret = {null};
        
                                d.syncExec( () -> {
                                    try {
                                        ret[0] = method.invoke(target, args);
                                    } catch (IllegalAccessException | InvocationTargetException | RuntimeException e) {
                                        t[0] = e;
                                    }
                                });
        
                                if (t[0] != null) {
                                    throw t[0];
                                }
        
                                return ret[0];
                            }
                        });
    }

    /**
     * Proxy an object so that the given interface methods are called in the display thread
     * using {@link Display#asyncExec(Runnable)}.
     * <p>
     * As the call is asynchronous, calls to the proxy methods will always return <i>null</i> and
     * exceptions throw by the target object will simply be logged.
     * @param d the SWT display
     * @param target the object to proxy
     * @param interfaceToProxy the object interface to proxy
     * @return a proxy object that dispatch all interface method calls in the SWT thread
     */
    @objid ("c94dedec-9b88-40ea-b219-93f3affbf067")
    @SuppressWarnings("unchecked")
    public static <T> T asyncProxy(Display d, final T target, Class<T> interfaceToProxy) {
        return (T) Proxy.newProxyInstance
                  (target.getClass().getClassLoader(),
                        new Class[] { interfaceToProxy },
                        new InvocationHandler() {
                            @Override
                            public Object invoke(Object proxy, Method method,
                              Object[] args) throws Throwable {
        
                                d.asyncExec( () -> {
                                    try {
                                        method.invoke(target, args);
                                    } catch (IllegalAccessException | InvocationTargetException | RuntimeException | LinkageError e) {
                                        UI.LOG.warning(e);
                                    }
                                });
        
                                return null;
                            }
                        });
    }

}
