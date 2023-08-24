class PoupancaInvalidaError extends Error {
    constructor(message: string) {
        super(message);
    }
}

class Conta {
    numero: string;
    saldo_conta: number;
    sacar: any;

    constructor(numero: string, saldo: number) {
        this.numero = numero;
        this.saldo_conta = saldo;
    }
/* ---------------------------------- */
    
    depositar(valor: number): void {
        this.saldo_conta += valor;
    }

    consultarSaldo(): number {
        return this.saldo_conta;
    }
/* ---------------------------------------- */
    transferencia(contaDestino: Conta, valor: number): boolean {
        if (!this.sacar(valor)) {
            return false;
        }

        contaDestino.depositar(valor);
        return true;
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

    inserir(c: Conta): void {
        // ...
    }

    alterar(c: Conta): void {
        // ...
    }

    // ...

    RenderJuros(conta: Conta): number {
        if (!(conta instanceof Poupanca)) {
            throw new PoupancaInvalidaError("Conta inválida!");
        }

        conta.renderJuros();
        return conta.saldo_conta;
    }

    // ...
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
