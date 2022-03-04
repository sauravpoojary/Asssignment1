package com.javaspring.api.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="studentdetails1",uniqueConstraints={
                   @UniqueConstraint(columnNames = "id"),
                   @UniqueConstraint(columnNames = "name")
                  }
)
@Getter
@Setter
public class Student {
	
	@Id
	private String id;

	@Column(unique=true)
	private String name;
	

}
