package com.ycdr.domain;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by YcDr on 2016/12/10.
 */
public class TradeVo {
    /*"twoSortId":"","sum":"","executionTime":{"jQuery19008879424500655911":81},"tradeRemark":""}*/
    private String twoSortId;
    private String sum;
    private String executionTime;
    private String tradeRemark;
    private String userId;
    private String account;
    private String incAexp;
    public TradeVo() {
        super();
    }



    public String getTwoSortId() {
        return twoSortId;
    }

    public void setTwoSortId(String twoSortId) {
        this.twoSortId = twoSortId;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public String getTradeRemark() {
        return tradeRemark;
    }

    public void setTradeRemark(String tradeRemark) {
        this.tradeRemark = tradeRemark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIncAexp() {
        return incAexp;
    }

    public void setIncAexp(String incAexp) {
        this.incAexp = incAexp;
    }
}
