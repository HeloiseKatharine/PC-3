/*6. Calcular o IMC do usuário. Use as TAGs: <input>, <button> e <div>*/

function verificar() {
    var peso = document.getElementById('peso')
    var c = document.getElementById('altura')
  
    var imc = Number(peso.value) / (Number(altura.value) * Number(altura.value))
    
    res.innerHTML += `<p>O IMC é: ${imc}.</p>`
}
