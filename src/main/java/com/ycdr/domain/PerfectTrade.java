package com.ycdr.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by YcDr on 2016/12/3.
 */
@Table(name="PERFECT_TRADE")
@Entity
@XmlRootElement
public class PerfectTrade {


    /*"twoSortId":"","sum":"","datetimepicker":"2016-12-10 2:13:15","tradeRemark":""*/
    private Integer tradeId;
    //备注
    private String  tradeRemark;
    //用户
    private PerfectUser perfactUser;
    //分类ID
    private Integer twoSortId;
    //金额
    private Integer sum;
    //时间
    private Date executionTime;
    //收入支出 1 收入 2 支出
    private Integer incAexp;

    private String account;

    public PerfectTrade() {
        super();
    }

    public PerfectTrade(String tradeRemark, PerfectUser perfactUser, Integer twoSortId, Integer sum, Date executionTime, Integer incAexp, String account) {

        this.tradeRemark = tradeRemark;
        this.perfactUser = perfactUser;
        this.twoSortId = twoSortId;
        this.sum = sum;
        this.executionTime = executionTime;
        this.incAexp = incAexp;
        this.account = account;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRADE_ID")
    @Id
    @XmlAttribute
    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }
    @Column(name = "TRADE_REMARK")
    public String getTradeRemark() {
        return tradeRemark;
    }

    public void setTradeRemark(String tradeRemark) {
        this.tradeRemark = tradeRemark;
    }
    @JoinColumn(name = "USERID")
    @ManyToOne
    public PerfectUser getPerfactUser() {
        return perfactUser;
    }

    public void setPerfactUser(PerfectUser perfactUser) {
        this.perfactUser = perfactUser;
    }
    @Column(name ="TWOSORTID")
    public Integer getTwoSortId() {
        return twoSortId;
    }

    public void setTwoSortId(Integer twoSortId) {
        this.twoSortId = twoSortId;
    }
    @Column(name = "SUM")
    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXECUTION_TIME")
    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    @Column(name = "ACCOUNT")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    @Column(name = "INCAEXP")
    public Integer getIncAexp() {
        return incAexp;
    }

    public void setIncAexp(Integer incAexp) {
        this.incAexp = incAexp;
    }
}
