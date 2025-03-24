package Trabalho_ProgII;

// Implementação do Bridge: Interface para Coberturas
interface Cobertura {
    String aplicar();
}

// Implementação concreta: Chantilly
class Chantilly implements Cobertura {
    @Override
    public String aplicar() {
        return "com Chantilly";
    }
}

// Implementação concreta: Ganache
class Ganache implements Cobertura {
    @Override
    public String aplicar() {
        return "com Ganache de Chocolate";
    }
}

// Implementação concreta: Brigadeiro
class Brigadeiro implements Cobertura {
    @Override
    public String aplicar() {
        return "com Cobertura de Brigadeiro";
    }
}

// Abstração do Bridge: Classe Bolo
abstract class BoloBrigde {
    protected Cobertura cobertura;

    public BoloBrigde(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    abstract String preparar();
}

// Implementação concreta: Bolo de Chocolate
class BoloChocolate extends BoloBrigde {
    public BoloChocolate(Cobertura cobertura) {
        super(cobertura);
    }

    @Override
    public String preparar() {
        return "Bolo de Chocolate " + cobertura.aplicar();
    }
}

// Implementação concreta: Bolo de Baunilha
class BoloBaunilha extends BoloBrigde {
    public BoloBaunilha(Cobertura cobertura) {
        super(cobertura);
    }

    @Override
    public String preparar() {
        return "Bolo de Baunilha " + cobertura.aplicar();
    }
}

// Implementação concreta: Bolo de Morango
class BoloMorango extends BoloBrigde {
    public BoloMorango(Cobertura cobertura) {
        super(cobertura);
    }

    @Override
    public String preparar() {
        return "Bolo de Morango " + cobertura.aplicar();
    }
}


public class Brigde {
    public static void main(String[] args) {
        // Criando coberturas
        Cobertura chantilly = new Chantilly();
        Cobertura ganache = new Ganache();
        Cobertura brigadeiro = new Brigadeiro();

        // Criando bolos com diferentes coberturas
        BoloBrigde boloChocolateChantilly = new BoloChocolate(chantilly);
        BoloBrigde boloChocolateGanache = new BoloChocolate(ganache);
        BoloBrigde boloChocolateBrigadeiro = new BoloChocolate(brigadeiro);

        BoloBrigde boloBaunilhaChantilly = new BoloBaunilha(chantilly);
        BoloBrigde boloBaunilhaGanache = new BoloBaunilha(ganache);
        BoloBrigde boloBaunilhaBrigadeiro = new BoloBaunilha(brigadeiro);


        BoloBrigde boloMorangoChantilly = new BoloMorango(chantilly);
        BoloBrigde boloMorangoGanache = new BoloMorango(ganache);
        BoloBrigde boloMorangoBrigadeiro = new BoloMorango(brigadeiro);

        // Exibindo os resultados
        System.out.println("Preparando...");
        System.out.println("Variações dos bolos de Chocolate...");
        System.out.println(boloChocolateChantilly.preparar()); // Bolo de Chocolate com Chantilly
        System.out.println(boloChocolateGanache.preparar());
        System.out.println(boloChocolateBrigadeiro.preparar());
        System.out.println();
        System.out.println("Variações dos bolos de Baunilha...");
        System.out.println(boloBaunilhaChantilly.preparar());
        System.out.println(boloBaunilhaGanache.preparar());
        System.out.println(boloBaunilhaBrigadeiro.preparar());
        System.out.println();
        System.out.println("Variações dos bolos de Morango...");
        System.out.println(boloMorangoChantilly.preparar());
        System.out.println(boloMorangoGanache.preparar());
        System.out.println(boloMorangoBrigadeiro.preparar());
    }
}
