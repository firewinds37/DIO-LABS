var jogador1 = 0;
var jogador2 = 1;
var placar;

//exemplo IF
if (jogador1 != -1 || jogador2 != -1)
{
    if (jogador1 > 0 && jogador2 == 0)
    {
        console.log("Jogador 1 marcou ponto");
        placar = jogador1 > jogador2;
    } else if (jogador2 > 0 && jogador1 == 0)
    {
        console.log("Jogador 2 marcoou ponto");
        placar = jogador2 > jogador1;
    } 
    else
    {
        console.log("Ninguém marcou ponto");
    }
}

//exemplo switch case (sempre use o break)
switch(placar)
{
    case placar = jogador1 > jogador2:
        console.log("Jogador1 ganhou");
        break;
    case placar = jogador2 > jogador1:
        console.log("Jogador2 ganhou");
        break;
    default:
        console.log("Empate");
}

array1 = ["pos1","pos2","pos3"];
//exemplo de FOR que varre a o array
for (let i in array1)
{
    console.log(i + ": "+array1[i]);
}

//exemplo de FOR que varra o array já retorna o valor ao inves do indice
for (let i of array1)
{
    console.log("Valor:" + i);
}