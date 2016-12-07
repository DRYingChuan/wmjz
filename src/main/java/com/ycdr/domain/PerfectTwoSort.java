package com.ycdr.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * Created by YcDr on 2016/12/3.
 */
@Table(name = "PERFECT_TWOSORT")
@Entity
@XmlRootElement
public class PerfectTwoSort implements Serializable{
    private static final int TWOSORTNAME=100;
        private Integer TwoSortId;
        private String TwoSortName;

       private PerfectOneSort perfectOneSort;

    public PerfectTwoSort() {
        super();
    }

    public PerfectTwoSort(String twoSortName) {
        TwoSortName = twoSortName;
    }

    public PerfectTwoSort(String twoSortName, PerfectOneSort perfectOneSort) {
        TwoSortName = twoSortName;
        this.perfectOneSort = perfectOneSort;
    }

    public PerfectTwoSort(Integer twoSortId, String twoSortName) {
        TwoSortId = twoSortId;
        TwoSortName = twoSortName;
    }


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TWOSORTID")
    @Id
    @XmlAttribute(name = "twosortid")
    public Integer getTwoSortId() {
        return TwoSortId;
    }

    public void setTwoSortId(Integer twoSortId) {
        TwoSortId = twoSortId;
    }
    @Column(name = "TWOSORTNAME",length = PerfectTwoSort.TWOSORTNAME)
    public String getTwoSortName() {
        return TwoSortName;
    }

    public void setTwoSortName(String twoSortName) {
        TwoSortName = twoSortName;
    }

    @JoinColumn(name ="ONESORTID" )
    @ManyToOne(fetch=FetchType.LAZY)
    @XmlTransient
    public PerfectOneSort getPerfectOneSort() {
        return perfectOneSort;
    }

    public void setPerfectOneSort(PerfectOneSort perfectOneSort) {
        this.perfectOneSort = perfectOneSort;
    }

    @Override
    public String toString() {
        return "PerfectTwoSort{" +
                "TwoSortId=" + TwoSortId +
                ", TwoSortName='" + TwoSortName + '\'' +
                ", perfectOneSort=" + perfectOneSort +
                '}';
    }
}
