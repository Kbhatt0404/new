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
public class DocUnit implements RuleUnitData{
    private DataStore<DocRequest> docrequest;
    private DataStore<DocResponse> docresponse;
    public DocUnit(){
        this(DataSource.createStore(),DataSource.createStore());
        DocResponse response =new DocResponse();
        docresponse.add(response);
    }
    
}
