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
                                    

package org.modelio.gproject.gproject;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.fragment.IProjectFragment;

/**
 * Event in the GProject life cycle.
 */
@objid ("8e7a0917-08b2-11e2-b193-001ec947ccaf")
public class GProjectEvent {
    /**
     * The event type.
     */
    @objid ("618b7790-08b6-11e2-b193-001ec947ccaf")
    public GProjectEventType type;

    /**
     * An event message.
     */
    @objid ("618dd9df-08b6-11e2-b193-001ec947ccaf")
    public String message;

    /**
     * The fragment concerned by the event. May be <code>null</code>.
     */
    @objid ("6181ee38-08b6-11e2-b193-001ec947ccaf")
    public IProjectFragment fragment;

    /**
     * An optional exception.
     */
    @objid ("6181ee3a-08b6-11e2-b193-001ec947ccaf")
    public Throwable throwable;

    /**
     * Instantiate an event for a fragment down event.
     * @param abstractFragment the fragment that went down.
     * @return the event.
     */
    @objid ("6181ee3e-08b6-11e2-b193-001ec947ccaf")
    public static GProjectEvent FragmentDownEvent(IProjectFragment abstractFragment) {
        GProjectEvent ev = new GProjectEvent();
        ev.fragment = abstractFragment;
        ev.message = abstractFragment.getDownError().getLocalizedMessage();
        ev.throwable = abstractFragment.getDownError();
        ev.type = GProjectEventType.FRAGMENT_DOWN;
        return ev;
    }

    /**
     * Instantiate a warning event for a fragment.
     * @param f the fragment
     * @param e an exception
     * @return the built warning
     */
    @objid ("6181ee44-08b6-11e2-b193-001ec947ccaf")
    public static GProjectEvent buildWarning(IProjectFragment f, Throwable e) {
        GProjectEvent ev = new GProjectEvent();
        ev.message = e.getLocalizedMessage();
        ev.fragment = f;
        ev.throwable = e;
        ev.type = GProjectEventType.WARNING;
        return ev;
    }

    /**
     * Instantiate a warning event for the project.
     * @param e an exception
     * @return the built warning
     */
    @objid ("6181ee4a-08b6-11e2-b193-001ec947ccaf")
    public static GProjectEvent buildWarning(Exception e) {
        GProjectEvent ev = new GProjectEvent();
        ev.message = e.getLocalizedMessage();
        ev.throwable = e;
        ev.type = GProjectEventType.WARNING;
        return ev;
    }

}
