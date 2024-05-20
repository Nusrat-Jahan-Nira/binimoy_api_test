package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dto.req.LoginReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.LoginResDto;

public interface LoginService {

    LoginResDto getUserName(LoginReqDto loginReqDto);

}
