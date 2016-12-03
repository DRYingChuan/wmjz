package com.ycdr.service;

import com.ycdr.dao.BookRepsotory;
import com.ycdr.dao.WmsjRepsotory;
import com.ycdr.domain.Address;
import com.ycdr.domain.Book;
import com.ycdr.domain.Wmsj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycdr.dao.PersonRepsotory;
import com.ycdr.domain.Person;


@Service
/**
 * <p>BookService class.</p>
 *
 * @author hanl
 * @version $Id: $Id
 */
public class PersonService {
    @Autowired
    private PersonRepsotory bookDao;
    @Autowired
    private BookRepsotory bookRepsotory;

    @Autowired
    private WmsjRepsotory wmsjRepsotory;
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
    public Person getBooks() {
    	Person p=bookDao.findOne(1);
        Address a=p.getAddress();
        return p;
    }

    public Book getBook(Long id){
         Book b=bookRepsotory.findOne(id);
         return b;
    }

    public Wmsj getWmsj(Integer id){
          Wmsj w=wmsjRepsotory.findOne(id);
            return w;
    }



   
}
