package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dbCon.DBConnection;
import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.req.RegistrationSmallReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.RegistrationResDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.RegistrationSmallResDto;
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

    @Override
    public RegistrationSmallResDto getRegistrationSmall(RegistrationSmallReqDto req) {
        RegistrationSmallResDto res = new RegistrationSmallResDto();
        // Connection con  = DBConnection.getcon();

        if(req.getUsername().equals("testUser")){
            res.setUsername(req.getUsername());
            res.setEmail(req.getEmail());
            res.setOutCode("0");
            res.setOutMessage("Request Successful!");
        }
        else{
            res.setUsername(req.getUsername());
            res.setEmail(null);
            res.setOutCode("1");
            res.setOutMessage("Request Failed!");
        }
        return res;
    }
}
