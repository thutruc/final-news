package edu.news.controller;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.news.dao.*;
import edu.news.dao.exception.DAOException;
import edu.news.model.News;

@Controller
public class AdminController {
	DAO dao;

	@RequestMapping(value = "trangchu")
	public String trangchu() {
		return "trangchu";
	}

	@RequestMapping(value = "dangky")
	public String dangky() {
		return "dangky";

	}

	@RequestMapping(value = "dangnhap")
	public String dangnhap() {
		return "dangnhap";
	}

	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public ModelAndView admin(Model model) {
		return new ModelAndView("admin", "new", new News());

	}
	@RequestMapping(value="addNews", method = RequestMethod.GET)
	public String addNews(News news, Model model) throws DAOException {
		System.out.println("addNews....");
		dao = new DAONews(News.class);
		java.util.Date d = news.getDate();
		int day = d.getDay();
		int month = d.getMonth();
		int year = d.getYear();
		Date dSQL = new Date(year, month, day);
		News n = new News(news.getContent(), dSQL, news.getImg(), news.getNewsBrief(), news.getTitle(),  news.getType());
		System.out.println(n);
		dao.save(n);
		model.addAttribute("message","Đăng tin thành công!");
		return "trangchu";

	}
	@RequestMapping(value = "postNews", method =  RequestMethod.GET)
	public ModelAndView test(Model model) {
		dao = new DAOModel(edu.news.model.Model.class);
		List<String> lstType = new ArrayList<String>();
		
		return new ModelAndView("admin_dangtin", "news", new News());

	}
	public String model(){
		return "";
	}

	@RequestMapping(value = "student", method = RequestMethod.GET)
	public ModelAndView student(Model model) {

		return new ModelAndView("test", "student", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(Student student, Model model) {
		System.out.println("student....." + student);
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
	

}
