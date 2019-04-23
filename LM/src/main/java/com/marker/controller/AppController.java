package com.marker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marker.model.MarkerData;
import com.marker.service.MarkerService;

@Controller
public class AppController {
	
	@Autowired
	MarkerService markerService;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
 
        List<MarkerData> users = markerService.findAll();
        model.addAttribute("users", users);
        return "allusers";
    }
 
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	    public String newEmployee(ModelMap model) {
          MarkerData mdata = new MarkerData();
		  model.addAttribute("mdata", mdata);

		  //model.addAttribute("edit", false);
	    
		  return "registration";
	}
	 
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveEmployee(@Valid MarkerData markerData, BindingResult result,
            ModelMap model) {
 
        if (result.hasErrors()) {
            return "registration";
        }
 
        /*
         * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation 
         * and applying it on field [ssn] of Model class [Employee].
         * 
         * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
         * framework as well while still using internationalized messages.
         * 
         */
//        if(!markerService.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
//            FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
//            result.addError(ssnError);
//            return "registration";
//        }
         
        markerService.saveMarkerData(markerData);;
 
        model.addAttribute("success", "markerData " + markerData.getState() + " registered successfully");
        return "success";
    }
	  
}
