package com.erainfotechbd.binimoyapitest.login.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReqDto {
    private String userId;
    private String email;
    private String userPass;
    private String mobile;
    private String address;
    private String gender;
    private String dateOfBirth;
    // getters and setters
}
