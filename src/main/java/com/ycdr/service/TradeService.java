package com.ycdr.service;

import com.ycdr.dao.TradeRepsotory;
import com.ycdr.domain.PerfectTrade;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by YcDr on 2016/12/8.
 */
public class TradeService {

    @Autowired
    private TradeRepsotory tradeRepsotory;

    public PerfectTrade savePerfectTrade(PerfectTrade perfectTrade){
        return tradeRepsotory.save(perfectTrade);
    }

}
