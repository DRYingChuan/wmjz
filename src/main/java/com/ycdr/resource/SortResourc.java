package com.ycdr.resource;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.ycdr.domain.*;
import com.ycdr.service.SortService;

import org.glassfish.jersey.server.mvc.Viewable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;


/**
 * Created by YcDr on 2016/12/3.
 */
@Path("sort")
public class SortResourc {
    @Autowired
    private SortService sortService;
    @Context
    private UriInfo uriInfo;
    private static final Logger logger = LoggerFactory.getLogger(SortResourc.class);
    @GET
    @Produces("text/html;charset=UTF-8")
    public Viewable sayHello() {
        logger.info("SortResourc跳转首页");
        return new Viewable("/more.jsp");
    }

    @Path("{oneSortId:[0-9]*}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public PerfectOneSort findPerfectOneSort(@PathParam("oneSortId")final Integer oneSortId){
        PerfectOneSort p=sortService.findPerfectOneSort(oneSortId);
        return p;
    }

    @Path("/PerfectOneSorts")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public PerfectOneSorts findPerfectOneSorts(@QueryParam("incaexp")final Integer incaexp){
        PerfectOneSorts p=sortService.findPerfectOneSorts(incaexp);
        return p;
    }

    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public  Json savePerfectOneSort(final SortVo s){
        PerfectOneSort p = sortService.savePerfectOneSort(s);
        Json j=new Json();
        j.setMsg("成功");
        j.setSuccess(true);
        return j;
    }
    @DELETE
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Json deleteSort(final SortVo s){
        //第一次分解json数组
        /*{"sortDelete":"2,3,5"}*/
        if(s.getOneDelSortId()!=null){
            String oneDelSortId=s.getOneDelSortId();
            String o[]=oneDelSortId.split(",");
            for(int i=0;i<o.length;i++){
                sortService.deleteOneSort(Integer.parseInt(o[i]));
            }
        }else{
           String twoDelSortId=s.getTwoDelSortId();
            String o[]=twoDelSortId.split(",");
            for(int i=0;i<o.length;i++){
                sortService.deleteTwoSort(Integer.parseInt(o[i]));
            }
        }

        Json j=new Json();
        j.setMsg("成功");
        j.setSuccess(true);
        return j;
    }

/*    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
// @FormParam表示通过HTML表单传入参数
    public Viewable addStudent2(@FormParam("name") String name,
                                @FormParam("dept") String dept,
                                @Context HttpServletRequest request,
                                @Context HttpServletResponse response) {
// 保存name和dept的逻辑（略）
        request.setAttribute("resultString", "success");

        HttpSession session = request.getSession();
        session.setAttribute("user", "guohengj");
// 跳转到/strudent.jsp
        return new Viewable("/student.jsp", null);
    }*/
}
