function calculadora()
{
    var operacao;
    var n1;
    var n2;    
    var resultado;      

    function menu()
    {

        operacao = prompt("Escolha sua operacao: \n 1 Soma (+) \n 2 Subtracao (-) \n 3 Multiplicação (*) \n 4 Divisão (/) \n 5 MOD (%) \n 6 Potenciação (**) \n 0 Sair");
  

        if (operacao == "0")
        {
            return
        }
        else
        {
            n1 = Number(prompt("Insira o primeiro valor"));
            n2 = Number(prompt("Insira o segundo valor"));
             
            calcular();    
        }
    }
    

    function calcular()
    {

    
        switch(operacao)
        {
            case "0":
                alert("Até mais");
                break;
            case "1":
                soma()
                menu();
                break;
            case "2":
                subtracao();
                menu();
                break;
            case "3":
                multiplicacao();
                menu();
                break;
            case "4":
                divisao();
                menu();                    
                break;
            case "5":
                MOD();
                menu();                    
                break;
            case "6":
                potenciacao();
                menu();
                break;
            default:
                alert("Escolha um opção válida");
                menu();
        }

        operacao = -1;
    }




    function soma()
    {
        resultado = n1 + n2;
        alert(`${n1} + ${n2} = ${resultado}`);
    }

    function subtracao()
    {
        resultado = n1 - n2;
        alert(`${n1} - ${n2} = ${resultado}`);
    }

    function multiplicacao()
    {
        resultado = n1 * n2;
        alert(`${n1} * ${n2} = ${resultado}`);
    }

    function divisao()
    {
        resultado = n1 / n2;
        alert(`${n1} / ${n2} = ${resultado}`);
    }

    function MOD()
    {
        resultado = n1 % n2;
        alert(`${n1} % ${n2} = ${resultado}`);
    }

    function potenciacao()
    {
        resultado = n1 ** n2;
        alert(`${n1} ** ${n2} = ${resultado}`);
    }

    menu();

}



calculadora();