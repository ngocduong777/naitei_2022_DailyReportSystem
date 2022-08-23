package trainingManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import trainingManagementSystem.model.Division;
import trainingManagementSystem.service.DivisionServices;


@Controller
public class AdminController {
	@Autowired
	DivisionServices divisionService;
	
	
	//List all Divisions
	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public String adminIndex(ModelMap model) {
//		model.addAttribute("division", new Division());
		model.addAttribute("listDivisions", this.divisionService.getAllDivision());
		return "admins/index";
	}
	
	
	
	
}
