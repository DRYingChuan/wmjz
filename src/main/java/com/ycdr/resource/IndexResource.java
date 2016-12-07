package com.ycdr.resource;

import org.glassfish.jersey.server.mvc.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;

/**
 * Created by YcDr on 2016/12/3.
 */
@Path("/index")
public class IndexResource {
   /* @Path("in")
    @GET
    public Viewable sayHello() {
        return new Viewable("/index.html");
    }*/
/*   @GET
   public Viewable sayHello(@QueryParam("name") @DefaultValue("hell") String name) {
       HashMap model = new HashMap();
       model.put("name", name);
       return new Viewable("/index", model);
   }*/
    //使用Template注解的方式
   private static final Logger logger = LoggerFactory.getLogger(IndexResource.class);
   @GET
   @Produces("text/html;charset=UTF-8")
   @Template(name = "/index.jsp")
   public String getView() {
      logger.info("跳转页面");
      logger.debug("跳转页面---");
       return "fpp";
   }
}
