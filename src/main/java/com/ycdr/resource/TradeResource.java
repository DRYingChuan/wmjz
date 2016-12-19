package com.ycdr.resource;

import com.ycdr.domain.*;
import com.ycdr.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
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
    public PerfectTrade savePerfectTrade(TradeVo tradeVo){
        return  tradeService.savePerfectTrade(tradeVo);
    }

    @Path("perfTrades")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public PerfectTrades getPerfectTrades(){
       PerfectTrades perfTrades= tradeService.findPerfectTrades();
        return perfTrades;
    }

    @Path("/PerfectTrades")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public PerfectTrades findPerfectTradesSorts(@QueryParam("maoth")final Integer maoth){
        PerfectTrades perfTrade= tradeService.findListPerfectTrade(maoth);
        return perfTrade;
    }
}
