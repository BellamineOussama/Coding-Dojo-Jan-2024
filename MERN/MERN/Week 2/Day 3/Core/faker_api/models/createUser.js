const { faker } = require("@faker-js/faker")

const createUser = () => {
    const user ={
        password : faker.internet.password(),
        email : faker.internet.password(),
        phoneNumber : faker.number.int(),
        lastName : faker.person.lastName(),
        firstName : faker.person.firstName(),
        _id : faker.string.uuid().toString(),
    }
    return user;
}

module.exports = createUser 