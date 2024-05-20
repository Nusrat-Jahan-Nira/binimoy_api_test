package com.erainfotechbd.binimoyapitest.login.service;

import com.erainfotechbd.binimoyapitest.login.dbCon.DBConnection;
import com.erainfotechbd.binimoyapitest.login.dto.req.UserReqDto;
import com.erainfotechbd.binimoyapitest.login.dto.res.UserResDto;
import oracle.jdbc.internal.OracleTypes;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserResDto createUser(UserReqDto request)  {

        UserResDto resModel = new UserResDto();
        Connection connection = DBConnection.getcon();

        try{
            String query = "{call EMOB.dpk_apps_user_management.dpr_create_user(?,?,?,?,?,?,?,?,?)}";
            // Prepare the CallableStatement
            CallableStatement cs = connection.prepareCall(query);
            cs.setString(1, "nusrat");
            cs.setString(2, "abc@gmail.com");
            cs.setString(3, "553");
            cs.setString(4, "01255");
            cs.setString(5, "afsdf");
            cs.setString(6, "m");
            cs.setString(7, "545646");

            cs.registerOutParameter(8, OracleTypes.NUMBER);
            cs.registerOutParameter(9, OracleTypes.VARCHAR);

            cs.execute();

            String outCode = cs.getString(8);
            String outMessage = cs.getString(9);

            resModel.setOutCode(Integer.parseInt(outCode));
            resModel.setOutMessage(outMessage);

           return resModel;

        } catch (Exception e) {
        System.out.println("ClassNotFoundException...."+e);
        throw new RuntimeException(e);
        }
        finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Connection Closed....");
        }

    }

    @Override
    public List<UserReqDto> getUser(){

        Connection connection = DBConnection.getcon();
        ResultSet rs = null;
        List<UserReqDto> userReqDtoList = new ArrayList<>();

        try{
            PreparedStatement p=null;
            String sql="select * from APP_USER_MASTER_TEST";
            p =connection.prepareStatement(sql);
            rs = p.executeQuery();

            // Printing ID, name, email of customers
            // of the SQL command above
            System.out.println("id\t\tname\t\temail");

            // Condition check
            while (rs.next()) {

                String userId = rs.getString("USER_ID");
                String email = rs.getString("EMAIL");
                String userPass = rs.getString("USER_PASS");
                String mobile = rs.getString("MOBILE");
                String address = rs.getString("ADDRESS");
                String gender = rs.getString("GENDER");
                String dateOfBirth = rs.getString("DATE_OF_BIRTH");
                String timeStamp = rs.getString("TIMSTAMP");

                UserReqDto userReqDto = new UserReqDto();
                userReqDto.setUserId(userId);
                userReqDto.setEmail(email);
                userReqDto.setUserPass(userPass);
                userReqDto.setMobile(mobile);
                userReqDto.setAddress(address);
                userReqDto.setGender(gender);
                userReqDto.setDateOfBirth(dateOfBirth);

                userReqDtoList.add(userReqDto);



                System.out.println("timeStamp : "+timeStamp);
            }
            return userReqDtoList;

        } catch (Exception e) {
            System.out.println("ClassNotFoundException...."+e);
            throw new RuntimeException(e);
        }
        finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Connection Closed....");
        }

    }
}