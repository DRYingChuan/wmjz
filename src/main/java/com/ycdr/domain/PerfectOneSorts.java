package com.ycdr.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by YcDr on 2016/12/3.
 */
@XmlRootElement(name = "PerfectOneSorts")
public class PerfectOneSorts implements Serializable{
     private List<PerfectOneSort> perfectOneSortsList;

    public PerfectOneSorts() {
        super();
    }

    public PerfectOneSorts(List<PerfectOneSort> perfectOneSortsList) {
        this.perfectOneSortsList = perfectOneSortsList;
    }
    @XmlElement(name = "PerfectOneSort")
    @XmlElementWrapper
    public List<PerfectOneSort> getPerfectOneSortsList() {
        return perfectOneSortsList;
    }

    public void setPerfectOneSortsList(List<PerfectOneSort> perfectOneSortsList) {
        this.perfectOneSortsList = perfectOneSortsList;
    }
}
