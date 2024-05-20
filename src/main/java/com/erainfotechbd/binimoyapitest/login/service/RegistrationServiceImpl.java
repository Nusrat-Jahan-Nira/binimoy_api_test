package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dbCon.DBConnection;
import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.RegistrationResDto;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public RegistrationResDto getRegistration(RegistrationReqDto req) {

        RegistrationResDto res = new RegistrationResDto();
       // Connection con  = DBConnection.getcon();

        if(req.getMailId().equals("testUser")){
            res.setOutCode("0");
            res.setOutMessage("Request Successful!");
            res.setReqId("PIPMPI2024");
            res.setStatus("Got Data");
        }
        else{
            res.setOutCode("1");
            res.setOutMessage("Request Failed!");
            res.setReqId("0");
            res.setStatus("null");
        }
        return res;
    }
}
