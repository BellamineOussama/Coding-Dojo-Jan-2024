const Joke = require('../models/jokes.model')


// ! READ ALL 
    module.exports.FindAllJokes = (req,res) => {
        Joke.find()
        .then(allJokes => {
            console.log("All Jokes From DB", allJokes);
            res.status(200).json({data : allJokes, message :'All Jokes List', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(404).json({error})
        }) 
    }

// ! READ ONE
    module.exports.FindOneJokeById = (req,res) => {
        Joke.findOne({_id:req.params.id})
            .then(oneJoke => {
                console.log("Joke Foud", oneJoke);
                if(!oneJoke){
                res.status(404).json({error: "No Joke",ok:false})
                }else{
                    res.status(200).json({data : oneJoke, message :'Joke Found', ok :true})
                }
            })
            .catch( error =>{
                console.log(error);
                res.status(500).json({error})
            }) 
    }

// ! CREATE
    module.exports.CreateNewJoke = (req,res) => {
        Joke.create(req.body)
        .then(newCreateJoke =>{
            console.log("New Joke", newCreateJoke);
            res.status(201).json({data : newCreateJoke, message :'Joke Created with success', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(500).json({error})

        }) 
    }

// ! UPDATE
    module.exports.UpdateOneJoke = (req,res) => {
        Joke.findOneAndUpdate({_id:req.params.id}, req.body, {new: true, runValidators : true})
        .then(updatedJoke => {
            console.log("Updated Joke", updatedJoke);
            res.status(202).json({data : updatedJoke, message :'Joke Updated with success', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(500).json({error})
        }) 
    }

// ! DELETE
    module.exports.deleteOneJoke =(req,res) => {
        Joke.findOneAndDelete({_id:req.params.id})
        .then((deleteJoke) => {
            console.log("Deleted Joke", deleteJoke);
            res.status(200).json({data: deleteJoke, message :'Joke Deleted', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(500).json({error})
        }) 
    }
