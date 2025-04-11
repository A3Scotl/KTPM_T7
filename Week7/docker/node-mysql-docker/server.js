const express = require("express");
const db = require("./db");

const app = express();
const PORT = 3000;

app.get("/", (req, res) => {
    res.send("Node.js API connected to MySQL!");
});

app.get("/users", (req, res) => {
    db.query("SELECT * FROM users", (err, results) => {
        if (err) {
            console.error("Error querying MySQL:", err);
            res.status(500).send("Database error");
        } else {
            res.json(results);
        }
    });
});

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});