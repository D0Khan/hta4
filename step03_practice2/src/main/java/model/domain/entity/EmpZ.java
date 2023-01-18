package model.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class EmpZ {
	@Id
	private int empno;
	
	@NonNull
	private String ename;
	
	@NonNull
	private String job;
	
	@NonNull
	private int mgr;
	
	@NonNull
	private String hiredate;
	
	@NonNull
	private int sal;
	
	@NonNull
	private int comm;
	
	@ManyToOne
	@JoinColumn(name = "deptno")
	private DeptZ deptno;
	
}
