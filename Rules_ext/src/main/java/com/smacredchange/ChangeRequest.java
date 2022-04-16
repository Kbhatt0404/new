package com.smacredchange;

import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;
@Getter
@RegisterForReflection
public class ChangeRequest {

    private String changeType;
    private ChangeResponse response;
    /**
     * @return the changeType
     */
    public String getChangeType() {
        return changeType;
    }
    /**
     * @param changeType the changeType to set
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

}
