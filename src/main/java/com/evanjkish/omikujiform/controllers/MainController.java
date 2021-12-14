package com.evanjkish.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
    public String index(HttpSession Session, Model model) {
       
		Session.setAttribute("testing", "testing");
		
        return "index.jsp";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submit(
		@RequestParam(value="years", required = false) Integer years,
		@RequestParam(value="city", required = false) String city,
		@RequestParam(value="person", required = false) String person,
		@RequestParam(value="activity", required = false) String activity,
		@RequestParam(value="creature", required = false) String creature,
		@RequestParam(value="comment", required = false) String comment,
		HttpSession session) {
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("activity", activity);
		session.setAttribute("creature", creature);
		session.setAttribute("comment", comment);
		return "redirect:/omikuji/show";
		
	}
	
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
//		Integer showNumber = (Integer) session.getAttribute("number");
//		String showCity = (String) session.getAttribute("city");
//		String showPerson = (String) session.getAttribute("person");
//		String showActivity = (String) session.getAttribute("activity");
//		String showCreature = (String) session.getAttribute("creature");
//		String showComment = (String) session.getAttribute("comment");
		
		return "show.jsp";
	}
}
