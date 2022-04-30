package com.nt.model;
    
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="emp")
@Data
public class Employee  {
//	@Id
//	@SequenceGenerator(name = "gen1",sequenceName = "emp_id_seq",allocationSize = 1, initialValue = 1)
//	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empno;
	@Column(length = 20)
	private  String ename;
	@Column(length = 20)
	private  String  job;
	private   Float sal;
	private  String vflag="no";
}