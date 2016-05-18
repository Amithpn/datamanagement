package com.dman.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author amithpan
 *
 */
@RestController
@RequestMapping("/mm")
public class MaterialMgmtController {
	
	private static final Logger logger = LoggerFactory
            .getLogger(MaterialMgmtController.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.POST, headers = "Accept=application/json")
	public String commonTest(@RequestParam(value = "test", required = true) String type) {
		
		String msg = "success";
		
		logger.info("Successfully hitting the controller");
		
		return msg;

    }

}
