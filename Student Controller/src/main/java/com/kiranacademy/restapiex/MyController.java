package com.kiranacademy.restapiex;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

	// localhost:8080/apicall
	
	@RequestMapping("apicall")
	public String apicall()
	{
		return "apicall";
	}
	
	@RequestMapping("test")
	public ModelAndView test()
	{
		ArrayList<String> arrayList=new ArrayList();
		arrayList.add("JBK");
		arrayList.add("JavaByKiran");
		arrayList.add("KiranAcademy");
	
		// test is a view name
		// model means data which will be displayed on web page test.jsp
		// arrayList is model here
		// data is called modelAttribute and arrayList is it's value
		
		ModelAndView modelAndView=new ModelAndView("test","data", arrayList);
		
		return modelAndView;
	}
}
