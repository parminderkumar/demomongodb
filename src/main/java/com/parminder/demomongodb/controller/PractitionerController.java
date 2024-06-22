package com.parminder.demomongodb.controller;
import com.parminder.demomongodb.entity.Practitioner;
import com.parminder.demomongodb.service.PractitionerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PractitionerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
@Autowired
    PractitionerService practitionerService;
    @GetMapping("/practitioner")
    public List<Practitioner> getPractitioners() {
        logger.info("Successfully Processed Transaction");
        return practitionerService.getAllPractitioners();
    }

}
