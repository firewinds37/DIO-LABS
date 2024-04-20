//aperte F12 no browser para ver o valos da variavel
//criar variavel com VARR criar undefined ou nuloo

var vOuF = false;
console.log(typeof(vOuF));

var numero = 1;
console.log(typeof(numero));

var texto = "teste"
console.log(typeof(texto));

//só funciona no escopo do bloco local
let var2 = "teste2";
console.log(var2);

//se a const não for iniciada ele apresenta erro
const pi = "3.14"
console.log(pi);

var escopoGlobal = "global";
console.log(escopoGlobal);

function escopoLocal()
{
    let escopoLocalInterno = "local";
}

console.log(escopoGlobal); //funciona pois eh escopo global
//console.log(escopoLocalInterno); //aprensenta undefined pois esta fora do escopo local

//comparacao em javascript que compara tipos diferntes (entao retorna true)
var compara = '0' == 0 
console.log(compara);

//comparacao em javascript que compara até os tipos (entao retorna true)
var compara2 = '0' === 0 
console.log(compara2);

//calcula o MOD da divisao (resto)
var dividaoInteira = 5 % 3;
console.log(dividaoInteira);

//operadores de logicos (igual ao java && || !)
//e - ou e not respectivamente