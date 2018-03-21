package org.service;

import java.util.List;

import org.pojo.Dept;
import org.pojo.Emp;

public interface DeptService {
	   List<Dept> selectAll(String sql,Dept dept);
}
