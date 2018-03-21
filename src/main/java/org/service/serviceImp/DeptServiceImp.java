package org.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.dao.DeptDao;
import org.pojo.Dept;
import org.pojo.Emp;
import org.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptServiceImp implements DeptService{

	@Resource
	private DeptDao dd;

	@Override
	public List<Dept> selectAll(String sql, Dept dept) {
		List<Dept> selectAll = dd.selectAll(sql, dept);
		return selectAll;
	}

}
