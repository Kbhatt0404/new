package com.smacredchange;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@RegisterForReflection
public class ChangeResponse implements Serializable{

    private List<Integer> requestIdList;
    private String changeType;
    private List<ReasonResponse> reasonResponses= new ArrayList<>();
    private List<DocResponse> docResponses=new ArrayList<>();

    public void addReasonResponses(ReasonResponse response){
        this.reasonResponses.add(response);
    }

    public void addDocResponses(DocResponse response){
        this.docResponses.add(response);
    }
}