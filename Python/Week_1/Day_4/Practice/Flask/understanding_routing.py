from flask import Flask
app = Flask(__name__) 

# 1) localhost:5000
@app.route('/')         
def hello_world():
    return 'Hello World!'
# 2) localhost:5000/dojo 
@app.route('/dojo')
def dojo():
    return 'Dojo!'
# 3) Create one url pattern and function that can handle the following examples
@app.route('/say/<name>')
def say_flask(name):
    print(name)
    return f"Hi {name}!"

# 4) Create one url pattern and function that can handle the following examples
    #(HINT: path variables are by default passed as strings. How might you handle a number?):
@app.route('/repeat/<int:num>/<string:word>') 
def repeat_name(num, word):
    return (word + "<br>") * num

if __name__=="__main__":
    app.run(debug=True) 