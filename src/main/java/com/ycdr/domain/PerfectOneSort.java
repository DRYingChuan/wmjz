package com.ycdr.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by YcDr on 2016/12/3.
 */
@Table(name="PERFECT_ONESORT")
@Entity
@XmlRootElement
public class PerfectOneSort implements Serializable {
    private static final int ONESORTNAME=100;
    private Integer oneSortId;
    private String  oneSortName;
    private Integer incAexp;
    private Set<PerfectTwoSort> perfectTwoSort = new HashSet<>();
    public PerfectOneSort() {
        super();
    }

    public PerfectOneSort(String oneSortName) {
        this.oneSortName = oneSortName;
    }

    public PerfectOneSort(Integer oneSortId) {
        this.oneSortId = oneSortId;
    }

    public PerfectOneSort(String oneSortName, Integer incAexp) {
        this.oneSortName = oneSortName;
        this.incAexp = incAexp;
    }

    public PerfectOneSort(Integer oneSortId, String oneSortName, Integer incAexp) {
        this.oneSortId = oneSortId;
        this.oneSortName = oneSortName;
        this.incAexp = incAexp;
    }

    public PerfectOneSort(Integer oneSortId, String oneSortName, Set<PerfectTwoSort>  perfectTwoSort) {
        this.oneSortId = oneSortId;
        this.oneSortName = oneSortName;
        this.perfectTwoSort = perfectTwoSort;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ONESORTID")
    @Id
    @XmlAttribute(name = "onesortid")
    public Integer getOneSortId() {
        return oneSortId;
    }

    public void setOneSortId(Integer oneSortId) {
        this.oneSortId = oneSortId;
    }
    @Column(name = "ONESORTNAME",length = PerfectOneSort.ONESORTNAME)
    public String getOneSortName() {
        return oneSortName;
    }

    public void setOneSortName(String oneSortName) {
        this.oneSortName = oneSortName;
    }
    @Column(name = "INCAEXP")
    public Integer getIncAexp() {
        return incAexp;
    }

    public void setIncAexp(Integer incAexp) {
        this.incAexp = incAexp;
    }

    @OneToMany(fetch=FetchType.EAGER,cascade={CascadeType.REMOVE},mappedBy = "perfectOneSort")
    @XmlElement(name = "PerfectTwoSort")
    @XmlElementWrapper
    public Set<PerfectTwoSort> getPerfectTwoSort() {
        return perfectTwoSort;
    }

    public void setPerfectTwoSort(Set<PerfectTwoSort> perfectTwoSort) {
        this.perfectTwoSort = perfectTwoSort;
    }

    @Override
    public String toString() {
        return "PerfectOneSort{" +
                "oneSortId=" + oneSortId +
                ", oneSortName='" + oneSortName + '\'' +
                ", perfectTwoSort=" + perfectTwoSort +
                '}';
    }
}