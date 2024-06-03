from mysqlconnection import connectToMySQL
DATABASE = 'first_flask'

class Friend:
    def __init__(self, data):
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.occupation = data['occupation']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    # READ ALL
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM friends;"
        results = connectToMySQL(DATABASE).query_db(query)
        friends =[]
        for friend in results:
            friends.append(cls(friend))
        return friends
    
    # Create
    @classmethod
    def save(cls, data):
        query = """INSERT INTO friends (first_name, last_name, occupation)
        VALUES(%(first_name)s, %(last_name)s, %(occupation)s);"""
        return connectToMySQL(DATABASE).query_db(query, data)
    
    # READ ONLY ONE  
    @classmethod 
    def get_one(cls, id):
        query = """SELECT * FROM friends 
        WHERE id = %(id)s)"""
        results = connectToMySQL(DATABASE).query_db(query,{"id":id})
        return cls(results[0])
        