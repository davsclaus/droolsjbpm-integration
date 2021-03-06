/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.container.spring;

import org.kie.event.rule.AfterMatchFiredEvent;
import org.kie.event.rule.AgendaEventListener;
import org.kie.event.rule.AgendaGroupPoppedEvent;
import org.kie.event.rule.AgendaGroupPushedEvent;
import org.kie.event.rule.BeforeMatchFiredEvent;
import org.kie.event.rule.MatchCancelledEvent;
import org.kie.event.rule.MatchCreatedEvent;
import org.kie.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.event.rule.RuleFlowGroupDeactivatedEvent;


public class MockAgendaEventListener implements AgendaEventListener {

    public void matchCreated(MatchCreatedEvent matchCreatedEvent) {
        System.out.println("MockAgendaEventListener:: matchCreated");
    }

    public void matchCancelled(MatchCancelledEvent matchCancelledEvent) {
        System.out.println("MockAgendaEventListener:: matchCancelled");
    }

    public void beforeMatchFired(BeforeMatchFiredEvent beforeMatchFiredEvent) {
        System.out.println("MockAgendaEventListener:: beforeMatchFired");
        SpringDroolsListenersTest.incrementValueFromListener();
    }

    public void afterMatchFired(AfterMatchFiredEvent afterMatchFiredEvent) {
        System.out.println("MockAgendaEventListener:: afterMatchFired");
    }

    public void agendaGroupPopped(AgendaGroupPoppedEvent agendaGroupPoppedEvent) {
        System.out.println("MockAgendaEventListener:: agendaGroupPopped");
    }

    public void agendaGroupPushed(AgendaGroupPushedEvent agendaGroupPushedEvent) {
        System.out.println("MockAgendaEventListener:: agendaGroupPushed");
    }

    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println("MockAgendaEventListener:: beforeRuleFlowGroupActivated");
    }

    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println("MockAgendaEventListener:: afterRuleFlowGroupActivated");
    }

    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println("MockAgendaEventListener:: beforeRuleFlowGroupDeactivated");
    }

    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println("MockAgendaEventListener:: afterRuleFlowGroupDeactivated");
    }

}
