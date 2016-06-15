package edu.news.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.news.dao.DAONews;
import edu.news.dao.exception.DAOException;
import edu.news.model.News;

@Controller
public class AdminController {
	DAONews dao;

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
		dao = new DAONews(News.class);
		System.out.println(news);
		dao.save(news);
		model.addAttribute("message","Đăng tin thành công!");
		return "result";

	}
	@RequestMapping(value = "test", method =  RequestMethod.GET)
	public ModelAndView test(Model model) {
		return new ModelAndView("admin_dangtin", "news", new News());

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
