package com.ycdr.service;

import com.ycdr.dao.BookRepsotory;
import com.ycdr.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
/**
 * <p>BookService class.</p>
 *
 * @author hanl
 * @version $Id: $Id
 */
public class PersonService {

    @Autowired
    private BookRepsotory bookRepsotory;

    /**
     * <p>Constructor for BookService.</p>
     */
    public PersonService() {
    }

 

    /**
     * <p>getBooks.</p>
     *
     * @return a {@link } object.
     */
    public Book getBook(Long id){
         Book b=bookRepsotory.findOne(id);
         return b;
    }




   
}
