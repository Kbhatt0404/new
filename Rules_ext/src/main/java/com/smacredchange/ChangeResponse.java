package com.smacredchange;

import java.util.List;

public class ChangeResponse {

    private List<Integer> RequestIdList;
    private String ReasonDescription;
    private List<Integer> DocIdList;

    public ChangeResponse(List<Integer> requestIdList,  String reasonDescription) {
        RequestIdList = requestIdList;
    }

    public List<Integer> getDocIdList() {
        return DocIdList;
    }

    public void setDocIdList(List<Integer> docIdList) {
        this.DocIdList = docIdList;
    }

    public String getReasonDescription() {
        return ReasonDescription;
    }

    public void setReasonDescription(String reasonDescription) {
        this.ReasonDescription = reasonDescription;
    }

    public ChangeResponse() {
    }

    public List<Integer> getRequestIdList() {
        return RequestIdList;
    }

    public void setRequestIdList(List<Integer> requestIdList) {
        this.RequestIdList = requestIdList;
    }

}
