package org.service;

import java.util.List;

import org.pojo.Emp;

public interface EmpService {

   List<Emp> selectAll(String sql,Emp emp);
	
	void add(Emp emp);
	
	void del(Integer id,Emp emp);
	
	Emp selectById(Integer id,Emp emp);
	
}
