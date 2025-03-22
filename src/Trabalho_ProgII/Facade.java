package Trabalho_ProgII;

class Ingredientes{
    public void selecionandoIngredientes(){
        System.out.println("Selecionando Ingredientes...");
    }
}

class JuntarIngredientes{
    public void misturandoIngredientes(){
        System.out.println("Misturando...");
    }
}

class Assar{
    public void assandoBolo(){
        System.out.println("Assando...");
    }
}

class Estoque{
    public void guardandoEstoque(){
        System.out.println("Guardandando no estoque...");
        System.out.println("Guardado no estoque!");
    }
}

class Bolo{
    Ingredientes ingrediente = new Ingredientes();
    JuntarIngredientes juntar = new JuntarIngredientes();
    Assar assar = new Assar();
    Estoque estoque = new Estoque();

    //métodos das classes
    public void criandoBolo() {
    ingrediente.selecionandoIngredientes();
    juntar.misturandoIngredientes();
    assar.assandoBolo();
    estoque.guardandoEstoque();

    }
}


public class Facade{
public static void main(String[] args) {
    Bolo bolo = new Bolo();
    bolo.criandoBolo();
}
}