package com.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@InterceptorRef(value="logger")

@Namespace("/")
@Action(value="sample" ,results={@Result (name="success",location="/welcome.jsp")})
public class SampleAction {
	
	public String execute() throws Exception {

		System.out.println("SampleAction:ExecutE() using Anotation");
		return "success";
	}

}
