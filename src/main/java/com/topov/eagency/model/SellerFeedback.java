package com.topov.eagency.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SellerFeedback {
    private Long sellerFeedbackId;
    private Integer serviceWorkEvaluation;
    private Integer customerEvaluation;
    private Integer eAgentEvaluation;
    private String content;
    private Long sellerId;
}
