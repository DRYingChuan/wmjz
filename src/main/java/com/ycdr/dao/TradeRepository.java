package com.ycdr.dao;

        import com.ycdr.domain.PerfectTrade;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
        import org.springframework.data.jpa.repository.Query;

        import java.time.LocalDate;
        import java.util.Date;
        import java.util.List;

/**
 * Created by YcDr on 2016/12/8.
 */
public interface TradeRepository extends JpaRepository<PerfectTrade,Integer>,JpaSpecificationExecutor<PerfectTrade>{
    @Query("SELECT p FROM PerfectTrade p WHERE p.executionTime>?1 AND p.executionTime<?2")
    List<PerfectTrade> findListPerfectTrade(Date begMothexecutionTime,Date endMothexecutionTime);


    //为 @Query 注解传递参数的方式1: 命名参数的方式.
}
