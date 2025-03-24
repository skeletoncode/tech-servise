package com.tech.tech_servise.controller;

import com.tech.tech_servise.dto.ServiceRequestDTO;
import com.tech.tech_servise.dto.ServiceResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Validated
@RequestMapping("/api/v1/service")
@RestController
public class ServiceController {

    ArrayList<ServiceRequestDTO> services = new ArrayList<>();

    @PostMapping
    public Long createService(@Valid @RequestBody ServiceRequestDTO serviceRequestDTO) {
        if(services.isEmpty()) {
            services.add(serviceRequestDTO);
        return 1L;}
        for (ServiceRequestDTO service : services) {
            if(service.getServiceName() == serviceRequestDTO.getServiceName()) {
                System.out.println("такая услуга уже есть");
                return 0L;
            }
            services.add(service);
            return 1L;
        }

        return 0L;
    }

    @GetMapping
    public ServiceResponseDTO serviceResponseDTO(@Positive @RequestParam int id) {

        return null;
    }

    @PostMapping("/services")
    public ArrayList<ServiceRequestDTO> services() {
        return services;
    }

    @PostMapping("/serviceChanger")
    public void changeServices(@NotNull @NotBlank String oldService, @NotNull @NotBlank String newService) {
//        for (ServiceRequestDTO service : services) {
//            if {}
//        }
    }
//    @GetMapping("/{id}")
//    public ServiceResponseDTO serviceResponseDTO() {@RequestParam int id}
//

}
