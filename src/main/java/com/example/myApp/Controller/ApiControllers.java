package com.example.myApp.Controller;

import com.example.myApp.Models.User;
import com.example.myApp.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ApiControllers {

    //@Autowired
    //private UserRepo userRepo;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
   /* @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved....";
    }*/
}
