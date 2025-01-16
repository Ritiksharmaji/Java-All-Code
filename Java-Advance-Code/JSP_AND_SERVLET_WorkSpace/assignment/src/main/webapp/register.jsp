<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="form-container">
        <h2>Registration Form</h2>
        <form action="register" method="POST" enctype="multipart/form-data">
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" required>

            <label for="dob">Date of Birth:</label>
            <input type="date" name="dob" id="dob" required>

            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required>

            <label for="mobile">Mobile Number:</label>
            <input type="text" name="mobile" id="mobile" required>

            <label for="address">Address:</label>
            <textarea name="address" id="address" required></textarea>

            <label for="course">Course Selection:</label>
            <select name="course" id="course">
                <option value="Engineering">Engineering</option>
                <option value="Medicine">Medicine</option>
                <option value="Science">Science</option>
            </select>

            <label for="photo">Upload Photo:</label>
            <input type="file" name="photo" accept="image/jpeg, image/png" required>

            <label for="signature">Upload Signature:</label>
            <input type="file" name="signature" accept="image/jpeg, image/png, application/pdf" required>

            <label for="password">Password:</label>
            <input type="password" name="password" id="password" required>

            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" name="confirmPassword" id="confirmPassword" required>

            <button type="submit" class="btn">Register</button>
        </form>
        <a href="index.jsp">Back to Home</a>
    </div>
</body>
</html>
