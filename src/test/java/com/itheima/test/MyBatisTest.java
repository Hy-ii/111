package com.itheima.test;

import com.itheima.pojo.Employee;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {
    @Test
    public void findByIdTest(){
        //获取sqlSession
        SqlSession session = MyBatisUtils.getSession();
        //执行sql
        Employee employee=session.selectOne("com.itheima.mapper.EmployeeMapper.findEmployeeById",1);
        System.out.println(employee);
        //释放资源
        session.commit();
        session.close();
    }
    @Test
    public void saveTest(){
        Employee employee=new Employee();
        employee.setId(1);
        employee.setAge(50);
        employee.setName("赵六");
        employee.setPosition("经理");
//获取sqlSession
        SqlSession session = MyBatisUtils.getSession();
        //执行sql
        session.update("com.itheima.mapper.EmployeeMapper.save",employee);
        //释放资源
        session.commit();
        session.close();
    }
    @Test
    public void updateEmployeeByIdTest(){
        Employee employee=new Employee();
        employee.setId(4);
        employee.setAge(60);
        employee.setName("赵六六");
        employee.setPosition("员工");
//获取sqlSession
        SqlSession session = MyBatisUtils.getSession();
        //执行sql
        session.update("com.itheima.mapper.EmployeeMapper.updateEmployeeById",employee);
        //释放资源
        session.commit();
        session.close();
    }
    @Test
    public void deleteEmployeeByIdTest(){
        Employee employee=new Employee();
        employee.setId(4);
        employee.setAge(60);
        employee.setName("赵六六");
        employee.setPosition("员工");
//获取sqlSession
        SqlSession session = MyBatisUtils.getSession();
        //执行sql
        session.update("com.itheima.mapper.EmployeeMapper.deleteEmployeeById",4);
        //释放资源
        session.commit();
        session.close();
    }







}
