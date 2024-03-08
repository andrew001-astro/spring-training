package com.drew.springtraining.controller;

import com.drew.springtraining.model.ChargeItemFilter;
import com.drew.springtraining.model.Error;
import com.drew.springtraining.model.PageableBuilder;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
//@RequiredArgsConstructor
@Tag(name = "Charge Items",
     description = "Charge items API")
@RequestMapping(path = { "${rest.api.base-path}/charge-items" },
                produces = { APPLICATION_JSON_VALUE })
public class ChargeItemController {

    @GetMapping
    @Operation(summary = "get charge items")
    @ResponseStatus(code = HttpStatus.FOUND)
    public ResponseEntity<Error> getChargeItems(
            @ParameterObject
            @ModelAttribute
            ChargeItemFilter chargeItemFilter, //
            @ParameterObject
            @ModelAttribute
            PageableBuilder pageableBuilder, HttpServletRequest request) {

        log.debug("chargeItemFilter: {}", chargeItemFilter);
        log.debug("pageableBuilder: {}", pageableBuilder);

        return ResponseEntity.ok(Error.builder()
                                      .code("404")
                                      .errorDetails(Error.ErrorDetails.builder()
                                                                      .errorCode("NOT_FOUND")
                                                                      .errorMessage("Destination not found")
                                                                      .build())
                                      .build());
    }

}
