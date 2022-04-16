package com.smacredchange;

import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.RuleUnitData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class ReasonUnit implements RuleUnitData{
    private DataStore<ReasonRequest> reasonrequest;
    private DataStore<ReasonResponse> reasonresponse;
    public ReasonUnit(){
        this(DataSource.createStore(),DataSource.createStore());
        ReasonResponse response=new ReasonResponse();
        reasonresponse.add(response);
    }
}
