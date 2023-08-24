abstract class Conta {
    numero: string;
    saldo_conta: number;

    constructor(numero: string, saldo: number) {
        this.numero = numero;
        this.saldo_conta = saldo;
    }

    abstract executarAcao(): void;
}

class ContaSaque extends Conta {
    constructor(numero: string, saldo: number) {
        super(numero, saldo);
    }
    //------------------
    executarAcao(): void {
        console.log("Valor inválido");
    }
}

class ContaTransferencia extends Conta {
    valor: number;

    constructor(numero: string, saldo: number, valor: number) {
        super(numero, saldo);
        this.valor = valor;
    }
//-------------------
    executarAcao(): void {
        this.saldo_conta -= this.valor;
    }
}

class Banco {
    contas: Conta[] = [];

    RenderJuros(conta: Conta): number {
        conta.executarAcao();
        return conta.saldo_conta;
    }

    // ...
}

/* const banco = new Banco();
const contaSaque = new ContaSaque("12345", 100);
const contaTransferencia = new ContaTransferencia("54321", 200, 50);

banco.contas.push(contaSaque, contaTransferencia);

console.log("Saldo após ação de saque:", banco.RenderJuros(contaSaque));
console.log("Saldo após ação de transferência:", banco.RenderJuros(contaTransferencia));
 */