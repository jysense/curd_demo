package com.sense.curd_demo.web;

import com.sense.curd_demo.bean.User;
import com.sense.curd_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/user")
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean addUser(User user){
        System.out.println("begin to add...");
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public boolean updateUser(User user){
        System.out.println("begin to update...");
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userId",required = true) int userId){
        System.out.println("begin to delete...");
        return userService.deleteUser(userId);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName",required = true) String userName){
        System.out.println("begin to query user by username...");
        return userService.findUserByName(userName);
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> findAll(){
        System.out.println("begin to query all users...");
        return userService.findAll();
    }
}
