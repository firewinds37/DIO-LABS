const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');


function loadPokemonDetail(id)
{
    
    detail.getPokemonDetail(id).then( (pokemon = []) =>     
    {                

        //troca a cor de fundo
                
        //pokemonbackground.innerHTML =
        //`
        //<div class="pokemon ${pokemon.type}>
        //`
        

        //troca o nome do pokemon
        pokemonname.innerHTML = 
        `
        <h1 id="namePokemon" class="h1name">${pokemon.name}</h1>
        `
        
        //troca o numero do pokemon
        pokemonnumber.innerHTML = 
        `
        <h1 id="numberPokemon" class="h1number">#${pokemon.number}</h1>
        `
        
        //troca a foto do pokemon
        pokemonphoto.innerHTML = 
        `
        <img id="imgPokemon" class="img-detail" src="${pokemon.photo}" alt="${pokemon.name}">
        `
            


        /*
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
        */
        
    }
    
    )
    .catch( (error) => console.error(error));
    
}


loadPokemonDetail(id)