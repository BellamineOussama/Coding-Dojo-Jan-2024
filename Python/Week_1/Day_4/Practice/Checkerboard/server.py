
from flask import Flask, render_template
app = Flask(__name__)

@app.route('/')
def index(num = 8, col = 8):
    return render_template('index.html', count = num, col = col)

@app.route('/<int:num>')
def check_num(num, col = 8):
    return render_template('index.html', count=num, col = col)

@app.route('/<int:num>/<int:col>')
def check_col(num, col):
    return render_template('index.html', count=num, col=col)
    


if __name__ == '__main__':
    app.run(debug=True)