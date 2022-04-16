package com.smacredchange;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
public class ReasonRequest {
    private int reasonId;

    /**
     * @return the reasonId
     */
    public int getReasonId() {
        return reasonId;
    }

    /**
     * @param reasonId the reasonId to set
     */
    public void setReasonId(int reasonId) {
        this.reasonId = reasonId;
    }

}
