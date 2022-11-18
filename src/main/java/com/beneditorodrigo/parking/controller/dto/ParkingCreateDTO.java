package com.beneditorodrigo.parking.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParkingCreateDTO {

    private String license;
    private String state;
    private String model;
    private String color;
}
