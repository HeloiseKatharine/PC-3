function potenciacao() { 
    var num_a =  document.getElementById('num_a')
    var num_b =  document.getElementById('num_b')

    var resultado = Math.pow(Number(num_a.value), Number(num_b.value)); 

    res.innerHTML += `O resultado é ${resultado}`
}