package com.topov.eagency.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    protected String fistName;
    protected String lastName;
    protected String password;
    protected String confirmPassword;
    protected String phone;
    protected String email;
    protected String rntrc;
    protected String citizenId;
}
