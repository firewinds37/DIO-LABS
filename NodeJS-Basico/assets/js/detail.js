const detail = {}
const backButton = document.getElementById('backButton');

var pokemonname = document.getElementById("namePokemon")
var pokemonnumber = document.getElementById("numberPokemon")
var pokemonphoto = document.getElementById("imgPokemon")
var pokemontable = document.getElementById("tableDetailPokemon")
var pokemonListType = document.getElementById("listTypePokemon")
//var pokemonbackground = document.getElementById("backgroundPokemon")
var pokemonTypeColor = document.getElementById("divPokemonTypeColor")
var pokemon;

function convertApiToPokemonDetail(pokeDetail)
{ 
    
    const pokemon = new PokemonDetail()
    pokemon.number = pokeDetail.id
    pokemon.name = pokeDetail.name
    
    const types = pokeDetail.types.map((typeSlot) => typeSlot.type.name)
    const [type] = types //retorna o primeiro indice do array (types) na nova variavel (type)

    pokemon.types = types
    pokemon.type = type

    pokemon.photo = pokeDetail.sprites.other.dream_world.front_default

    pokemon.height = pokeDetail.height
    pokemon.weight = pokeDetail.weight

    const abilities = pokeDetail.abilities.map((abilitiesability) => abilitiesability.ability.name)
    pokemon.abilities = abilities

    

    return pokemon
}


detail.getPokemonDetail = (id) => {
    const url = `https://pokeapi.co/api/v2/pokemon/${id}/`
    return fetch(url)
    .then((response) => response.json()) 
    .then(convertApiToPokemonDetail) 
}


backButton.addEventListener('click', () => 
{
    history.back(); 
})