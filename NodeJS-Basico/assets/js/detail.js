const backButton = document.getElementById('backButton');
const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');

console.log("ID=" + id);

getPokemonDetail = (id) => {
    const url = `https://pokeapi.co/api/v2/pokemon/${id}/`

    console.log(url);

    resposta = fetch(url).then((response) => response.json())
    
    console.log(resposta)

    // return fetch(url)
    // .then((response) => response.json())
    // .then((jsonBody) => jsonBody.results)
    // .then((pokemons) => pokemons.map(pokeApi.getPokemonDetail))
    // .then((detailRequest) => Promise.all(detailRequest))
    // .then((pokemonsDetails) =>  pokemonsDetails)
    // .catch((error) => console.error(error))
}

console.log(getPokemonDetail(id));

backButton.addEventListener('click', () => 
{
    history.back(); 
})