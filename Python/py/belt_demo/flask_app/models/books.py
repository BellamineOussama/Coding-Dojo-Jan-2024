

class Book:
    def __init__(self, data):
        self.id = data["id"] 
        self.title = data["title"] 
        self.author = data["author"] 
        self.thought = data["thought"] 
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]
        self.user_id = data["user_id"]
        
    @classmethod
    def save(cls, data):
        query = """
                INSERT INTO books (title, author, thought, user_id)
                VALUES (%(title)s, %(author)s, %(thought)s, %(user_id)s)
                """
        return