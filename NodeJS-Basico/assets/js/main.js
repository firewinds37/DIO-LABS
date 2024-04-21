


function convertPokemonToLi(pokemon)
{
    return `
    <li class="pokemon">
    <span class="number">#001</span>
    <span class="name">${pokemon.name}</span>
    <div class="detail">
        <ol class="types">
            <li class="type">Grass</li>
            <li class="type">Poison</li>
        </ol>
        <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg" alt="${pokemon.name}">
    </div>
</li>    
    `
}

const pokemonList = document.getElementById('pokemonList');



    pokeApi.getPokemons().then( (pokemons = []) => 
    {
        //cria os LIs do HTML de cada pokemon
        //const newList = pokemons.map(convertPokemonToLi(pokemon).join(''))

        /*
        const newList = pokemons.map((pokemon) => {
            return convertPokemonToLi(pokemon);
        }
        )*/

        //const newHtml = newList.join('')

        const listItem = [];
        //debugger;
        //console.log(pokemonList);

        //cria os LIs do HTML de cada pokemon
        // for (let i = 0; i< pokemons.length; i++)
        // {
        //     const pokemon = pokemons[i];
        //     //console.log(convertPokemonToLi(pokemon));
        //     //console.log(pokemon.name);
                        
        //     listItem.push(convertPokemonToLi(pokemon));        
        // }

        pokemonList.innerHTML += pokemons.map(convertPokemonToLi).join('')
        //console.log(newList);
    })
    .catch( (error) => console.error(error));
    