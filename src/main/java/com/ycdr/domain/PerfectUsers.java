package com.ycdr.domain;

import java.util.List;

/**
 * Created by YcDr on 2016/12/7.
 */
public class PerfectUsers {

     private List<PerfectUser> PerfectUser;

    public PerfectUsers() {
        super();
    }

    public PerfectUsers(List<com.ycdr.domain.PerfectUser> perfectUser) {
        PerfectUser = perfectUser;
    }

    public List<com.ycdr.domain.PerfectUser> getPerfectUser() {
        return PerfectUser;
    }

    public void setPerfectUser(List<com.ycdr.domain.PerfectUser> perfectUser) {
        PerfectUser = perfectUser;
    }
}
