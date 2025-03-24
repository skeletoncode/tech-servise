package com.tech.tech_servise.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ServiceRequestDTO {
    @NotNull
    @NotBlank
    @NotEmpty
    private String serviceName;
//    final int amount = 1;
//    private int id;


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
