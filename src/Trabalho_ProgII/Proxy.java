package Trabalho_ProgII;

// Interface que define o comportamento do controle de ingredientes
interface IngredientesControle {
    void adicionar(String nome);
}

// Classe real que adiciona ingredientes
class IngredienteAdicionado implements IngredientesControle {
    public void adicionar(String nome) {
        System.out.println("Adicionando: " + nome);
    }
}

// Proxy que bloqueia ingredientes proibidos
class IngredientesPermitidos implements IngredientesControle {
    private IngredienteAdicionado ingredienteAdicionado = new IngredienteAdicionado();
    private static final String INGREDIENTE_PROIBIDO = "Glúten";

    public void adicionar(String nome) {
        if (nome.equalsIgnoreCase(INGREDIENTE_PROIBIDO)) {
            System.out.println("⛔ ERRO: Ingrediente proibido! " + nome + " não pode ser adicionado.");
        } else {
            ingredienteAdicionado.adicionar(nome);
        }
    }
}

// Classe principal com a execução do proxy
public class Proxy{
    public static void main(String[] args) {
        IngredientesControle controle = new IngredientesPermitidos();

        controle.adicionar("Chocolate");
        controle.adicionar("Farinha");
        controle.adicionar("Glúten"); // Esse deve ser bloqueado
        controle.adicionar("Ovos");
    }
}