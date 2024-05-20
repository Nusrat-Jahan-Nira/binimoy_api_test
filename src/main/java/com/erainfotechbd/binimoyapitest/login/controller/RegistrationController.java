package com.erainfotechbd.binimoyapitest.login.controller;

import com.erainfotechbd.binimoyapitest.login.dto.res.UserResDto;
import com.erainfotechbd.binimoyapitest.login.service.UserService;
import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.req.UserReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.RegistrationResDto;
import com.erainfotechbd.binimoyapitest.login.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    RegistrationService registrationService;

    @Autowired
    UserService userService;

    @PostMapping("/get-registration")
    public RegistrationResDto getRegistration(@RequestBody RegistrationReqDto req){
        RegistrationResDto resDto = registrationService.getRegistration(req);
        return resDto;
    }

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
}
