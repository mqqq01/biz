package com.kuaibao.web;

import com.kuaibao.entity.User;
import com.kuaibao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "age", required = true) int age){
        System.out.println(name);
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setId(id);
        int t = userService.update(user);
        if(t == 1) {
            return user.toString();
        } else {
            return "fail";
        }
    }
}
