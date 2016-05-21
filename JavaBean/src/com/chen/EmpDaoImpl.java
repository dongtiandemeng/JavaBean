package com.chen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EmpDaoImpl implements IEmpDAO {
	private Connection conn = null;//数据库连接对象
	private PreparedStatement pstmt = null;//数据库操作对象
	
	
	public EmpDaoImpl(Connection conn) {//通过构造方法取得数据库连接
		this.conn = conn;
	}

	@Override
	public boolean doCreate(Emp emp) throws Exception {
		boolean flag = false;
		String sql = "INSERT INFO emp (empno,ename,job,hiredate,sal)values(?,?,?,?,?)";
		this.pstmt.setInt(1, emp.getEmpno());
		this.pstmt.setInt(1, emp.getEmpno());
		this.pstmt.setInt(1, emp.getEmpno());
		this.pstmt.setInt(1, emp.getEmpno());
		this.pstmt.setInt(1, emp.getEmpno());
		return false;
	}

	@Override
	public List<Emp> findAll(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp findById(int empno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
