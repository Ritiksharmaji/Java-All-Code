<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admission Letter</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="letter-container">
        <h2>Admission Letter</h2>
        <p>Dear ${user.name},</p>
        <p>We are pleased to inform you that your application for the ${user.course} course has been successfully accepted.</p>

        <h3>Details:</h3>
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
        </table>

        <h3>Photo and Signature:</h3>
        <img src="uploads/${user.photo}" alt="User Photo" />
        <img src="uploads/${user.signature}" alt="User Signature" />

        <form action="generateAdmissionLetterPDF" method="POST">
            <button type="submit" class="btn">Download Admission Letter (PDF)</button>
        </form>
    </div>
</body>
</html>
