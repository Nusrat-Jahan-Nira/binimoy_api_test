package com.erainfotechbd.binimoyapitest.login.dto.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationResDto {
    private String outCode;
    private String outMessage;
    private String reqId;
    private String status;
}
