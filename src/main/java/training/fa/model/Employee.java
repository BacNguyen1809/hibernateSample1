package training.fa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/*
	* @author bacng
	* @ Date Jul 17, 2022
*/
@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	@Length(min = 1, max = 50 , message = "first name must between 1 and 50")
	@Column(name = "First_Name")
	private String firstName;
	@NotNull
	@Length(min = 1, max = 50 ,message = "last name must between 1 and 50")
	@Column(name = "Last_Name")
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
	}

}
