package com.admission.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {
    // Hash a password using BCrypt
    public static String hashPassword(String password) {
        // Generate a salt and hash the password
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Check if the provided password matches the stored hash
    public static boolean checkPassword(String password, String hashedPassword) {
        // Verify if the password matches the hash
        return BCrypt.checkpw(password, hashedPassword);
    }
}
