package com.ycdr.domain;

import java.util.List;

/**
 * Created by YcDr on 2016/12/10.
 */
public class PerfectTrades {
    private List<PerfectTrade> perfectTradesList;

    public PerfectTrades() {
        super();
    }

    public PerfectTrades(List<PerfectTrade> perfectTradesList) {
        this.perfectTradesList = perfectTradesList;
    }

    public List<PerfectTrade> getPerfectTradesList() {
        return perfectTradesList;
    }

    public void setPerfectTradesList(List<PerfectTrade> perfectTradesList) {
        this.perfectTradesList = perfectTradesList;
    }
}
