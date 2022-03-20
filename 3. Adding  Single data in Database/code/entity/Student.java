package hibernate.jdbc.entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roll")
	
	private int roll;
	
	

	@Column(name="name")
	private String name;
	
	@Column(name="hobby")
	private String hobby;
	
	
	public Student(String name, String hobby) {
		super();
		this.name = name;
		this.hobby = hobby;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", hobby=" + hobby + "]";
	}

	


	

}
