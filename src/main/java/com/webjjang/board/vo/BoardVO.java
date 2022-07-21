package com.webjjang.board.vo;

import java.util.Date;

public class BoardVO {

	private int no;
	private String title, content, writer;
	private Date writerDate;
	private int hit;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriterDate() {
		return writerDate;
	}
	public void setWriterDate(Date writerDate) {
		this.writerDate = writerDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", writerDate=" + writerDate + ", hit=" + hit + "]";
	}
	
	
}
