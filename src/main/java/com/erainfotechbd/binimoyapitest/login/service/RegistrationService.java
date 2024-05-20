package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.RegistrationResDto;
import org.springframework.stereotype.Service;

public interface RegistrationService {
    RegistrationResDto getRegistration(RegistrationReqDto req);
}
