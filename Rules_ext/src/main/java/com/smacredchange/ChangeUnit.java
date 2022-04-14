package com.smacredchange;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.RuleUnitData;
import org.kie.kogito.rules.SingletonStore;

public class ChangeUnit implements RuleUnitData {

    private SingletonStore<ChangeRequest> changerequest = DataSource.createSingleton();
    private SingletonStore<ChangeResponse> ChangeResponse= DataSource.createSingleton();
    


    public SingletonStore<ChangeRequest> getChangerequest() {
        return changerequest;
    }

    public void setChangeRequest(SingletonStore<ChangeRequest> changerequest) {
        this.changerequest = changerequest;
    }

    public SingletonStore<ChangeResponse> getChangeResponse() {
        return ChangeResponse;
    }

    public void setChangeResponse(SingletonStore<ChangeResponse> changeResponse) {
        ChangeResponse = changeResponse;
    }

    
}
