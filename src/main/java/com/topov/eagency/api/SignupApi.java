package com.topov.eagency.api;

import com.topov.eagency.api.dto.EAgentSignupRequest;
import com.topov.eagency.api.dto.SignupRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/signup")
public class SignupApi {

    @GetMapping(value = "/customer")
    public String signupCustomerGet() {
        return "customerRegistration";
    }

    @GetMapping(value = "/seller")
    public String signupSellerGet() {
        return "sellerRegistration";
    }

    @GetMapping(value = "/agent")
    public String signupEAgentGet() {
        return "eagentRegistration";
    }

    @PostMapping(value = "/customer")
    public ModelAndView signupCustomerPost(@ModelAttribute("signupRequest") SignupRequest request) {
        return null;
    }

    @PostMapping(value = "/seller")
    public ModelAndView signupSellerPost(@ModelAttribute("signupRequest") SignupRequest request) {
        return null;
    }

    @PostMapping(value = "/agent")
    public ModelAndView signupEAgentPost(@ModelAttribute("eAgentSignupRequest") EAgentSignupRequest request) {
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
