from flask import redirect, render_template, request, flash, session
from flask_app import app
from flask_app.models.user_model import User





@app.route('/')
def index():
    return render_template('index.html')

@app.route('/register', methods=['POST'])
def register():
    if not User.validate_user(request.form):
        return redirect('/')
    pw_hash = bcrypt.generate_password_hash(request.form["password"])
    print("=======>", pw_hash)
    data = {**request.form, "password": pw_hash}
    user_id = User.create(data)
    session["user_id"] = user_id
    return redirect("/")
    

