package com.drew.springtraining.model;

import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChargeItemFilter {
    private String q;
    private Set<ActivationStatus> status;
}
