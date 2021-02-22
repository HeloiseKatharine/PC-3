/*11. Calcule o Delta de uma função de segundo grau*/

function verificar() { 
    var num_a =  document.getElementById('num_a')
    var num_b =  document.getElementById('num_b')
    var num_c =  document.getElementById('num_c')

    var delta = ((Number(num_b.value)**2) - 4 * Number(num_a.value) * Number(num_c.value))

    res.innerHTML += `O delta é ${delta}`
}