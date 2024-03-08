package com.drew.springtraining.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Error {
    private String code;

    private ErrorDetails errorDetails;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ErrorDetails{
        private String errorCode;
        private String errorMessage;
    }
}
