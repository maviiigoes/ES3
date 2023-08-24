 function calcularPrecoTotal(produto: string, quantidade: number): number {
    let precoUnitario: number;

    if (produto === "produtoA") {
        precoUnitario = 10;
    } else if (produto === "produtoB") {
        precoUnitario = 20;
    } else if (produto === "produtoC") {
        precoUnitario = 30;
    } else {
        precoUnitario = 0;
    }

    if (quantidade <= 0) {
        return 0;
    }

    let precoTotal: number;

    if (produto === "produtoA") {
        precoTotal = precoUnitario * quantidade;
    } else if (produto === "produtoB") {
        precoTotal = precoUnitario * quantidade;
    } else if (produto === "produtoC") {
        precoTotal = precoUnitario * quantidade;
    } else {
        precoTotal = 0;
    }

    return precoTotal;
}

//---------------MODIFICAÇOES------------

/*  function calcularPrecoTotal(produto: string, quantidade: number): number {
    const precosUnitarios: { [key: string]: number } = {
        produtoA: 10,
        produtoB: 20,
        produtoC: 30
    };

    if (!(produto in precosUnitarios) || quantidade <= 0) {
        return 0;
    }

    return precosUnitarios[produto] * quantidade;
}

const produto = "produtoA";
const quantidade = 5;
const precoFinal = calcularPrecoTotal(produto, quantidade);
console.log(`Preço total: $${precoFinal}`);
 

 */