package com.caogen.blog.entity;

import java.util.Date;

@SuppressWarnings("serial")
public class Blog implements java.io.Serializable {
	
	private int blogId;					//主键ID
	
	private String blogName;			//博客名称
	
	private String blogImg;				//博客图片
	
	private String introduction;		//博客介绍
	
	private String content;				//博客内容
	
	private Date time;					//发布时间
	
	private int browse;					//浏览数量
	
	private int praise;					//赞的数量
	
	private String blogType;			//博客类型
	
	private String reprintedUrl;		//转载Url

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getBlogImg() {
		return blogImg;
	}

	public void setBlogImg(String blogImg) {
		this.blogImg = blogImg;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getBrowse() {
		return browse;
	}

	public void setBrowse(int browse) {
		this.browse = browse;
	}

	public int getPraise() {
		return praise;
	}

	public void setPraise(int praise) {
		this.praise = praise;
	}

	public String getBlogType() {
		return blogType;
	}

	public void setBlogType(String blogType) {
		this.blogType = blogType;
	}

	public String getReprintedUrl() {
		return reprintedUrl;
	}

	public void setReprintedUrl(String reprintedUrl) {
		this.reprintedUrl = reprintedUrl;
	}

	@Override
	public String toString() {
		return "Blog{" +
				"blogId=" + blogId +
				", blogName='" + blogName + '\'' +
				", blogImg='" + blogImg + '\'' +
				", introduction='" + introduction + '\'' +
				", content='" + content + '\'' +
				", time='" + time + '\'' +
				", browse=" + browse +
				", praise=" + praise +
				", blogType='" + blogType + '\'' +
				", reprintedUrl='" + reprintedUrl + '\'' +
				'}';
	}
}
