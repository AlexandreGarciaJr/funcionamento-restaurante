package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural no balcão");
    }
    
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcão(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("Preparando lanche tipo hamburguer");
    }
    
    public void prepararSuco(){
        System.out.println("Preparando Suco");
    }

    public void prepararCombo(){
        prepararLanche();
        prepararSuco();
    }

    public void selecionarIngredientesLanche(){
        System.out.println("Selecionando pão, salada, ovo e carne");
    }

    public void selecionarIngredientesSuco (){
        System.out.println("Selecionando Fruta");
    }

    public void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }

    public void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina liquidficador");
    }

    public void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e o ovo para hamburguer");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }








}
