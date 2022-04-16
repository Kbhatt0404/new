package com.smacredchange;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
public class ReasonResponse implements Serializable {
    private int ReasonId;
    private String ReasonDescription;
    private List<Integer> DocIdList;
    private List<DocResponse> docResponses=new ArrayList<>(); 

    

}
