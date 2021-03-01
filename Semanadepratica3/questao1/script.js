/*Crie um componente que tenha duas caixas de texto que só aceitam
números e tenha os rótulos (label) valor mínimo e valor máximo, checando sempre se o valor mínimo é menor que o valor máximo. O componente deve ainda possuir um botão calcular que quando
acionado deve contar e imprimir quantos números existem entre
valor mínimo e valor máximo (exclusives*) que sejam múltiplos de 2 e
3 simultaneamente. Não deve ser possível calcular se faltar algum
dos números. * exclusives - Ou seja, quantos números existem entre valor mínimo e
valor máximo, excluindo o valor mínimo e valor máximo*/

function verificar() {
    var num1 = document.getElementById('txtnum1')
    var num2 = document.getElementById('txtnum2')
    
    if(Number(num1.value) < Number(num2.value)){

        var i = Number(num1.value)+1
        for(i; i< Number(num2.value); i++){
            if(i%2 == 0 && i%3 == 0 )
            {
                res.innerHTML += `<p> ${i}</p>`
            }
        }
    }
    else{
        window.alert('Valores errados.')
    }
}
