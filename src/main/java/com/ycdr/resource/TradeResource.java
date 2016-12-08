package com.ycdr.resource;

import com.ycdr.domain.PerfectTrade;
import com.ycdr.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by YcDr on 2016/12/8.
 */
@Path("trade")
public class TradeResource {
    @Autowired
    private TradeService tradeService;

    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public PerfectTrade savePerfectTrade(PerfectTrade perfectTrade){
        return  tradeService.savePerfectTrade(perfectTrade);
    }
}
