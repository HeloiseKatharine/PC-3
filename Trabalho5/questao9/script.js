/*9. Qual é o 1001o número primo?*/

function verificar() { 
    var soma = 0
    var primo = 0
   
    for(var i = 1; i<8000; i++){
        
        for(var j = 1; j<=i; j++){
            if(i % j == 0){
                soma = soma + 1
            }
        }
        if(soma == 2){
            soma = 0
            primo = primo + 1
            if(primo == 1001){
                res.innerHTML += ` ${i}`
            }
        }
        else{
            soma = 0
        }
    }
}