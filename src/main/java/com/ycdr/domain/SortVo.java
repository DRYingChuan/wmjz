package com.ycdr.domain;

/**
 * Created by YcDr on 2016/12/4.
 */
public class SortVo {
    private String oneSortName;
    private String twoSortName;
    private Integer incAexp;
    private Integer oneSortId;
    private String twoDelSortId;
    private String oneDelSortId;

    public SortVo() {
        super();
    }

    public SortVo(String oneSortName, String twoSortName, Integer incAexp, Integer oneSortId, String twoDelSortId, String oneDelSortId) {
        this.oneSortName = oneSortName;
        this.twoSortName = twoSortName;
        this.incAexp = incAexp;
        this.oneSortId = oneSortId;
        this.twoDelSortId = twoDelSortId;
        this.oneDelSortId = oneDelSortId;
    }

    public String getOneSortName() {
        return oneSortName;
    }

    public void setOneSortName(String oneSortName) {
        this.oneSortName = oneSortName;
    }

    public String getTwoSortName() {
        return twoSortName;
    }

    public void setTwoSortName(String twoSortName) {
        this.twoSortName = twoSortName;
    }

    public Integer getIncAexp() {
        return incAexp;
    }

    public void setIncAexp(Integer incAexp) {
        this.incAexp = incAexp;
    }

    public Integer getOneSortId() {
        return oneSortId;
    }

    public void setOneSortId(Integer oneSortId) {
        this.oneSortId = oneSortId;
    }

    public String getTwoDelSortId() {
        return twoDelSortId;
    }

    public void setTwoDelSortId(String twoDelSortId) {
        this.twoDelSortId = twoDelSortId;
    }

    public String getOneDelSortId() {
        return oneDelSortId;
    }

    public void setOneDelSortId(String oneDelSortId) {
        this.oneDelSortId = oneDelSortId;
    }
}
