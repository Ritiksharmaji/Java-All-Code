<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="dashboard-container">
        <h2>Welcome, ${user.name}</h2>
        <h3>Your Admission Information</h3>
        <table>
            <tr>
                <th>Name</th>
                <td>${user.name}</td>
            </tr>
            <tr>
                <th>Date of Birth</th>
                <td>${user.dob}</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>${user.email}</td>
            </tr>
            <tr>
                <th>Mobile</th>
                <td>${user.mobile}</td>
            </tr>
            <tr>
                <th>Course</th>
                <td>${user.course}</td>
            </tr>
            <tr>
                <th>Address</th>
                <td>${user.address}</td>
            </tr>
        </table>
        <a href="admissionLetter.jsp" class="btn">Generate Admission Letter</a>
        <a href="logout.jsp" class="btn">Logout</a>
    </div>
</body>
</html>
