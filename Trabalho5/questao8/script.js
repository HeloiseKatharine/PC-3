/*Encontre a soma dos termos em uma sequência Fibonacci*/

function verificar() {
    var num = document.getElementById('num')
    var soma=1

    if(Number(num.value) == 0){
       soma = 0
       res.innerHTML += ` ${soma}`
    }
    else if(Number(num.value) == 1 ){
        soma = 1
        res.innerHTML += ` ${soma}`
    }

    else if(Number(num.value) > 1){

        for(var i = 1; i<Number(num.value); i++){
            soma = soma + i
            res.innerHTML += ` ${soma}`
        }
        res.innerHTML += ` ${soma}`
    }
}
