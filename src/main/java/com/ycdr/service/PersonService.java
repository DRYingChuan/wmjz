package com.ycdr.service;

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

    /**
     * <p>Constructor for BookService.</p>
     */
    public PersonService() {
    }

 

    /**
     * <p>getBooks.</p>
     *
     * @return a {@link com.example.domain.Books} object.
     */
    public Person getBooks() {
    	Person p=bookDao.findOne(1);
        return p;
    }

   
}
