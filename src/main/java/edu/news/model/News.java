package edu.news.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class News {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String img;
	@Column(name="content", columnDefinition="longtext")
	private String content;
	@Type(type="timestamp")
	private Date date;
	@ManyToOne(fetch=FetchType.LAZY)
	private Model model;
	private String newsBrief;
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="news_Id")
	private List<Comment> lstComment;
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(long id, String title, String img, String content, Date date,
			Model model, String newsBrief, List<Comment> lstComment) {
		this.id = id;
		this.title = title;
		this.img = img;
		this.content = content;
		this.date = date;
		this.model = model;
		this.lstComment = lstComment;
		this.newsBrief = newsBrief;
	}
	public News( String content, java.sql.Date d,String img, String newBrief, String title, Model model) {
		this.content = content;
		this.date = d;
		this.img = img;
		this.newsBrief = newBrief;
		this.title = title;
		this.model = model;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Model getType() {
		return model;
	}
	public void setType(Model model) {
		this.model = model;
	}
	public String getNewsBrief() {
		return newsBrief;
	}
	public void setgetNewsBrief(String newsBrief) {
		this.newsBrief = newsBrief;
	}
	public List<Comment> getLstComment() {
		return lstComment;
	}
	public void setLstComment(List<Comment> lstComment) {
		this.lstComment = lstComment;
	}
	@Override
	public String toString() {
		return "News [long=" + id + ", title=" + title + ", img=" + img
				+ ", content=" + content + ", date=" + date + ", type=" + model +", newsBrief="+newsBrief
				 + "]";
	}
	
	

}
