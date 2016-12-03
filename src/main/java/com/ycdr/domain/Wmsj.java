package com.ycdr.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by YcDr on 2016/12/2.
 */
@Table(name="wmsj_test")
@Entity
@XmlRootElement
public class Wmsj implements Serializable {

    private Integer wmid;

    private String teestName;
/*
    public Wmsj(){}
    public Wmsj(Integer wmid){
        this.wmid=wmid;
    }
    public Wmsj(Integer wmid,String teestName){
        this.wmid=wmid;
        this.teestName=teestName;
    }
*/


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @XmlAttribute(name = "wmid")
    public Integer getWmid() {
        return wmid;
    }

    public void setWmid(Integer wmid) {
        this.wmid = wmid;
    }
    @XmlElement
    public String getTeestName() {
        return teestName;
    }

    public void setTeestName(String teestName) {
        this.teestName = teestName;
    }

}
