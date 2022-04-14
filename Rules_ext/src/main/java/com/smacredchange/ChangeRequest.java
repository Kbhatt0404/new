package com.smacredchange;

import java.util.List;


public class ChangeRequest {

    private String changeType;
    private Integer ReasonId;
    private ChangeResponse apiResponse;

    public ChangeRequest(Integer ReasonId,String changeType) {
        this.ReasonId=ReasonId;
        this.changeType = changeType;
    }
    public Integer getReasonId() {
        return ReasonId;
    }
    public void setReasonId(Integer reasonId) {
        this.ReasonId = reasonId;
    }
    public ChangeRequest() {
        this.apiResponse = new ChangeResponse();
    }
//@param
    public void setReasonIdList(List<Integer> requestIdList){
        this.apiResponse.setRequestIdList(requestIdList);
    }
    public void setReasonDescription(String ReasonDescription){
        this.apiResponse.setReasonDescription(ReasonDescription);
    }
    public void setDocIdList(List<Integer> DocIdList){
        this.apiResponse.setDocIdList(DocIdList);
    }
///@param
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public ChangeResponse getApiresponse() {
        return apiResponse;
    }

    public void setApiresponse(ChangeResponse apiResponse) {
        this.apiResponse = apiResponse;
    }
   

}
