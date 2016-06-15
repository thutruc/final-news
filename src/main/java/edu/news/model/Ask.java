package edu.news.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ask {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String email;
	private String content;
	public Ask() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ask(long id, String email, String content) {
		super();
		this.id = id;
		this.email = email;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Ask [long=" + id + ", email=" + email + ", content=" + content
				+ "]";
	}
	
	

}
