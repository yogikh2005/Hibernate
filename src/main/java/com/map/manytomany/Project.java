package com.map.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id 
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	@ManyToMany(mappedBy = "projects")
	private List<Developer> developers;
	
	
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", developers=" + developers + "]";
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}
	public Project(int pid, String pname, List<Developer> developers) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.developers = developers;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
