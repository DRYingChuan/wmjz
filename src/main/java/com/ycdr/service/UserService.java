package com.ycdr.service;

import com.ycdr.dao.BookRepsotory;
import com.ycdr.dao.UserRepsotory;
import com.ycdr.domain.Book;
import com.ycdr.domain.PerfectUser;
import com.ycdr.domain.PerfectUsers;
import com.ycdr.domain.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
/**
 * <p>BookService class.</p>
 *
 * @author hanl
 * @version $Id: $Id
 */
public class UserService {

    @Autowired
    private UserRepsotory uesrRepsotory;

    /**
     * <p>Constructor for BookService.</p>
     */
    public UserService() {
    }

    public PerfectUsers findPerfectUsers(){
        List<PerfectUser> users = uesrRepsotory.findAll();
        PerfectUsers prfusers=new PerfectUsers(users);
        return prfusers;
    }

    public PerfectUser savePerfectUser(UserVo u){
        PerfectUser prfUser=new PerfectUser(u.getUserName());
        PerfectUser p=uesrRepsotory.save(prfUser);
        return p;
    }

    public void delePerfectUser(Integer id){
        uesrRepsotory.delete(id);
    }
   
}
