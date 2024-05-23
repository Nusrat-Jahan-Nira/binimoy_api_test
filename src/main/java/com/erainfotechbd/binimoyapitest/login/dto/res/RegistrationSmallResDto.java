package com.erainfotechbd.binimoyapitest.login.dto.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationSmallResDto {
    private String Username;
    private String Email;
    private String outCode;
    private String outMessage;
}
