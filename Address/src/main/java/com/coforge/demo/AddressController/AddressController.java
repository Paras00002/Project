package com.coforge.demo.AddressController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.coforge.demo.model.Address;
import com.coforge.demo.service.AddressService;


@Controller
public class AddressController {
	@Autowired
	private AddressService service;
	
	@GetMapping("/getAddress")
	public java.util.List<Address> getall() {
	   return service.getAddress();
	}
	
}
