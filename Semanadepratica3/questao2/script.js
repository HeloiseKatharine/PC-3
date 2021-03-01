/*Crie um componente que tenha uma caixa de texto que só aceita
números e tenha o rótulo (label) Calcular o fatorial de. O componente
deve ainda possuir um botão calcular que quando acionado deve
calcular o fatorial do número digitado, imprimido o resultado e o
tempo necessário para a execução. (Dica: usar o objeto javascript
Date)
Observaçoẽs:
1 - O resultado deve ser mostrado no formato 53! = XXXXXX (yyy
milisegundos);
2 - O código deve calcular o fatorial e não apenas imprimir uma string
com a resposta.*/

function verificar() {
    var d1, d2;

    d1 = new Date().getTime();
    
    var num1 = document.getElementById('txtnum1')

    var i = Number(num1.value)
    var resultado = i;

    for (var j = 1; j < i; j++) {
        resultado *= j;
    }
    res.innerHTML += `<p> ${resultado}</p>`
    d2 = new Date().getTime();

    res.innerHTML += `<p>( ${d2-d1} milisegundos) </p>`
    res.innerHTML += `<p> or ( ${d2} milisegundos) </p>`
}
