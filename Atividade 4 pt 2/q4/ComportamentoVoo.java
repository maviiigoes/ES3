package q4;

public interface ComportamentoVoo {
    void voar();
}

class Ave {
    private ComportamentoVoo comportamentoVoo;

    Ave(ComportamentoVoo comportamentoVoo) {
        this.comportamentoVoo = comportamentoVoo;
    }

    void realizarVoo() {
        comportamentoVoo.voar();
    }
}

class Pato extends Ave {
    Pato() {
        super(() -> System.out.println("O pato está voando."));
    }

    void nadar() {
        System.out.println("O pato está nadando.");
    }
}

class Pinguim extends Ave {
    Pinguim() {
        super(() -> System.out.println("O pinguim não voa."));
    }

}
