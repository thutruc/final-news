package edu.news.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@ManyToOne(fetch=FetchType.LAZY)
	private News news;
	@ManyToOne(fetch=FetchType.LAZY)
	private Account account;
	private String content;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(long id, News news, Account account, String content) {
		super();
		this.id = id;
		this.news = news;
		this.account = account;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Comment [long=" + id + ", news=" + news + ", account=" + account
				+ ", content=" + content + "]";
	}
	
	

}
