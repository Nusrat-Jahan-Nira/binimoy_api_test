package com.erainfotechbd.binimoyapitest.login.controller;

import com.erainfotechbd.binimoyapitest.login.dto.req.LoginReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.LoginResDto;
import com.erainfotechbd.binimoyapitest.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;



    @PostMapping("/get-username")
    public LoginResDto getUserName(@RequestBody LoginReqDto loginReqDto){
        LoginResDto resDto = loginService.getUserName(loginReqDto);
        return resDto;
    }




}
