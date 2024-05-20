package com.erainfotechbd.binimoyapitest.login.dto.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResDto {

    private String name;
    private String outCode;
    private String outMessage;

}
