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
    private Integer tradeId;
    //备注
    private String  tradeRemark;
    //用户
    private PerfectUser perfactUser;
    //分类ID
    private Integer oneSortId;
    //金额
    private Integer sum;
    //时间
    private Date executionTime;

    public PerfectTrade() {
        super();
    }

    public PerfectTrade(Integer tradeId, String tradeRemark, PerfectUser perfactUser, Integer oneSortId, Integer sum, Date executionTime) {
        this.tradeId = tradeId;
        this.tradeRemark = tradeRemark;
        this.perfactUser = perfactUser;
        this.oneSortId = oneSortId;
        this.sum = sum;
        this.executionTime = executionTime;
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
    @Column(name ="ONESORTID")
    public Integer getOneSortId() {
        return oneSortId;
    }

    public void setOneSortId(Integer oneSortId) {
        this.oneSortId = oneSortId;
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
}
