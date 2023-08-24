/* Q6*/
class PoupancaInvalidaError extends Error {
    constructor(message: string) {
        super(message);
    }
}

class Conta {
    numero: string;
    saldo_conta: number;

    constructor(numero: string, saldo: number) {
        this.numero = numero;
        this.saldo_conta = saldo;
    }
    sacar(valor: number): boolean {
        if (this.saldo_conta - valor >= 0) {
            this.saldo_conta -= valor;
            return true;
        } else {
            console.log("Valor inválido");
            return false;
        }
    }

    depositar(valor: number): void {
        this.saldo_conta += valor;
    }

    consultarSaldo(): number {
        return this.saldo_conta;
    }

    transferencia(contaDestino: Conta, valor: number): boolean {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}

class Poupanca extends Conta {
    private _taxaJuros: number;

    constructor(numero: string, saldo_conta: number, taxaJuros: number) {
        super(numero, saldo_conta);
        this._taxaJuros = taxaJuros;
    }

    renderJuros(): void {
        this.depositar(this.saldo_conta * (this._taxaJuros / 100));
    }

    get taxaJuros() {
        return this._taxaJuros;
    }
}

export class Banco {
    contas: Conta[] = [];

    // ...
/* ------------------------------------------ */
    RenderJuros(conta: Conta): number {
        if (conta instanceof Poupanca) {
            conta.renderJuros();
            return conta.saldo_conta;
        } else {
            throw new PoupancaInvalidaError("Conta inválida!");
        }
    }

//----------------------------------------------
}

class ContaImposto extends Conta {
    constructor(numero: string, saldo_conta: number) {
        super(numero, saldo_conta);
    }

    valorEmConta(): number {
        let imposto = this.saldo_conta - this.saldo_conta * 0.0038;
        this.saldo_conta = imposto;
        return this.saldo_conta;
    }
}
