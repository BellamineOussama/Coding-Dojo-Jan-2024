from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.cars import Car

#* View Route
@app.route("/home")
def home():
    all_cars = Car.get_all()
    return render_template("home.html", all_cars = all_cars)

#* View Route
@app.route("/cars/create")
def display_form():

    return render_template("newCar.html")

#! Action Route
@app.route("/cars/new", methods=["POST"])
def create_car():
    Car.save(request.form)
    #! NEVER EVER EVER render on a post request
    return redirect("/home")

#* View Route
@app.route("/cars/edit/<int:id>")
def display_update_form(id):
    # fetch the car by id
    car_dict = {
        "id": id
    }

    one_car = Car.get_one_by_id(car_dict)
    print("===>", one_car)

    return render_template("edit.html", car= one_car)

#! Action Route
@app.route("/cars/update/<int:id>", methods=["POST"])
def update_car(id):
    updated_car = {
        "id": id,
        "make": request.form["make"],
        "model": request.form["model"],
        "color": request.form["color"],
    }


    Car.update(updated_car)
    
    return redirect("/home")

#* View Route
@app.route("/cars/<int:id>")
def display_one_car_repairs(id):
    # fetch the car by id
    car_dict = {
        "id": id
    }

    # one_car = Car.get_one_by_id(car_dict)
    this_car_repairs = Car.get_one_car_repairs(car_dict)


    return render_template("oneCar.html", car= this_car_repairs)