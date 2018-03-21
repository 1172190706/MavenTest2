package org.dao;

import java.util.List;

public interface BaseDao<T> {
	
	List<T> selectAll(String sql,T t);
	
	void add(T t);
	
	void del(Integer id,T t);
	
	T selectById(Integer id,T t);

}
