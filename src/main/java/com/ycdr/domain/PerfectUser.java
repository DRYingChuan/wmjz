package com.ycdr.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by YcDr on 2016/12/3.
 */
@Table(name = "PERFECT_USER")
@Entity
@XmlRootElement
public class PerfectUser implements Serializable {
     private static final int USERNAME=100;
     private static final int USERPASSWORD=100;
     private Integer userId;
     private String userName;
     private String userPassWord;

    public PerfectUser() {
        super();
    }

    public PerfectUser(String userName) {
        this.userName = userName;
    }

    public PerfectUser(Integer userId, String userName, String userPassWord) {
        this.userId = userId;
        this.userName = userName;
        this.userPassWord = userPassWord;
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID")
    @Id
    @XmlAttribute(name = "userid")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    @Column(name = "USERNAME",length=PerfectUser.USERNAME)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "USERPASSWORD",length =PerfectUser.USERPASSWORD )
    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
}
