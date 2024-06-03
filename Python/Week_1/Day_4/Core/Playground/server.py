from flask import Flask, render_template
app = Flask(__name__)




@app.route('/play')
def play(num =3):
    return render_template('index.html' , count = num)

@app.route('/play/<int:num>')
def play_one(num):
    return render_template('index.html', count = num)

@app.route('/play/<int:num>/<color>')
def play_two(num, color):
    return render_template('index.html', count = num, color = color)




if __name__=="__main__":
    app.run(debug=True)

