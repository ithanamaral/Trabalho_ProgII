package Trabalho_ProgII;


interface IngredientesControle {
    void adicionar(String nome);
}


class IngredienteAdicionado implements IngredientesControle {
    public void adicionar(String nome) {
        System.out.println("Adicionando: " + nome);
    }
}


class IngredientesPermitidos implements IngredientesControle {
    private IngredienteAdicionado ingredienteAdicionado = new IngredienteAdicionado();
    private static final String ingrediente_proibido = "Açúcar";

    public void adicionar(String nome) {
        if(nome.equals(ingrediente_proibido)){
            System.out.println("⛔ ERRO: Ingrediente proibido! \" + nome + \" não pode ser adicionado.");}
        else{
        ingredienteAdicionado.adicionar(nome);}

    }
}


public class Proxy{
    public static void main(String[] args) {
        IngredientesPermitidos controle = new IngredientesPermitidos();

        controle.adicionar("Chocolate Diet");
        controle.adicionar("Maizena");
        controle.adicionar("Açúcar"); // Esse deve ser bloqueado
        controle.adicionar("Leite");
    }
}