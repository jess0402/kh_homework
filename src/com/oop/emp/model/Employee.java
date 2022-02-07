package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	private int empNo;         // 사번
	private String empName;    // 이름
	private String dept;       // 소속부서
	private String job;        // 직급
	private int age;           // 나이
	private char gender;       // 성별
	private int salary;        // 급여
	private double bonusPoint; // 보너스포인트
	private String phone;      // 핸드폰
	private String address;    // 주소
	
	// 1. 키보드 입력용 메서드
	public void empInput() {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 : ");
		setEmpNo(sc.nextInt());
		System.out.print("이름 : ");
		setEmpName(sc.next());
		System.out.print("소속부서 : ");
		setDept(sc.next());
		System.out.print("직급 : ");
		setJob(sc.next());
		System.out.print("나이 : ");
		setAge(sc.nextInt());
		System.out.print("성별 : ");
		setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트 : ");
		setBonusPoint(sc.nextDouble());
		sc.nextLine();
		System.out.print("핸드폰 : ");
		setPhone(sc.nextLine());
		System.out.print("주소 : ");
		setAddress(sc.nextLine());
		
	}
	
	// 2. emp객체 모든 필드 출력용 메서드
	public void empOutput() {
		System.out.printf("사번 : %d%n", getEmpNo());
		System.out.printf("이름 : %s%n", getEmpName());
		System.out.printf("소속부서 : %s%n", getDept());
		System.out.printf("직급 : %s%n", getJob());
		System.out.printf("나이 : %d%n", getAge());
		System.out.printf("성별 : %c%n", getGender());
		System.out.printf("급여 : %d%n", getSalary());
		System.out.printf("보너스포인트 : %f%n", getBonusPoint());
		System.out.printf("핸드폰 : %s%n", getPhone());
		System.out.printf("주소 : %s%n", getAddress());
	}
	
	// 3. getter/setter 메서드
	
	// setter
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// getter
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
}
