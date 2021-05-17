package com.topov.eagency.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EAgentFeedback {
    private Long eAgentFeedbackId;
    private Integer customerEvaluation;
    private Integer sellerEvaluation;
    private String content;
    private Long eAgentId;
}
