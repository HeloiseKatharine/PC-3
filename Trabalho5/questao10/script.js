/*. Exibir números primos que estão entre o número 0 e o 200*/

function verificar() { 
    var soma=0
   
    for(var i = 1; i<201; i++){
        
        for(var j = 1; j<=i; j++){
            if(i % j == 0){
                soma = soma + 1
            }
        }
        if(soma == 2){
            res.innerHTML += ` ${i}`
            soma = 0
        }
        else{
            soma = 0
        }
    }
}