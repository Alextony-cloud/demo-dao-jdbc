package model.dao;

import db.DB;
import model.dao.impl.DepartamentJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

	public static DepartmentDao createDepartmentDao() {
		return new DepartamentJDBC(DB.getConnection());
	}
}
