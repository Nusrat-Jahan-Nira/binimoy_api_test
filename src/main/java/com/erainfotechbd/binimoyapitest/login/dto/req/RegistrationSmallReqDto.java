package com.erainfotechbd.binimoyapitest.login.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationSmallReqDto {
    private String username;
    private String email;
    private String password;
}
