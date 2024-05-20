package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dto.req.UserReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.UserResDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    UserResDto createUser(UserReqDto request);

    List<UserReqDto> getUser();

//    UserReqDto updateUser(UserReqDto request);
}
