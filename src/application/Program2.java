package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
	DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
	System.out.println("=== TEST 1: department insert ===");
	Department dep = new Department(null, "drugstore");
	departmentDao.insert(dep);
	System.out.println("Inserted! New Id = " + dep.getId());
	
	System.out.println("=== TEST 2: department update ===");
	 dep = departmentDao.findById(5);
	 dep.setName("Drugstore");
	 departmentDao.update(dep);
	 System.out.println("Update completed!");
	
	 System.out.println("=== TEST 3: department findAll ===");
	 
	 List<Department> list = departmentDao.findAll();
	 for(Department dep1: list) {
		 System.out.println(dep1);
	 }
		
	}
}
