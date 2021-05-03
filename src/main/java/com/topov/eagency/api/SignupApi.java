package com.topov.eagency.api;

import com.topov.eagency.api.dto.EAgentSignupRequest;
import com.topov.eagency.api.dto.SignupRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/signup")
public class SignupApi {

    @GetMapping(value = "/customer")
    public String signupCustomerGet() {
        return "customerRegistration";
    }

    @GetMapping(value = "/seller")
    public String signupSellerGet() {
        return null;
    }

    @GetMapping(value = "/agent")
    public String signupEAgentGet() {
        return "eagentRegistration";
    }

    @PostMapping(value = "/customer")
    public ModelAndView signupCustomerPost(SignupRequest request) {
        return null;
    }

    @PostMapping(value = "/seller")
    public ModelAndView signupSellerPost(SignupRequest request) {
        return null;
    }

    @PostMapping(value = "/agent")
    public ModelAndView signupEAgentPost(EAgentSignupRequest request) {
        return null;
    }

    @ModelAttribute(value = "signupRequest")
    public SignupRequest signupRequest() {
        return new SignupRequest();
    }

    @ModelAttribute(value = "eAgentSignupRequest")
    public EAgentSignupRequest eAgentSignupRequest() {
        return new EAgentSignupRequest();
    }
}
