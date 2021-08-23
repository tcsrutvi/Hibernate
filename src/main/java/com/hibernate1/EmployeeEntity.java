package com.hibernate1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity

@Table(name = "Employee", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "EMAIL") })

public class EmployeeEntity implements Serializable {
 
    private static final long serialVersionUID = -1798070786993154676L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer employeeId;
    
 
    @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
    private String email;
 
    @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
    private String firstName;
 
    @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
    private String lastName;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 
    // Accessors and mutators for all four fields
    
    
    
}
//@Entity
//public class EmployeeEntity {
//	
//		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
//		private Integer id;
//		private String name;
//		private int age;
//		private Date dob;
//		private String streetName;
//		
//
//		public String getStreetName() {
//			return streetName;
//		}
//
//		public void setStreetName(String streetName) {
//			this.streetName = streetName;
//		}
//
//		public Date getDob() {
//			return dob;
//		}
//
//		public void setDob(Date dob) {
//			this.dob = dob;
//		}
//
//		public int getAge() {
//			return age;
//		}
//
//		public void setAge(int age) {
//			this.age = age;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public Integer getId() {
//			return id;
//		}
//
//		public void setId(Integer id) {
//			this.id = id;
//}
//}
//
