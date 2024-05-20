package com.erainfotechbd.binimoyapitest.login.controller;

import com.erainfotechbd.binimoyapitest.login.dto.req.UserReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.UserResDto;
import com.erainfotechbd.binimoyapitest.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public UserResDto createUser(@RequestBody UserReqDto request) {
        UserResDto resDto = null;
        try {
            resDto = userService.createUser(request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resDto;
    }

    @GetMapping("/getUser")
    public List<UserReqDto> getUser() {
        List<UserReqDto> res = null;
        try {
            res = userService.getUser();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res;
    }

//    @PostMapping("/updateUser")
//    public UserReqDto updateUser(@RequestBody UserReqDto request){
//        UserReqDto reqDto = null;
//        try {
//            reqDto = userService.updateUser(request);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return reqDto;
//    }

}
