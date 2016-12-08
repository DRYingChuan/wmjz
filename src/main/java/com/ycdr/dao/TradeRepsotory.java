package com.ycdr.dao;

import com.ycdr.domain.PerfectTrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import sun.misc.Perf;

/**
 * Created by YcDr on 2016/12/8.
 */
public interface TradeRepsotory extends JpaRepository<PerfectTrade,Integer>,JpaSpecificationExecutor<PerfectTrade>{
}
