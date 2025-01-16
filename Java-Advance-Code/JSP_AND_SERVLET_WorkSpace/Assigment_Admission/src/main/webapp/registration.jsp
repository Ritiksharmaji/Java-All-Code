<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admission Registration</title>
    <style>
        form {
            width: 50%;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        input, select, textarea, button {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Admission Registration</h1>
    <form action="submit_registration" method="post" enctype="multipart/form-data">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="mobile">Mobile Number:</label>
        <input type="tel" id="mobile" name="mobile" pattern="[0-9]{10}" required>

        <label for="address">Address:</label>
        <textarea id="address" name="address" required></textarea>

        <label for="course">Course Selection:</label>
        <select id="course" name="course" required>
            <option value="Engineering">Engineering</option>
            <option value="Medicine">Medicine</option>
            <option value="Arts">Arts</option>
        </select>

        <label for="photo">Upload Photo:</label>
        <input type="file" id="photo" name="photo" accept=".jpg,.png,.jpeg" required>

        <label for="signature">Upload Signature:</label>
        <input type="file" id="signature" name="signature" accept=".jpg,.png,.jpeg" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit">Register</button>
    </form>
</body>
</html>
