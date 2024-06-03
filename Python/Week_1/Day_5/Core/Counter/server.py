
from flask import Flask, render_template, request, redirect, session
app = Flask(__name__)
app.secret_key = 'keep it secret, keep it safe' # set a secret key for security purposes


#! VIEW ROUTE
@app.route('/counters')
def display_page():
    if 'counter' in session:
        session["counter"] += 1
    else:
        session["counter"] = 0
    return render_template('index.html', counter=session["counter"])

@app.route('/increment')
def increment():
    if 'counter'  in session:
        session["counter"] += 1
    return redirect('/counters')


@app.route('/reset')
def reset():
    session["counter"] = 0
    return redirect('/counters')





if __name__ == '__main__':
    app.run(debug=True)