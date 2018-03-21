package org.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.dao.EmpDao;
import org.pojo.Emp;
import org.service.EmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpServiceImp  implements EmpService{
	
	@Resource
	private EmpDao ed;

	@Override
	public List<Emp> selectAll(String sql, Emp emp) {
		List<Emp> selectAll = ed.selectAll(sql, emp);
		return selectAll;
	}

	@Override
	public void add(Emp emp) {
		ed.add(emp);
	}

	@Override
	public void del(Integer id, Emp emp) {
	   ed.del(id, emp);
	}

	@Override
	public Emp selectById(Integer id, Emp emp) {
		System.out.println("selectById£º"+id);
		System.out.println("selectById£º"+emp);
		Emp selectById = ed.selectById(id, emp);
		System.out.println(selectById);
		return selectById;
	}


}
