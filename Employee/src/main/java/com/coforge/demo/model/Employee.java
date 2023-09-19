package com.coforge.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

@Id
private int EMP_Id;
private String firstname;
private String lastname;
private String dept;
private int age;
private int salary;
public int getEMP_Id() {
	return EMP_Id;
}
public void setEMP_Id(int eMP_Id) {
	EMP_Id = eMP_Id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [EMP_Id=" + EMP_Id + ", firstname=" + firstname + ", lastname=" + lastname + ", dept=" + dept
			+ ", age=" + age + ", salary=" + salary + "]";
}

}
