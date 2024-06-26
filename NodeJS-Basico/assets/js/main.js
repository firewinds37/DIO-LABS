
const pokemonList = document.getElementById('pokemonList');
const loadMoreButton = document.getElementById('loadMoreButton');

const maxRecords = 151;
const limit = 5;
let offset = 0;


    //cria os LIs do HTML de cada pokemon
    //const newList = pokemons.map(convertPokemonToLi(pokemon).join(''))

    /*
    const newList = pokemons.map((pokemon) => {
        return convertPokemonToLi(pokemon);
    }
    )*/

    //const newHtml = newList.join('')

    //const listItem = [];
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


    //console.log(newList);



function loadPokemonItens(offset, limit)
{
        pokeApi.getPokemons(offset, limit).then( (pokemons = []) => 
        {
            
            const newHtml = pokemons.map((pokemon) => 
                `
                <a href="detail.html?id=${pokemon.number}">
                    <li class="pokemon ${pokemon.type}">
                        <span class="number">#${pokemon.number}</span>
                        <span class="name">${pokemon.name}</span>
                        <div class="detail">                    
                            <ol class="types">
                             ${pokemon.types.map((type) => `<li class="type ${type}">${type}</li>`).join('')}
                            </ol>
                            <img src="${pokemon.photo}" alt="${pokemon.name}">                
                        </div>
                    </li>
                </a>    
            `).join('');
            pokemonList.innerHTML += newHtml
        }
    )
    .catch( (error) => console.error(error));
}

loadPokemonItens(offset, limit)

loadMoreButton.addEventListener('click', () => 
{ 
    offset += limit
    const qtdRecordNextPage = offset + limit

    if (qtdRecordNextPage >= maxRecords)
    {
        const newLimit = maxRecords - offset;
        loadPokemonItens(offset, newLimit);

        //remove o botao
        loadMoreButton.parentElement.removeChild(loadMoreButton);
    }
    else
    {
        loadPokemonItens(offset, limit);
    }

    
})