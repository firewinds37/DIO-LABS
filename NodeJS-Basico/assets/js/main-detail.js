const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');


function getBackgroundColorTypePokemon(type)
{
    switch(type)
    {
        case "normal":
            return "#a6a877"
        case "grass":
            return "#77c850"
        case "fire":
            return "#ee7f30"
        case "water":
            return  "#678fee"   
        case "ice":
            return "#98d5d7"     
        case "ground":
            return "#dfbf69"          
        case "flying":
            return "#a98ff0"
        case "poison":
            return "a040a0"
        case "fighting":
            return "#bf3029"
        case "electric":
            return "#f7cf2e"
        case "psychic":
            return "#f65687"
        case "dark":
            return "#725847"
        case "rock":
            return "#b8a137"
        case "bug":
            return "#a8b720"
        case "ghost":
            return "#6e5896"
        case "steel":
            return "#b9b7cf"
        case "dragon":
            return "#6f38f6"
        case "fairy":
            return "#f9aec7"
        default:
            return "#c0c0c0";
    }

}


function loadPokemonDetail(id)
{
    
    detail.getPokemonDetail(id).then( (pokemon = []) =>     
    {                

        //troca a cor de fundo
        pokemonTypeColor.style.backgroundColor =  getBackgroundColorTypePokemon(pokemon.type) 

        //adciciona o tipo de pokemon
        const listHtml = 
        `                         
            <ol class="types">
                ${pokemon.types.map((type) => `<li class="type ${type}">${type}</li>`).join('')}
            </ol>                
        `
        pokemonListType.innerHTML = listHtml

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
            
        //monta a tabela com os dados do pokemon
        pokemontable.innerHTML =
        `
        <table>        
        <tr><td class="tdTitle">Heigh:</td><td class="tdInfo">${pokemon.height} cm</td></tr>
        <tr><td class="tdTitle">Weight:</td><td class="tdInfo">${pokemon.weight} g</td></tr>
        <tr><td class="tdTitle">Abilities:</td><td class="tdInfoAbilities">${pokemon.abilities.join()}</td></tr>            
        </table>
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