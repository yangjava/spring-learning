package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 通过UserDAO 实现 user表 增删改查
 */
public class UserDAO extends JdbcDaoSupport {
	// private JdbcTemplate jdbcTemplate;

	// public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	// this.jdbcTemplate = jdbcTemplate;
	// }

	// 添加
	public void save(User user) {
		String sql = "insert into user values(?,?)";
		this.getJdbcTemplate().update(sql, user.getId(), user.getName());
	}

	// 修改
	public void update(User user) {
		String sql = "update user set name = ? where id = ?";
		this.getJdbcTemplate().update(sql, user.getName(), user.getId());
	}

	// 删除 根据id删除
	public void delete(User user) {
		String sql = "delete from user where id = ?";
		this.getJdbcTemplate().update(sql, user.getId());
	}

	// 查询记录总和
	public int count() {
		String sql = "select count(*) from user";
		return this.getJdbcTemplate().queryForInt(sql);
	}

	// 根据id 查询 name
	public String findNameById(int id) {
		String sql = "select name from user where id = ?";
		// String.class返回值类型
		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	// 根据id查询 user对象
	public User findById(int id) {
		String sql = "select * from user where id= ?";
		return this.getJdbcTemplate().queryForObject(sql, new UserRowMapper(),
				id);
	}

	// 查询所有user数据
	public List<User> findAll() {
		String sql = "select * from user";
		return this.getJdbcTemplate().query(sql, new UserRowMapper());
	}

	// rowMapper 就是 将每条记录 转换为 对象
	class UserRowMapper implements RowMapper<User> {
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			// rs 已经指向每一条数据，不需要自己调用 next，将rs指向数据 转换 User对象
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			return user;
		}
	}
}
