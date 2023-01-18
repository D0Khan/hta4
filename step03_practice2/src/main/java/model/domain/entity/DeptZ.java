package model.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

public class DeptZ {
	@Id
	@NonNull
	private int deptno;
	
	private String dname;
	
	private String loc;
	
	@OneToMany(mappedBy = "deptno")
	private List<EmpZ> empZ = new ArrayList<EmpZ>();
	
	//���� : �Ʒ� ������ ��Ʈ�� �ּ� ó���� �ֳ����̼��� ����ؼ� RunningTest�� ������ �ذ� �Ͻÿ�.
	public DeptZ(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
}
