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


package org.modelio.gproject.fragment.migration;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.fragment.FragmentAuthenticationException;
import org.modelio.vbasic.progress.IModelioProgress;

/**
 * API for SVN fragment migrators.
 */
@objid ("54484a75-ecba-47ae-842f-c0071c787258")
public interface IFragmentMigrator {
    /**
     * Run the migration
     * @param monitor a progress monitor
     * @param reporter an object to report migration process and result to.
     * @throws org.modelio.gproject.fragment.FragmentAuthenticationException on authentication error
     * @throws org.modelio.gproject.fragment.migration.MigrationFailedException on failure
     */
    @objid ("26d5e2ea-e12c-4cda-804c-7c5b1acf5903")
    void run(IModelioProgress monitor, IMigrationReporter reporter) throws FragmentAuthenticationException, MigrationFailedException;

}
