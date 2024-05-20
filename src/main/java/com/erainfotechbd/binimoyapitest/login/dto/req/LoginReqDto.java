package com.erainfotechbd.binimoyapitest.login.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginReqDto {

    private String userId;
    private String pass;

}
