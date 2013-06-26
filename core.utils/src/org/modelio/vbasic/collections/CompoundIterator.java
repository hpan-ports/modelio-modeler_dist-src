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
                                    

package org.modelio.vbasic.collections;

import java.util.Collection;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Iterator that can iterate on many collections.
 * <p>
 * {@link #remove()} does work.
 */
@objid ("ff2d7310-c1ef-11e1-92d5-001ec947ccaf")
public class CompoundIterator<E> implements Iterator<E> {
    @objid ("ff6dd22b-c1ef-11e1-92d5-001ec947ccaf")
    private E next;

    @objid ("ff2d7313-c1ef-11e1-92d5-001ec947ccaf")
    private Iterator<Collection<? extends E>> contentIt;

    @objid ("ff2d7316-c1ef-11e1-92d5-001ec947ccaf")
    private Iterator<? extends E> subIt;

    @objid ("ff2d731a-c1ef-11e1-92d5-001ec947ccaf")
    public CompoundIterator(Collection<Collection<? extends E>> collections) {
        contentIt = collections.iterator();
        walk();
    }

    @objid ("ff2d7321-c1ef-11e1-92d5-001ec947ccaf")
    private void walk() {
        while (subIt == null || !subIt.hasNext()) {
            if (!contentIt.hasNext())
                return;
            subIt = contentIt.next().iterator();
        } 
        next = subIt.next();
    }

    @objid ("ff2d7323-c1ef-11e1-92d5-001ec947ccaf")
    @Override
    public boolean hasNext() {
        return next != null;
    }

    @objid ("ff2d7328-c1ef-11e1-92d5-001ec947ccaf")
    @Override
    public E next() {
        E ret = next;
        walk();
        return ret;
    }

    @objid ("ff2d732d-c1ef-11e1-92d5-001ec947ccaf")
    @Override
    public void remove() {
        subIt.remove();
    }

}
