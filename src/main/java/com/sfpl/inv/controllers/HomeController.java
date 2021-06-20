package com.sfpl.inv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sfpl.inv.models.Stock;

@Controller
public class HomeController {
	
	private Stock[] stockList = null;

	@GetMapping
	public String inventoryStore() {
		
		
		
		
		
		
		
		
		
		
		
		
		
		return "inventory_store";
	}
	
}
