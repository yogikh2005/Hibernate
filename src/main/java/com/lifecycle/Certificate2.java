package com.lifecycle;

import javax.persistence.Embeddable;

/**
 * 
 */
@Embeddable
public class Certificate2 {

	private String course;
	private String duration;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Certificate2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate2(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	
}
