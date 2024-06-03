from flask import Flask, render_template, request, redirect, session
app = Flask(__name__)
app.secret_key = 'keep it secret, keep it safe' # set a secret key for security purposes



# @app.route('/form')
# def display_from():
#     return render_template('form.html')


# # ? ACTION ROUTE
# @app.route('/process', methods=['POST'])
# def process_payment():
#     # print("=" * 60)
#     # print(request.form)
#     print("=" * 60)
#     # print(request.form["name"])
#     # print(request.form["card"])
#     # print(request.form["amount"])
#     session["username"] = request.form["name"]
#     session["card_number"] = request.form["card"]
#     session["amount"] = request.form["amount"]
#     # print(f"YOUR NAME IS {name} \n YOUR CARD : {card} \n You just payed {amount} $$$")
#     return redirect('/success')


# # * VIEW ROUTE
# @app.route('/success')
# def sucess():
#     return render_template('success.html')

# #! CLEAR ROUTE
# @app.route('/clear')
# def clear():
#     # session.pop('username')
#     session.clear()
#     return redirect('/form')


#! VIEW ROUTE
@app.route('/visit')
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
    return redirect('/visit')


@app.route('/reset')
def reset():
    session["counter"] = 0
    return redirect('/visit')





if __name__ == '__main__':
    app.run(debug=True)
