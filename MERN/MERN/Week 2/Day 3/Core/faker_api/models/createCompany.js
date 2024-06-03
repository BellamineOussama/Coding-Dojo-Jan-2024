const { faker } = require("@faker-js/faker");

const createCompany = () => {
    const company = {
        _id : faker.string.uuid(),
        name: faker.company.name(),
        address : {
        street : faker.location.street(),
        city : faker.location.city(),
        state : faker.location.state(),
        zipCode : faker.location.zipCode(),
        country : faker.location.country()
        }

        };
    return company;
};

module.exports = createCompany