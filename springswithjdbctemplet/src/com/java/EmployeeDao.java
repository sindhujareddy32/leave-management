package com.java;

import java.util.List;

public interface EmployeeDao {
public void insert(Employee employee);
public List<Employee> fetch();
public void update(Employee employee);
public void delete(Employee employee);

}
