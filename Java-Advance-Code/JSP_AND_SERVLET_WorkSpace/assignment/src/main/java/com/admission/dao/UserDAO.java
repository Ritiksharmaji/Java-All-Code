package com.admission.dao;

import java.sql.*;
import java.util.List;

import com.admission.model.User;
import com.admission.util.DBUtil;

public class UserDAO {
    public int registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (name, dob, email, mobile, address, course, photo, signature, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, user.getName());
            stmt.setDate(2, Date.valueOf(user.getDob()));
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getMobile());
            stmt.setString(5, user.getAddress());
            stmt.setString(6, user.getCourse());
            stmt.setString(7, user.getPhoto());
            stmt.setString(8, user.getSignature());
            stmt.setString(9, user.getPassword());
            return stmt.executeUpdate();
        }
    }

    public User loginUser(String email, String password) throws SQLException {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = DBUtil.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("dob"),
                    rs.getString("email"),
                    rs.getString("mobile"),
                    rs.getString("address"),
                    rs.getString("course"),
                    rs.getString("photo"),
                    rs.getString("signature"),
                    rs.getString("password")
                );
            }
        }
        return null;
    }

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}
}
