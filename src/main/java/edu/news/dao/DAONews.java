package edu.news.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.news.dao.exception.DAOException;
import edu.news.model.Comment;
import edu.news.model.News;

public class DAONews extends DAO<News, Long> {

	public DAONews(Class<News> entytiClass) {
		super(entytiClass);
		// TODO Auto-generated constructor stub
	}
	public Long saveNews(News news) throws DAOException {
		System.out.println();
		return this.save(news);
	}
	public static void main(String[] args) throws DAOException {
		java.sql.Date d = new java.sql.Date(2016, 6, 14);
		News n = new News("title1", "img1", "content1", d, "type1");
		DAONews dao = new DAONews(News.class);
		dao.save(n);
	} 
}
