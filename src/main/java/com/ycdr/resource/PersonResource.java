package com.ycdr.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.ycdr.domain.Person;
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

    /**
     * <p>getBooks.</p>
     *
     * @return a {@link com.example.domain.Books} object.
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person getBooks() {
    	System.out.print("HelloWord");
        final Person books = bookService.getBooks();
        System.out.println(books.toString());
        return books;
    }

}
