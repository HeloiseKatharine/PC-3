/*4. Verificar se o usuário é menor de idade*/

function verificar() {
    var idade = document.getElementById('idade')
    if(Number(idade.value) < 18){
        res.innerHTML += `<p>Usuário é MENOR de idade.</p>`
    }
    else{
        res.innerHTML += `<p>Usuário é MAIOR de idade.</p>`
    }
}
