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


package org.modelio.vcore.smkernel.meta;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.EnumSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

/**
 * Base element for the SmXXXX hierarchy.
 * A <pre>SmElement</pre> has a name.
 * 
 * The SmXXXX hierarchy is used to describe the metamodel metaclasses.
 * 
 * @author phv
 */
@objid ("00843500-ed97-1f1f-85a5-001ec947cd2a")
public abstract class SmElement {
    /**
     * boolean semantic directives
     */
    @objid ("0083e5e6-ed97-1f1f-85a5-001ec947cd2a")
    protected EnumSet<SmDirective> smFlags = EnumSet.noneOf(SmDirective.class);

    @objid ("0083e6f4-ed97-1f1f-85a5-001ec947cd2a")
    @SuppressWarnings("boxing")
    @Deprecated
    protected void initSmFlags(final Annotation a) {
        for (SmDirective directive : SmDirective.values()) {
        
            try {
                Method method = a.getClass().getDeclaredMethod(directive.name().toLowerCase());
                if (Boolean.class.isAssignableFrom(method.getReturnType())) {
                    if ((Boolean) method.invoke(a)) {
                        this.smFlags.add(directive);
                    }
                }
        
            } catch (SecurityException e) {
               throw new Error(e);
            } catch (NoSuchMethodException e) {
                // the directive does not exist for the Annotation, ignore it
            } catch (IllegalArgumentException e) {
                throw new Error(e);
            } catch (IllegalAccessException e) {
                throw new Error(e);
            } catch (InvocationTargetException e) {
                throw new Error(e);
            }
        }
    }

    /**
     * @param flag a flag
     * @return whether the metamodel element has the given annotation.
     */
    @objid ("0083e79e-ed97-1f1f-85a5-001ec947cd2a")
    public boolean hasDirective(final SmDirective flag) {
        return this.smFlags.contains(flag);
    }

    /**
     * @return the meta element name.
     */
    @objid ("60f6f5d9-9b6a-11e1-94a3-001ec947ccaf")
    public abstract String getName();

    @objid ("d47516d7-30aa-4074-9db3-1b411bd9890b")
    protected void initSmFlags(Collection<SmDirective> dirs) {
        this.smFlags.addAll(dirs);
    }

}
