package com.example.bhciLogement.logement;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/logement")
public class LogementController {

    private final LogementService logementService;

    private LogementTransformer logementTransformer;

    @GetMapping(path = "list")
    public List<LogementDTO> getLogements(){
        return logementTransformer.convertToDto(logementService.getLogements());
    }
}
