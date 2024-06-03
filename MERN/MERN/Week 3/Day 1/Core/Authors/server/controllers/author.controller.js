const Author = require ('../models/author.model')

// ! READ ALL 
    module.exports.FindAllAuthors = (req,res) => {
        Author.find()
        .then(allAuthors => {
            console.log("All Authors From DB", allAuthors);
            res.status(200).json({data : allAuthors, message :'All Authors List', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(404).json({error})
        }) 
    }

// ! CREATE
    module.exports.CreateNewAuthor = (req,res) => {
        Author.create(req.body)
        .then(newCreateAuthor =>{
            console.log("New Author", newCreateAuthor);
            res.status(201).json({data : newCreateAuthor, message :'Author Created with success', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(500).json({error})

        }) 
    }

// ! READ ONE
    module.exports.FindOneAuthorById = (req,res) => {
        Author.findOne({_id:req.params.id})
            .then(oneAuthor => {
                console.log("Author Foud", oneAuthor);
                if(!oneAuthor){
                res.status(404).json({error: "No Author",ok:false})
                }else{
                    res.status(200).json({data : oneAuthor, message :'Author Found', ok :true})
                }
            })
            .catch( error =>{
                console.log(error);
                res.status(500).json({error})
            }) 
    }

// ! UPDATE
    module.exports.UpdateOneAuthor = (req,res) => {
        Author.findOneAndUpdate({_id:req.params.id}, req.body, {new: true, runValidators : true})
        .then(updatedAuthor => {
            console.log("Updated Movie", updatedAuthor);
            res.status(202).json({data : updatedAuthor, message :'Author Updated with success', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(500).json({error})
        }) 
    }

    
// ! DELETE
    module.exports.deleteOneAuthor =(req,res) => {
        Author.findOneAndDelete({_id:req.params.id})
        .then((deleteAuthor) => {
            console.log("Deleted Author", deleteAuthor);
            res.status(200).json({data: deleteAuthor, message :'Author Deleted', ok :true})
        })
        .catch( error =>{
            console.log(error);
            res.status(500).json({error})
        }) 
    }



