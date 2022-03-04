package com.javaspring.api.controller;




import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javaspring.api.entity.Student;

//import com.javaspring.api.repository.StudentRepository;
import com.javaspring.api.service.studentService;

@RestController
public class StudentController {
	@Autowired
	private studentService service;
	
	@RequestMapping("/")
	public ModelAndView begin()
	{
		return new ModelAndView("actualindex");
	}
	
	@RequestMapping(value="/putName",method=RequestMethod.POST)
	public ModelAndView putName(Student stud,BindingResult bind){
		
		
		if(stud.getName()==""||stud.getName().length()==0)
		{
			return new ModelAndView("error");
		}
		
		System.out.println("hello im inside"+stud.getName());
		
		
		if(bind.hasErrors()) {
			System.out.println("Binding error");
			return new ModelAndView("error");
			}
		else
		{
			try {
				service.newadd(stud);
				
			}catch(Exception e)
			{
				System.out.println("ERR"+e);
				return new ModelAndView("error");
				
			}
		}
			
		
		return new ModelAndView("import"); 
		
	}
	
	@GetMapping("/getName")
	public List<Student> getName(){
		return service.every();
	}

}
