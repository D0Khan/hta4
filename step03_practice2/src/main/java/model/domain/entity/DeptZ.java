package model.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor

@Getter
@Setter
@ToString

@Entity

public class DeptZ {
	@Id
	@NonNull
	private int deptno;
	
	private String dname;
	
	private String loc;
	
	@OneToMany(mappedBy = "deptno")
	private List<EmpZ> empZ = new ArrayList<EmpZ>();
	
	//문제 : 아래 생성자 파트를 주석 처리후 애노테이션을 사용해서 RunningTest의 오류를 해결 하시오.
	public DeptZ(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
}
