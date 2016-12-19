package com.ycdr.domain;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by YcDr on 2016/12/10.
 */
public class TradeTestVo {
    /*"twoSortId":"43","sum":"342","userId":"3","executionTime":"2016-12-10 19:10:55","tradeRemark":"SDFGSD"*/

    private String twoSortId;
    private String sum;
   private String incAexp;
    private String tradeRemark;
    private String userId;
    private String account;
    private Date executionTime;
    public TradeTestVo() {
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

    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) throws ParseException {
        SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date exeTime=sFormat.parse(executionTime);
        this.executionTime = exeTime;
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
