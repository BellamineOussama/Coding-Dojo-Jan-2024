
# Challenge 1: Update the Constructor
class Player:
    def __init__(self, player_info):
        self.name = player_info["name"]
        self.age = player_info["age"]
        self.position = player_info["position"]
        self.team = player_info["team"]
        
# Challenge 2: Create Instances Using Individual Player Dictionaries
kevin = {
    "name": "Kevin Durant", 
    "age": 34, 
    "position": "small forward", 
    "team": "Brooklyn Nets"
}

jason = {
    "name": "Jason Tatum", 
    "age": 24, 
    "position": "small forward", 
    "team": "Boston Celtics"
}

kyrie = {
    "name": "Kyrie Irving", 
    "age": 32,
    "position": "Point Guard", 
    "team": "Brooklyn Nets"
}

# Creating Player instances
player_kevin = Player(kevin)
player_jason = Player(jason)
player_kyrie = Player(kyrie)

# Challenge 3: Make a list of Player instances from a list of dictionaries

players = [
    {"name": "Kevin Durant", "age": 34, "position": "small forward", "team": "Brooklyn Nets"},
    {"name": "Jason Tatum", "age": 24, "position": "small forward", "team": "Boston Celtics"},
    {"name": "Kyrie Irving", "age": 32, "position": "Point Guard", "team": "Brooklyn Nets"},
    {"name": "Damian Lillard", "age": 33, "position": "Point Guard", "team": "Portland Trailblazers"},
    {"name": "Joel Embiid", "age": 32, "position": "Power Forward", "team": "Philadelphia 76ers"},
    {"name": "DeMar DeRozan", "age": 32, "position": "Shooting Guard", "team": "Chicago Bulls"}
]

new_team = [Player(player) for player in players]

# NINJA BONUS: Add a get_team(cls, team_list) @class method
class Player:
    def __init__(self, player_info):
        self.name = player_info["name"]
        self.age = player_info["age"]
        self.position = player_info["position"]
        self.team = player_info["team"]
    
    @classmethod
    def get_team(cls, team_list):
        return [cls(player) for player in team_list]

new_team_method = Player.get_team(players)

