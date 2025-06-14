package com.map.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Developer {
		@Id
	    private int did;
		private String name;
		
		@ManyToMany
		@JoinTable(
		name = "dev_proj",
		joinColumns = {@JoinColumn(name="dId")},
		inverseJoinColumns = {@JoinColumn(name="pId")}
		)
		private List<Project> projects;

		public int getDid() {
			return did;
		}

		public void setDid(int did) {
			this.did = did;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Project> getProjects() {
			return projects;
		}

		public void setProjects(List<Project> projects) {
			this.projects = projects;
		}

		public Developer() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Developer [did=" + did + ", name=" + name + ", projects=" + projects + "]";
		} 
		
}
