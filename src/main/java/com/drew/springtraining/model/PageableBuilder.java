package com.drew.springtraining.model;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageableBuilder {

    private Integer page;

    private Integer size;

    private String sort;

}
