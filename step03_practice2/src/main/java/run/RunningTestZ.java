package run;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.domain.entity.DeptZ;
import model.domain.entity.EmpZ;
import util.DBUtil;

public class RunningTestZ {
	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		DeptZ d1 = new DeptZ(50,"보안", "강원");
		DeptZ d2 = new DeptZ(60,"시설", "경기");
		
		EmpZ e1 = new EmpZ();
		e1.setEmpno(7369);
		e1.setEname("SMITH");
		e1.setJob("CLERK");
		e1.setMgr(7902);
		e1.setHiredate("80/12/17");
		e1.setSal(800);
		e1.setDeptno(d1);
		
		EmpZ e2 = new EmpZ();
		e2.setEmpno(7499);
		e2.setEname("ALLEN");
		e2.setJob("SALESMAN");
		e2.setMgr(7698);
		e2.setHiredate("81/02/20");
		e2.setSal(1600);
		e2.setDeptno(d1);
		
		em.persist(d1);
		em.persist(d2);
		em.persist(e1);
		em.persist(e2);
		
		tx.commit();
		em.close();
	}
}
