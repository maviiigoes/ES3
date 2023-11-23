package q4;

class Ave {
    void voar() {
        System.out.println("A ave está voando.");
    }
}

class Pato extends Ave {
    void nadar() {
        System.out.println("O pato está nadando.");
    }
}

class Pinguim extends Ave {
    // Pinguins não voam, então não implementamos o método voar
}
