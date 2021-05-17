package com.topov.eagency.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Customer {
    private String fistName;
    private String lastName;
    private String password;
    private String confirmPassword;
    private String phone;
    private String email;
    private String rntrc;
    private String citizenId;
    private AccessRole role;
}
