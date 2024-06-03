from flask_app import app
from flask import render_template, request, redirect
from flask_app.models.repairs import Repair

#* VIEW ROUTE
@app.route("/repairs")
def display_repairs():
    all_repairs = Repair.read_all()
    return render_template("all_repairs.html", all_repairs=all_repairs)

#* VIEW ROUTE
@app.route("/repairs/new/<int:id>")
def display_repair_form(id):

    return render_template("create_repair.html", id= id)

#! ACTION ROUTE

@app.route("/repairs/process", methods=["POST"])
def process_repair():

    Repair.create(request.form)

    return redirect("/repairs")