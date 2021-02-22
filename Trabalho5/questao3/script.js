/*3. Receber 3 números e informar qual é o maior e o menor*/

function verificar() {
    var num1 = document.getElementById('txtnum1')
    var num2 = document.getElementById('txtnum2')
    var num3 = document.getElementById('txtnum3')
    var maior = Number(num1.value)
    var menor = Number(num1.value)

    if (maior > Number(num2.value)) {

        if (maior > Number(num3.value)) {
            maior = maior
        }
        else {
            maior = Number(num3.value)
        }

        if (menor < Number(num3.value)) {
            menor = menor
            if (menor < Number(num2.value)) {
                menor = menor
            }
            else {
                menor = Number(num2.value)
            }
        }
        else {
            menor = Number(num3.value)

            if (menor < Number(num2.value)) {
                menor = menor
            }
            else {
                menor = Number(num2.value)
            }
        }
    }

    else{
        maior = Number(num2.value)

        if (maior > Number(num3.value)) {
            maior = maior
        }
        else {
            maior = Number(num3.value)
        }

        if (menor < Number(num3.value)) {
            menor = menor
            if (menor < Number(num2.value)) {
                menor = menor
            }
            else {
                menor = Number(num2.value)
            }
        }
        else {
            menor = Number(num3.value)
            
            if (menor < Number(num2.value)) {
                menor = menor
            }
            else {
                menor = Number(num2.value)
            }
        }
    }

    res.innerHTML += `<p>O maior valor informado foi ${maior}.</p>`
    res.innerHTML += `<p>O menor valor informado foi ${menor}</p>`

}
