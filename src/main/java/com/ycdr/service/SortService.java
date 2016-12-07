package com.ycdr.service;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import com.ycdr.dao.OneSortRepository;
import com.ycdr.dao.TwoSortRepository;
import com.ycdr.domain.PerfectOneSort;
import com.ycdr.domain.PerfectOneSorts;
import com.ycdr.domain.PerfectTwoSort;
import com.ycdr.domain.SortVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by YcDr on 2016/12/3.
 */
@Service
public class SortService{

    @Autowired
    private OneSortRepository oneSortRepository;
    @Autowired
    private TwoSortRepository twoSortRepository;

    public SortService() {
        super();
    }


    public PerfectOneSort findPerfectOneSort(Integer id){
        PerfectOneSort pefOneSort = oneSortRepository.findOne(id);
        System.out.println(pefOneSort.getOneSortId());
        return pefOneSort;
    }

    public PerfectOneSorts findPerfectOneSorts(Integer incaexp){
        List<PerfectOneSort> pefOneSortList = oneSortRepository.findByIncAexp(incaexp);
        PerfectOneSorts perfectOneSorts=new PerfectOneSorts(pefOneSortList);
        return perfectOneSorts;
    }
    @Transactional
    public PerfectOneSort savePerfectOneSort(SortVo s){
        PerfectOneSort po=null;
        PerfectOneSort on=null;
        if(s.getOneSortId()!=null&&s.getOneSortName()==null){
            po=new PerfectOneSort(s.getOneSortId());
        }else if(s.getOneSortId()==null&&s.getOneSortName()!=null){
            po=new PerfectOneSort(s.getOneSortName(),s.getIncAexp());
            on= oneSortRepository.save(po);
        }else if(s.getOneSortId()!=null&&s.getOneSortName()!=null){
            po=new PerfectOneSort(s.getOneSortId(),s.getOneSortName(),s.getIncAexp());
        }

        PerfectTwoSort pt=new PerfectTwoSort(s.getTwoSortName(),po);
        PerfectTwoSort two = twoSortRepository.save(pt);
        System.out.println(two.toString());
        return on;
    }



    @Transactional
    public boolean deleteOneSort(Integer sortdele){
        try {
            oneSortRepository.delete(sortdele);
            return true;
        }catch (Exception E){
            return false;
        }
    }
    @Transactional
    public boolean deleteTwoSort(Integer sortdele){
        try {
            twoSortRepository.delete(sortdele);
            return true;
        }catch (Exception E){
            return false;
        }

    }


    public static void main(String[] args){
        String sortDelete=" {\"sortDelete\":\"2,3,5\"}";

        String o = sortDelete.split(":")[1];
        //第二次分成 数组
        String[] sortIdJson=o.substring(o.indexOf("\"")+1,o.lastIndexOf("\"")).split(",");
        for(int i=0;i<sortIdJson.length;i++){
            System.out.println(sortIdJson[i]);
        }
    }

}
