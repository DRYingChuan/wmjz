package com.ycdr.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ycdr.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;

import com.ycdr.service.PersonService;

/**
 * <p>BookResource class.</p>
 *
 * @author hanl
 * @version $Id: $Id
 */
@Path("books")
public class PersonResource {
    @Autowired
    private PersonService bookService;



    @Path("/book")
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Book getBook(@QueryParam("id") final Long bookId){
            final Book b=bookService.getBook(bookId);
            return b;
    }


}
