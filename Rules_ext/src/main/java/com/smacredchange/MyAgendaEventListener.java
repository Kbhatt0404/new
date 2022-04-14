package com.smacredchange;

import javax.inject.Singleton;

import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Singleton
public class MyAgendaEventListener extends DefaultAgendaEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(MyAgendaEventListener.class);


    @Override
    public void afterMatchFired(AfterMatchFiredEvent event) {
        Rule rule = event.getMatch().getRule();
        String ruleName = rule.getName();
        LOG.info("Rule Name fired is '{}'",ruleName);
    }

    

}
