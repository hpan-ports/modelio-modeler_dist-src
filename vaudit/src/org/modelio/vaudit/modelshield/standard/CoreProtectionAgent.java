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


package org.modelio.vaudit.modelshield.standard;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vaudit.modelshield.CheckStatus;
import org.modelio.vaudit.modelshield.IErrorReport;
import org.modelio.vaudit.modelshield.IProtectionAgent;
import org.modelio.vaudit.modelshield.internal.ShieldContext;
import org.modelio.vaudit.modelshield.standard.checkers.E200Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E201Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E202Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E203Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E204Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E205Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E206Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E207Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E208Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E209Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E210Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E211Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E212Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E213Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E214Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E215Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E216Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E217Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E218Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E219Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E220Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E221Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E222Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E225Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E226Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E227Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E228Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E229Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E230Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E231Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E232Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E233Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E234Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E235Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E236Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E237Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E238Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E239Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E240Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E241Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E242Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E243Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E244Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E245Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E246Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E247Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E248Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E249Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E250Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E251Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E252Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E253Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E254Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E255Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E256Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E257Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E258Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E259Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E260Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E261Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E262Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E263Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E264Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E265Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E266Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E267Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E268Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E269Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E270Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E271Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E272Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E273Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E274Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E275Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E276Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E277Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E278Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E279Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E280Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E282Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E283Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E291Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E292Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E293Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E294Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E295Checker;
import org.modelio.vaudit.modelshield.standard.checkers.E296Checker;
import org.modelio.vaudit.modelshield.standard.execution.ObjectProcessor;
import org.modelio.vaudit.modelshield.standard.execution.TransactionProcessor;
import org.modelio.vaudit.modelshield.standard.plan.Plan;
import org.modelio.vcore.session.impl.transactions.Transaction;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmMetamodel;

/**
 * The CoreProtectionAgent is in charge of checking the model against the
 * standard metamodel.
 * 
 * @author phv
 */
@objid ("007812d4-f0b6-1f4c-b2b8-001ec947cd2a")
public class CoreProtectionAgent implements IProtectionAgent {
    @objid ("00079e32-09c6-1f4d-b2b8-001ec947cd2a")
    private final Plan plan;

    @objid ("0008c9ec-09c6-1f4d-b2b8-001ec947cd2a")
    public CoreProtectionAgent(SmMetamodel smMetamodel) {
        this.plan = new Plan();
        initCheckers(this.plan, smMetamodel);
    }

    @objid ("0008e1a2-09c6-1f4d-b2b8-001ec947cd2a")
    @Override
    public String getId() {
        return "CORE";
    }

    @objid ("00090a60-09c6-1f4d-b2b8-001ec947cd2a")
    @Override
    public Plan getPlan() {
        return this.plan;
    }

    @objid ("00095a60-09c6-1f4d-b2b8-001ec947cd2a")
    @Override
    public CheckStatus check(final Transaction theTransaction, final IErrorReport report) {
        ShieldContext context = new ShieldContext(report);
        
        TransactionProcessor v = new TransactionProcessor(this.plan);
        v.check(theTransaction, context);
        return report.getEntries().isEmpty() ? CheckStatus.Success : CheckStatus.Fail;
    }

    @objid ("00098cba-09c6-1f4d-b2b8-001ec947cd2a")
    @Override
    public CheckStatus check(final MObject obj, final IErrorReport report) {
        if (!(obj instanceof Element)) {
            // the core protection agent has nothing to say about non-Element objects
            return CheckStatus.Success;
        }
        
        ShieldContext context = new ShieldContext(report);
        
        ObjectProcessor v = new ObjectProcessor(context, this.plan);
        v.check(obj);
        return report.getEntries().isEmpty() ? CheckStatus.Success : CheckStatus.Fail;
    }

    @objid ("0009beb0-09c6-1f4d-b2b8-001ec947cd2a")
    @Override
    public boolean isInScope(final MObject object) {
        // FIXME: better implementation
        return true;
    }

    @objid ("00824da8-d6c6-1f60-8473-001ec947cd2a")
    private static void initCheckers(final Plan plan, SmMetamodel smMetamodel) {
        new E200Checker().register(plan, smMetamodel);
        new E201Checker().register(plan, smMetamodel);
        new E202Checker().register(plan, smMetamodel);
        new E203Checker().register(plan, smMetamodel);
        new E204Checker().register(plan, smMetamodel);
        new E205Checker().register(plan, smMetamodel);
        new E206Checker().register(plan, smMetamodel);
        new E207Checker().register(plan, smMetamodel);
        new E208Checker().register(plan, smMetamodel);
        new E209Checker().register(plan, smMetamodel);
        new E210Checker().register(plan, smMetamodel);
        new E211Checker().register(plan, smMetamodel);
        new E212Checker().register(plan, smMetamodel);
        new E213Checker().register(plan, smMetamodel);
        new E214Checker().register(plan, smMetamodel);
        new E215Checker().register(plan, smMetamodel);
        new E216Checker().register(plan, smMetamodel);
        new E217Checker().register(plan, smMetamodel);
        new E218Checker().register(plan, smMetamodel);
        new E219Checker().register(plan, smMetamodel);
        new E220Checker().register(plan, smMetamodel);
        new E221Checker().register(plan, smMetamodel);
        new E222Checker().register(plan, smMetamodel);
        new E225Checker().register(plan, smMetamodel);
        new E226Checker().register(plan, smMetamodel);
        new E227Checker().register(plan, smMetamodel);
        new E228Checker().register(plan, smMetamodel);
        new E229Checker().register(plan, smMetamodel);
        new E230Checker().register(plan, smMetamodel);
        new E231Checker().register(plan, smMetamodel);
        new E232Checker().register(plan, smMetamodel);
        new E233Checker().register(plan, smMetamodel);
        new E234Checker().register(plan, smMetamodel);
        new E235Checker().register(plan, smMetamodel);
        new E236Checker().register(plan, smMetamodel);
        new E237Checker().register(plan, smMetamodel);
        new E238Checker().register(plan, smMetamodel);
        new E239Checker().register(plan, smMetamodel);
        new E240Checker().register(plan, smMetamodel);
        new E241Checker().register(plan, smMetamodel);
        new E242Checker().register(plan, smMetamodel);
        new E243Checker().register(plan, smMetamodel);
        new E244Checker().register(plan, smMetamodel);
        new E245Checker().register(plan, smMetamodel);
        new E246Checker().register(plan, smMetamodel);
        new E247Checker().register(plan, smMetamodel);
        new E248Checker().register(plan, smMetamodel);
        new E249Checker().register(plan, smMetamodel);
        new E250Checker().register(plan, smMetamodel);
        new E251Checker().register(plan, smMetamodel);
        new E252Checker().register(plan, smMetamodel);
        new E253Checker().register(plan, smMetamodel);
        new E254Checker().register(plan, smMetamodel);
        new E255Checker().register(plan, smMetamodel);
        new E256Checker().register(plan, smMetamodel);
        new E257Checker().register(plan, smMetamodel);
        new E258Checker().register(plan, smMetamodel);
        new E259Checker().register(plan, smMetamodel);
        new E260Checker().register(plan, smMetamodel);
        new E261Checker().register(plan, smMetamodel);
        new E262Checker().register(plan, smMetamodel);
        new E263Checker().register(plan, smMetamodel);
        new E264Checker().register(plan, smMetamodel);
        new E265Checker().register(plan, smMetamodel);
        new E266Checker().register(plan, smMetamodel);
        new E267Checker().register(plan, smMetamodel);
        new E268Checker().register(plan, smMetamodel);
        new E269Checker().register(plan, smMetamodel);
        new E270Checker().register(plan, smMetamodel);
        new E271Checker().register(plan, smMetamodel);
        new E272Checker().register(plan, smMetamodel);
        new E273Checker().register(plan, smMetamodel);
        new E274Checker().register(plan, smMetamodel);
        new E275Checker().register(plan, smMetamodel);
        new E276Checker().register(plan, smMetamodel);
        new E277Checker().register(plan, smMetamodel);
        new E278Checker().register(plan, smMetamodel);
        new E279Checker().register(plan, smMetamodel);
        new E280Checker().register(plan, smMetamodel);
        new E282Checker().register(plan, smMetamodel);
        new E283Checker().register(plan, smMetamodel);
        //        new E284Checker().register(plan, smMetamodel);
        //        new E285Checker().register(plan, smMetamodel);
        //        new E286Checker().register(plan, smMetamodel);
        //        new E287Checker().register(plan, smMetamodel);
        //        new E288Checker().register(plan, smMetamodel);
        //        new E289Checker().register(plan, smMetamodel);
        //        new E290Checker().register(plan, smMetamodel);
        new E291Checker().register(plan, smMetamodel);
        new E292Checker().register(plan, smMetamodel);
        new E293Checker().register(plan, smMetamodel);
        new E294Checker().register(plan, smMetamodel);
        new E295Checker().register(plan, smMetamodel);
        new E296Checker().register(plan, smMetamodel);
    }

}
