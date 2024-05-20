package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dbCon.DBConnection;
import com.erainfotechbd.binimoyapitest.login.dto.req.LoginReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.LoginResDto;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginResDto getUserName(LoginReqDto req) {

        LoginResDto res = new LoginResDto();

//        try {
//            Connection con  = DBConnection.getcon();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        if(req.getUserId().equals("testUser")&&req.getPass().equals("1234")){
            res.setName("Mr. Test User");
            res.setOutCode("0");
            res.setOutMessage("Login Successful!");
        }
        else{
            res.setName("Mr. Test User");
            res.setOutCode("1");
            res.setOutMessage("User Or Password Not Matched!");
        }

        //Db Con
        //procedure // query
        //return res

        return res;
    }
}
