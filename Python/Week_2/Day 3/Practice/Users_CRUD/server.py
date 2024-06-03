from flask import Flask ,render_template, redirect, request
from users import User

app = Flask(__name__)



@app.route('/')
def index():
    return redirect('/users')

@app.route('/users')
def users():
    return render_template('all_users.html', users=User.get_all())

@app.route('/users/new')
def new_user():
    return render_template('add_user.html')

@app.route('/user/create', methods=['POST'])
def create_user():
    User.save(request.form)
    return redirect('/users')

@app.route('/user/edit/<int:id>' )
def edit(id):
    data = {
        "id": id
    }
    return render_template('edit_user.html', user = User.get_one(data))

@app.route('/user/update', methods=['POST'])
def update():
    User.update(request.form)
    return redirect('/users')






if __name__ == '__main__':
    app.run(debug=True)