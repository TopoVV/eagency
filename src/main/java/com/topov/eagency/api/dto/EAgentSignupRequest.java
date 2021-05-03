package com.topov.eagency.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EAgentSignupRequest extends SignupRequest {
    private String signupKey;
}
