package com.ycdr.service;

import com.ycdr.dao.TradeRepository;
import com.ycdr.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by YcDr on 2016/12/8.
 */
@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepsotory;

    public PerfectTrade savePerfectTrade(TradeVo tradeVo){
        SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date exeTime=null;
        try {
            exeTime =sFormat.parse(tradeVo.getExecutionTime());
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        PerfectUser perfUser=new PerfectUser(Integer.parseInt(tradeVo.getUserId()));
        PerfectTrade perf=new PerfectTrade(tradeVo.getTradeRemark(),perfUser,Integer.
                parseInt(tradeVo.getTwoSortId()),Integer.parseInt(tradeVo.getSum()),
                exeTime,Integer.parseInt(tradeVo.getIncAexp()),tradeVo.getAccount());
        PerfectTrade perft = tradeRepsotory.save(perf);
        return perft;
    }

    public PerfectTrades findPerfectTrades(){
        List<PerfectTrade> perfectTradeList = tradeRepsotory.findAll();
        PerfectTrades pefTrades=new PerfectTrades(perfectTradeList);
        return pefTrades;
    }

   public PerfectTrades findListPerfectTrade(Integer date){
       //出事化日期
        LocalDate begMotb = LocalDate.of(Integer.parseInt(Year.now().toString()), date, 1);
       Date begMotbegMothexecutionTime=null;
       Date endMothexecutionTime=null;
       SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
       DateFormat mediumDateFormat = DateFormat.getDateTimeInstance
               (DateFormat.MEDIUM,DateFormat.MEDIUM);
       try {
           begMotbegMothexecutionTime=sFormat.parse(begMotb.toString());
           endMothexecutionTime=new Date();
       } catch (ParseException e) {
           e.printStackTrace();
       }
       System.out.println(begMotbegMothexecutionTime+""+endMothexecutionTime);
       List<PerfectTrade> perfectTradeList = tradeRepsotory.findListPerfectTrade(begMotbegMothexecutionTime,endMothexecutionTime);
        PerfectTrades pefTrades=new PerfectTrades(perfectTradeList);
        return pefTrades;
    }

     /*public  static  void  main(String[] arga){
         SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.);
         try {
             Date begMotbegMothexecutionTime = sFormat.parse("2016-12-1");
             System.out.println(begMotbegMothexecutionTime);
         } catch (ParseException e) {
             e.printStackTrace();
         }
     }*/

}
