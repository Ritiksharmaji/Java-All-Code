package com.springcore.jdbc_2.WithXmlConfiguration;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.entities.Student;

public class StudentDaoIm implements StudentDao {
	
	
	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	@Override
	public int insert(Student student) {
		 // insert query
        String query = "insert into student(id,name,city)values(?,?,?)";
        int r = this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	
	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		// update method
		String updateQuery = "update student set name=?,city=? where id=?";
		int update = this.jdbctemplate.update(updateQuery,student.getName(),student.getCity(),student.getId());
		return update;
	}
	@Override
	public int delete(int studentid) {
		// TODO Auto-generated method stub
		// Delete method
		String deleteQuery = "delete from student where id=?";
		int deleted = this.jdbctemplate.update(deleteQuery, studentid);
		return deleted;
	}
	@Override
	public Student getStudent(int studentid) {
		// TODO Auto-generated method stub
		// select method
		String selectQuery = "select * from student where id =?";
		// creating object for RowMapper interface by RowMapperImp class
		RowMapper<Student> rowmapper = new RowMapperImp();
		Student queryForObject = this.jdbctemplate.queryForObject(selectQuery, rowmapper,studentid);
		return queryForObject;
	}
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		// selecting multiple records
		String selectQuery = "select * from student";
		// creating object for RowMapper interface by RowMapperImp class
		RowMapper<Student> rowmapper = new RowMapperImp();
		List<Student> queryForMltipleObject = this.jdbctemplate.query(selectQuery, rowmapper);
		return queryForMltipleObject;
	}
	
	

	

	

	
	

}
