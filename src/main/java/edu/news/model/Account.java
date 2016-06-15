package edu.news.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String email;
	private String pass;
	private int rule;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="account_Id")
	private List<Comment> lstComment;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long id, String email, String pass, int rule,
			List<Comment> lstComment) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.rule = rule;
		this.lstComment = lstComment;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getRule() {
		return rule;
	}

	public void setRule(int rule) {
		this.rule = rule;
	}

	public List<Comment> getLstComment() {
		return lstComment;
	}

	public void setLstComment(List<Comment> lstComment) {
		this.lstComment = lstComment;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", pass=" + pass
				+ ", rule=" + rule + ", lstComment=" + lstComment + "]";
	}
	
	
}
