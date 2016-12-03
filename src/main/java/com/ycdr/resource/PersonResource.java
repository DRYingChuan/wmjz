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

import com.ycdr.domain.Book;
import com.ycdr.domain.Wmsj;
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
     * @return a {@link } object.
     */
  /*  @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person getBooks() {
    	System.out.print("HelloWord");
        final Person books = bookService.getBooks();
        System.out.println(books.toString());
        return books;
    }*/
    @Path("/personid")
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Person getBookByPath(@QueryParam("id") final Long bookId) {
        System.out.print("HelloWord");
        final Person books = bookService.getBooks();
        int i=6;
        int kkk=99911;
        System.out.println(books.toString()+"好难啊");

        return books;
    }
    @Path("/book")
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Book getBook(@QueryParam("id") final Long bookId){
            final Book b=bookService.getBook(bookId);
            return b;
    }

    @Path("/wmsj")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Wmsj getWmsj(@QueryParam("id") Integer wmsjId){
        Wmsj w=bookService.getWmsj(wmsjId);
        return w;
    }
}
