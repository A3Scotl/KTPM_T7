const mysql = require("mysql2");

const db = mysql.createConnection({
    host: "mysql",
    user: "root",
    password: "rootpassword",
    database: "mydb"
});

db.connect((err) => {
    if (err) {
        console.error("MySQL connection error:", err);
    } else {
        console.log("Connected to MySQL database!");
    }
});

module.exports = db;