package com.erainfotechbd.binimoyapitest.login.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationReqDto {
    private String mailId;
    private String sessionId;
    private String customerCode;
    private String binimoyUserId;
    private String binimoyUserAlias;
    private String accountNo;
    private String mobileNumber;
    private String binimoyPin;
    private String deviceId;
    private String deviceMobileNo;
    private String deviceLocation;
    private String deviceIpAddress;
}
