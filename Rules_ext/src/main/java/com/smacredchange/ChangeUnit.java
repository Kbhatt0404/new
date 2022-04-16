package com.smacredchange;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.RuleUnitData;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@RegisterForReflection
@AllArgsConstructor
public class ChangeUnit implements RuleUnitData {

    private DataStore<ChangeRequest> changerequests;
    private DataStore<ChangeResponse> changeresponses;

    public ChangeUnit() {
        this(DataSource.createStore(), DataSource.createStore());
        ChangeRequest request=new ChangeRequest();
        changerequests.add(request);
        ChangeResponse response=new ChangeResponse();
        changeresponses.add(response);
    }
}
