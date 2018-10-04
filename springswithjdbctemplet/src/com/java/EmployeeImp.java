package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeImp implements EmployeeDao{
private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Employee employee) {
	
		// TODO Auto-generated method stub
		try {
			
			 String query="insert into spwdata (id,username,password) values(?,?,?)";
			  Object[] args=new Object[]{employee.getId(),employee.getUsername(),employee.getPassword()};
				int i=jdbcTemplate.update(query, args);
				if(i==1){
					System.out.println("Insert Success");
				}else{
					System.out.println("Insert Not Sucess");
				}
			
			}catch(Exception e){
				System.out.println(e);
			}
			
		}

	

	@Override
	public List<Employee> fetch() {
		// TODO Auto-generated method stub
		String query="select * from spwdata";
		List<Employee> ll=new ArrayList<>();
		
		List<Map<String, Object>> l=jdbcTemplate.queryForList(query);
		for(Map<String,Object> m:l){
			Employee e=new Employee();
			e.setId(Integer.parseInt(String.valueOf(m.get("id"))));
			e.setUsername(String.valueOf(m.get("username")));
			e.setPassword(String.valueOf(m.get("password")));
			ll.add(e);
		}
		
		System.out.println(ll);
		return ll;
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		String query="update spwdata set username=?,password=? where id=?";
		Object args[]=new Object[]{employee.getUsername(),employee.getPassword(),employee.getId()};
		int i=jdbcTemplate.update(query,args);
		if(i==1)
		{
			System.out.println("update success");
		}
		else
		{
			System.out.println("update not success");
		}
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		String query="delete spwdata where id=?";
		Object args[]=new Object[]{employee.getId()};
		int i=jdbcTemplate.update(query,args);
		
		if(i==1)
		{
			System.out.println("delete success");
		}
		else
		{
			System.out.println("delete not success");
		}
		
	}

}
