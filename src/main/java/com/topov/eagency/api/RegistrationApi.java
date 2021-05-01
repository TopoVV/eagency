package com.topov.eagency.api;

import com.topov.eagency.api.dto.EAgentRegistraionRequest;
import com.topov.eagency.api.dto.RegistraionRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "/register")
public class RegistrationApi {
    @GetMapping(value = "/customer")
    public ModelAndView registerCustomerGet() {

        return null;
    }

    @GetMapping(value = "/customer")
    public ModelAndView registerSellerGet() {

        return null;
    }

    @GetMapping(value = "/customer")
    public ModelAndView registerEAgentGet() {

        return null;
    }

    @PostMapping(value = "/customer")
    public ModelAndView registerCustomerPost(@ModelAttribute("registrationRequest")  RegistraionRequest request) {

        return null;
    }

    @PostMapping(value = "/seller")
    public ModelAndView registerSellerPost(@ModelAttribute("registrationRequest") RegistraionRequest request) {

        return null;
    }

    @PostMapping(value = "/agent")
    public ModelAndView registerEAgentPost(@ModelAttribute("registrationRequest") EAgentRegistraionRequest request) {

        return null;
    }
}
