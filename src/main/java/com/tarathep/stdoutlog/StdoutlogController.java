package com.tarathep.stdoutlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StdoutlogController {

    Logger logger = LoggerFactory.getLogger(StdoutlogController.class);
    
    @GetMapping("/")
    public String Logging(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "loging out at console";
    }
    
}
