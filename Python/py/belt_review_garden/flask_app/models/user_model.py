import re
from flask import flash
from flask_app.configs.mysqlconnection import MySQLConnection
from flask_app import DB
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$') 


class User:
    def __init__(self, data):
        self.name = data['name']
        self.email = data['email']
        self.password = data['password']
        self.created_at = ['created_at']
        self.updated_at = ['updated_at']
    @classmethod
    def save_user(cls, data):
        query = """
                INSERT INTO users (name, email, password)
                VALUES (%(name)s, %(email)s, %(password)s)
                """
        return MySQLConnection(DB).query_db(query, data)
    
    @classmethod
    def get_by_email(cls, data):
        query = """
                SELECT * FROM users
                WHERE email = %(email)s;
                """
        result = MySQLConnection(DB).query_db(query, data)
        if len(result) < 1:
            return False
        return True

    @staticmethod
    def validate_user(data):
        is_valid = True
        if len(data['name']) < 1:
            flash('Name is required !', "register")
            is_valid = False
        if len(data['name']) < 3:
            flash('Name must be more than 3 characters', "register")
            is_valid = False

        if len(data['email']) < 1:
            flash('Email is required !', "register")
            is_valid = False
        if not EMAIL_REGEX.match(data['email']):
            flash('Invalid Email!', "register")
        elif User.get_by_email({'email': data['email']}):
            flash('Email already exixtant')
            is_valid = False
        
        if len(data["password"]) < 1:
            is_valid = False
            flash("password required", "register")
        elif not data["password"] == data["confirm_password"]:
            is_valid = False
            flash("passwords don't match !", "register")
        
        return is_valid
        
    