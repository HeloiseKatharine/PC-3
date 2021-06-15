function calculo(matriz) {
    const count = matriz.length;
    let result = 0;
    for(let i = 0; i < count; i++) {
      result += matriz[i][i];
    }
    return result;
  }
  
  const matriz = [[15,-8,15,9],[1,12,70,-9],[0,-4,0,-8],[-5,6,0,2]];
  
  console.log(calculo(matriz));