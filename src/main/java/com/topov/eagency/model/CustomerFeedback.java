package com.topov.eagency.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerFeedback {
    private Long customerFeedbackId;
    private Integer serviceWorkEvaluation;
    private Integer sellerEvaluation;
    private Integer eAgentEvaluation;
    private String content;
    private Long customerId;
}
