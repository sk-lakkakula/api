package com.vtt.apps.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtt.apps.model.InvoiceRequest;
import com.vtt.apps.model.MailResponse;
import com.vtt.apps.service.EmailService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EmailController {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private EmailService service;
	
	@PostMapping("/send-email")
	public MailResponse sendEmail(@RequestBody InvoiceRequest request) {
		LOGGER.info("Exec sendEmail ..."+request);
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("Address", request.getAddress());
		model.put("ArrivingDate", LocalDate.now());
		model.put("OrderDate", LocalDate.now());
		model.put("OrderNo", request.getOrderNo());
		model.put("From", request.getFrom());
		model.put("ItemsPrice", request.getItemsPrice());
		model.put("ShippingPrice", request.getShippingPrice());
		model.put("Subject", request.getSubject());
		model.put("To", request.getTo());
		model.put("TotalPrice", request.getTotalPrice());
		return service.sendEmail(request, model);

	}

}
