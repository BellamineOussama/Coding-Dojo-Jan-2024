from flask import Flask

app = Flask(__name__)
DATABASE = "log_and_reg_schema"
app.secret_key = "SHHH, don't share this with anyone or push it into github"
