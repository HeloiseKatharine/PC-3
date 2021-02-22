/*5. Calcule a média aritmética de 3 números*/

function verificar() {
    var num1 = document.getElementById('txtnum1')
    var num2 = document.getElementById('txtnum2')
    var num3 = document.getElementById('txtnum3')
    
    var div = Number(num1.value) + Number(num2.value) + Number(num3.value)

    div = div/ 3
    
    res.innerHTML += `<p>A média aritmética é ${div}.</p>`
  
}
