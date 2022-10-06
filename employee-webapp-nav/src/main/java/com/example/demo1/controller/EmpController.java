package com.example.demo1.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo1.entity.Employee;
import com.example.demo1.service.EmpService;



@Controller
public class EmpController {
     
	@Autowired
	private EmpService service;

	@GetMapping("/")
	public String home(Model m) {
		List<Employee>emp=service.getAllEmp();
		m.addAttribute("emp",emp);
		return "index1";
	}
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";
	}
    @PostMapping("/register")
    public 	String empRegister(@ModelAttribute Employee e,HttpSession session) {
    	
    	service.addEmp(e);
    	session.setAttribute("msg", "Emplyoee Added Sucessfully..");
    	return "redirect:/";
    }
    @GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee e=service.getEMpById(id);
		m.addAttribute("emp", e);
		return "edit";
	}
    @PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e, HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Employee Data Updated Sucessfully..");
		return "redirect:/";
	}
    @GetMapping("/delete/{id}")
	public String deleteEMp(@PathVariable int id, HttpSession session) {

    	service.deleteEMp(id);
		session.setAttribute("msg", "Employee Data Deleted Sucessfully..");
		return "redirect:/";
	}
}
