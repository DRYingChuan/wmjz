package com.ycdr;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * <p>AirResourceConfig class.</p>
 *@ApplicationPath("/webapp/*")
 * @author hanl
 * @version $Id: $Id
 */
@ApplicationPath("webapp/*")
public class AirResourceConfig extends ResourceConfig {
    /**
     * <p>Constructor for AirResourceConfig.</p>
     */
    public AirResourceConfig() {
        packages("com.ycdr.resource");
        /**register(BookResource.class);**/
    }   
}