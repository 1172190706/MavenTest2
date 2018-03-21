package org.web;

import java.util.List;

import javax.annotation.Resource;

import org.dao.DeptDao;
import org.dao.EmpDao;
import org.pojo.Dept;
import org.pojo.Emp;
import org.service.DeptService;
import org.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Resource
	private EmpService es;//员工
	
    @Resource
    private DeptService ds;//部门
	
	@RequestMapping("/list")
	public String list(ModelMap map,Emp emp) {
		String sql = "select * from emp where 1=1";
		if(emp!=null&&emp.getEname()!=null&&!"".equals(emp.getEname())){
			sql+=" and ename like '%"+emp.getEname()+"%'";
		}
		if(emp!=null&&emp.getDept()!=null&&emp.getDept().getDid()!=null){
			sql+=" and did = "+emp.getDept().getDid();
		}
		List<Emp> el = es.selectAll(sql, new Emp());
		map.put("el", el);
		
		String sql1="select * from dept where 1=1";
		List<Dept> dl = ds.selectAll(sql1,new Dept());
		map.put("dl", dl);
		
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(Emp emp) {
		es.add(emp);
		return "redirect:list";
	}
	
	@RequestMapping("/del")
	public String del(Integer eid) {
		es.del(eid, new Emp());
		return "redirect:list";
	}
	
	@RequestMapping("/update")
	public String update(Integer eid,ModelMap map) {
		System.out.println(eid);
		Emp selectById = es.selectById(eid, new Emp());
		map.put("emp", selectById);
		String sql1="select * from dept ";
		List<Dept> dl = ds.selectAll(sql1, new Dept());
		map.put("dl", dl);
		System.out.println("update:"+selectById);
		System.out.println("update:"+dl);
		return "update";
	}
	
	
}
