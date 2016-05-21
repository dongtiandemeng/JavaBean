package com.chen;

import java.util.List;

public interface IEmpDAO {
	/**
	 * 数据库增加的操作，一般以doXX的方式命名
	 * @param emp 要增加的数据对象
	 * @return 是否要增加成功的标志
	 * @throws Exception	有异常交给被调用处处理
	 */
	public boolean doCreate(Emp emp) throws Exception;
	
	/**
	 * 根据雇员编号查询雇员信息
	 * @param keyWord 查询关键字
	 * @return	返回全部的查询结果，每一个Emp对象表示表的一行记录
	 * @throws Exception 有异常交给调用处处理
	 */
	 
	 
	public List<Emp> findAll(String keyWord) throws Exception;
	
	/**
	 * 根据雇员编号查询雇员信息
	 * @param empno	雇员编号
	 * @return	雇员的vo对象
	 * @throws Exception	有异常交给调用处处理
	 */
	public Emp findById(int empno) throws Exception;
	
}
