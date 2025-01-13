package com.amit;

public class Employee {

	private Integer id;

	private String name;

	private String departmentName;
	
	

	private Long salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, String departmentName, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;

		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departmentName=" + departmentName + ", salary=" + salary
				+ "]";
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	

}
