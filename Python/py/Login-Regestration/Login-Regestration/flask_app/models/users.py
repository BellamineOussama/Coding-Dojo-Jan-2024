from flask_app.configs.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash
import re

# regular expression for the email format
EMAIL_REGEX = re.compile(r"^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$")


class User:
    def __init__(self, data) -> None:
        self.id = data["id"]
        self.first_name = data["first_name"]
        self.last_name = data["last_name"]
        self.email = data["email"]
        self.password = data["password"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]

    # save user into the DB
    @classmethod
    def create(cls, data):

        query = """
                INSERT INTO users (first_name, last_name, email, password)
                VALUES(%(first_name)s, %(last_name)s, %(email)s, %(password)s);
                """

        return connectToMySQL(DATABASE).query_db(query, data)

    # get a user by email
    @classmethod
    def get_by_email(cls, data):

        query = """
                    SELECT * FROM users
                    WHERE email = %(email)s;
            """
        result = connectToMySQL(DATABASE).query_db(query, data)

        if len(result) > 1:
            return User(result[0])
        else:
            return False

    # get a user by id
    @classmethod
    def get_by_id(cls, data):

        query = """
                    SELECT * FROM users
                    WHERE id = %(id)s;
            """
        result = connectToMySQL(DATABASE).query_db(query, data)
        print(f"Result---- {result}")
        if len(result) < 1:
            return False
        check=User(result[0])
        print("---------",check)
        return check

    @staticmethod
    def validate_user(data):
        is_valid = True

        if len(data["first_name"]) < 1:
            is_valid = False
            flash("first name is required !", "register")

        if len(data["last_name"]) < 1:
            is_valid = False
            flash("last name is required !", "register")

        if len(data["email"]) < 1:
            is_valid = False
            flash("email is required !")
        # test whether a field matches the pattern
        elif not EMAIL_REGEX.match(data["email"]):
            flash("Invalid email address!", "register")
            is_valid = False
        else:
            email_dict = {"email": data["email"]}
            potential_user = User.get_by_email(email_dict)
            if potential_user:
                is_valid = False
                flash("This email is already taken; Hopefully by you !", "register")

        if len(data["password"]) < 1:
            is_valid = False
            flash("password required", "register")

        elif not data["password"] == data["confirm_password"]:
            is_valid = False
            flash("passwords don't match !", "register")

        return is_valid

    @staticmethod
    def validate_login_user(data):
        is_valid = True

        if len(data["email"]) < 1:
            is_valid = False
            flash("email is required !", "login")
        # test whether a field matches the pattern
        elif not EMAIL_REGEX.match(data["email"]):
            flash("Invalid email address!", "login")
            is_valid = False

        if len(data["password"]) < 1:
            is_valid = False
            flash("password is required !", "login")

        return is_valid
