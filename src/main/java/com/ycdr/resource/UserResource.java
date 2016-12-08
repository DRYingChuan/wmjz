package com.ycdr.resource;

import com.ycdr.dao.UserRepsotory;
import com.ycdr.domain.Json;
import com.ycdr.domain.PerfectUser;
import com.ycdr.domain.PerfectUsers;
import com.ycdr.domain.UserVo;
import com.ycdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by YcDr on 2016/12/7.
 */
@Path("user")
public class UserResource {

    @Autowired
    private UserService userService;
    @Path("PerfectUsers")
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public PerfectUsers findPerfectUsers(){
       PerfectUsers prfUsers=userService.findPerfectUsers();
       return prfUsers;
   }
   @POST
   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public PerfectUser savePerfectUser(UserVo u){
       return userService.savePerfectUser(u);
   }

   @DELETE
   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
   public Json delePerfrctUser(UserVo u){

       String userids=u.getUserIds();
       String o[]=userids.split(",");
       for(int i=0;i<o.length;i++){
           userService.delePerfectUser(Integer.parseInt(o[i]));
       }
       Json j=new Json();
       j.setSuccess(true);
       return j;
   }


}
