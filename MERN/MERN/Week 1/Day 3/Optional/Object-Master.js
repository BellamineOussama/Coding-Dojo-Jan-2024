const pokémon = Object.freeze([
        { "id": 1,   "name": "Bulbasaur",  "types": ["poison", "grass"] },
        { "id": 5,   "name": "Charmeleon", "types": ["fire"] },
        { "id": 9,   "name": "Blastoise",  "types": ["water"] },
        { "id": 12,  "name": "Butterfree", "types": ["bug", "flying"] },
        { "id": 16,  "name": "Pidgey",     "types": ["normal", "flying"] },
        { "id": 23,  "name": "Ekans",      "types": ["poison"] },
        { "id": 24,  "name": "Arbok",      "types": ["poison"] },
        { "id": 25,  "name": "Pikachu",    "types": ["electric"] },
        { "id": 37,  "name": "Vulpix",     "types": ["fire"] },
        { "id": 52,  "name": "Meowth",     "types": ["normal"] },
        { "id": 63,  "name": "Abra",       "types": ["psychic"] },
        { "id": 67,  "name": "Machamp",    "types": ["fighting"] },
        { "id": 72,  "name": "Tentacool",  "types": ["water", "poison"] },
        { "id": 74,  "name": "Geodude",    "types": ["rock", "ground"] },
        { "id": 87,  "name": "Dewgong",    "types": ["water", "ice"] },
        { "id": 98,  "name": "Krabby",     "types": ["water"] },
        { "id": 115, "name": "Kangaskhan", "types": ["normal"] },
        { "id": 122, "name": "Mr. Mime",   "types": ["psychic"] },
        { "id": 133, "name": "Eevee",      "types": ["normal"] },
        { "id": 144, "name": "Articuno",   "types": ["ice", "flying"] },
        { "id": 145, "name": "Zapdos",     "types": ["electric", "flying"] },
        { "id": 146, "name": "Moltres",    "types": ["fire", "flying"] },
        { "id": 148, "name": "Dragonair",  "types": ["dragon"] }
    ]);

    const blistPkmn = pokémon.filter((p) => {
        return p.name[0] === "B"
    });
    // console.log(blistPkmn);

// ? =========================================================================

    const idListPkmn = pokémon.filter((id) => id.id % 3 === 0
    );
    // console.log(idListPkmn);

// ? =========================================================================


    const typePkmn = pokémon.filter((ty) => {
        return ty.types.length >= 2 
    });
    // console.log(typePkmn);
    const flyingPkmn = typePkmn.filter((fly) => {
        return fly.types[1] === "flying"
    }).map((ty) => {
        return `${ty.name} : the first type is ${ty.types[0]}`
    });
    // console.log(flyingPkmn); 

// ? =======================================================================

    const firePkmn = pokémon.filter((fire) =>{
        return fire.types[0] === "fire"
    });
    // console.log(firePkmn); 


//? =========================================================================

    const typPkmn = pokémon.filter((ty) => {
        return ty.types.length >= 2 
    });
// console.log(typPkmn);

// ? =========================================================================
    const namepkmn = pokémon.map((name) => {
        return `name : ${name.name}`
    });
    // console.log(namepkmn);

//? ==========================================================================

    const filterObject = pokémon.filter((id) => id.id > 99)
                                .map((name) => name.name);
    // console.log(filterObject);

//? ==========================================================================

    const x =  pokémon.filter((poison) => poison.types[0] === "poison" || poison.types[1] === "poison");
    // console.log(x);

//? ==========================================================================

//! METHOD ONE
    count = 0 ;
    const normlPokemon = pokémon.filter( nrml => nrml.types[0] === "normal" ).map(() => count ++).length;
    // console.log(normlPokemon);
//! METHOD TWO
    const normalPokemonsCount = pokémon.filter(pokemon => pokemon.types.some(type => type === "normal")).length;
    // console.log(normalPokemonsCount);
//! MRTHOD THREE
    const normalPokemonCount = pokémon.reduce((count, pokemon) => {
        if (pokemon.types.includes("normal")) {
            count++;
        }
        return count;
    }, 0);
        console.log(normalPokemonCount);










