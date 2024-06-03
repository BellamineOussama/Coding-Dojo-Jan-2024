
from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE


class Repair:
    def __init__(self, data):
        self.id = data["id"]
        self.description = data["description"]
        self.cost = data["cost"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]


    #* C R U D
        
    @classmethod
    def read_all(cls):

        query = """
                    SELECT * FROM repairs;
                """
        
        results = connectToMySQL(DATABASE).query_db(query)

        all_repairs = []

        for row in results:
            one_repair = cls(row)
            all_repairs.append(one_repair)
        return all_repairs
    
    #* CREATE

    @classmethod
    def create(cls, data):

        query = """
                    INSERT INTO repairs (description, cost, car_id)
                    VALUES (%(description)s, %(cost)s, %(car_id)s);
                """

        return connectToMySQL(DATABASE).query_db(query, data)

