package org.dao.daoImp;

import java.util.List;

import javax.annotation.Resource;

import org.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class BaseDaoImp<T> implements BaseDao<T> {
	
	@Resource
	private SessionFactory sf;
	
	@Override
	public List<T> selectAll(String sql,T t) {
		Session session = sf.getCurrentSession();
		SQLQuery sqlQuery = session.createSQLQuery(sql);
		sqlQuery.addEntity(t.getClass());
		List list = sqlQuery.list();
		return list;
	}

	@Override
	public void add(T t) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(t);
	}

	@Override
	public void del(Integer id,T t) {
		Session session = sf.getCurrentSession();
		T t1 = (T) session.get(t.getClass(), id);
		session.delete(t1);
	}

	@Override
	public T selectById(Integer id, T t) {
		System.out.println("baseDaoImp"+id);
		System.out.println("baseDaoImp"+t);
		Session session = sf.getCurrentSession();
		T t1 = (T) session.get(t.getClass(), id);
		return t1;
	}

	

}
