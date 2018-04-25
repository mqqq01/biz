package com.kuaibao.web;

import com.kuaibao.entity.User;
import com.kuaibao.service.IUserService;
import com.kuaibao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController
{
//    @Autowired
////    IUserService userService;
////
////    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
////    public String updateUser(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
////                             @RequestParam(value = "age", required = true) int age){
////        System.out.println(name);
////        User user = new User();
////        user.setName(name);
////        user.setAge(age);
////        user.setId(id);
////        int t = userService.update(user);
////        if(t == 1) {
////            return user.toString();
////        } else {
////            return "fail";
////        }
////    }
    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "age", required = true) int age){
        int t = userService.update(name, age, id);
        if(t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postUser(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "age", required = true) int age){
        int t = userService.add(name, age);
        if(t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

}
