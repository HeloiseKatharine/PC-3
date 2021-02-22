/*7.Encontre os múltiplos de 3 ou 5*/

function verificar() {
    var num = document.getElementById('num')
   
    if(Number(num.value) == 3){
       
        for(var i =0; i<11; i++){
            res.innerHTML += ` ${3*i}`
        }
    }
    else if(Number(num.value) == 5){
        for(var i =0; i<11; i++){
            res.innerHTML += ` ${5*i}`
        }
    }
    else{
        window.alert("Valor errado.")
    }
}
