package com.erainfotechbd.binimoyapitest.login.controller;

import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationSmallReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.RegistrationSmallResDto;
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

    @Autowired
    RegistrationService registrationService;


    @PostMapping("/get-registration")
    public RegistrationResDto getRegistration(@RequestBody RegistrationReqDto req){
        RegistrationResDto resDto = registrationService.getRegistration(req);
        return resDto;
    }

    @PostMapping("/get-registration-small")
    public RegistrationSmallResDto getRegistrationSmall(@RequestBody RegistrationSmallReqDto req){
        RegistrationSmallResDto resDto = registrationService.getRegistrationSmall(req);
        return resDto;
    }


}
