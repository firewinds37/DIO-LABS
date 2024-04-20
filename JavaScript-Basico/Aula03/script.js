//vetores ou arrays

let array1 = ["texto", 1, false];
console.log(array1); //imprime todo o array

console.log(array1[0]);

//FOR EACH - cria uma funcion que varre e imprime o array
array1.forEach(
    function(item, index)
    {
        console.log(item, index);
    }
)

//adiciona item no final do array
array1.push("novo item");

//retira o ultimo item do array
array1.pop();

//retira item do inicio array
array1.shift();

//adiciona um item no inicio do array
array1.unshift("texto");

//retorna o indice que contem aquele valor passado como parametro
console.log(array1.indexOf("texto"));

//fatia o array e retorna para um novo array
novoarray = array1.splice(0, 1) 

//corta o array com o indice de inicio o fim 
array1.splice(0,1); //somente deixa parte do o array do indice zero ate um (incluso)

//OBJETOS EM JAVASCRIPT
let objeto = {string: "texto", number: 1, array: ["i1","i2"]}
console.log(objeto);
console.log(objeto.string); //imprime texto na console


