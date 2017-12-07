package com.ssm.entity;

public class User {
	private Integer sid;
	private String sname;
	private Integer age;
	private String gander;
	private String province;
	private Integer tuition;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getgander() {
		return gander;
	}
	public void setgander(String gander) {
		this.gander = gander;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Integer getTuition() {
		return tuition;
	}
	public void setTuition(Integer tuition) {
		this.tuition = tuition;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Integer sid, String sname, Integer age, String gander, String province, Integer tuition) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.gander = gander;
		this.province = province;
		this.tuition = tuition;
	}
	@Override
	public String toString() {
		return "User [sid=" + sid + ", sname=" + sname + ", age=" + age + ", gander=" + gander + ", province=" + province
				+ ", tuition=" + tuition + "]";
	}
	
}
