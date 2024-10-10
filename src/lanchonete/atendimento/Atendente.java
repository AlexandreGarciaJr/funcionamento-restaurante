package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("Servindo mesa");
    }

    public void pegarLancheCozinha(){
        System.out.println("Pegando lanche na cozinha");
    }

    public void receberPagamento(){
        System.out.println("Recebendo pagamento");
    }

    public void trocarGas(){
        System.out.println("Atentende trocando o gas");
    }

    public void pegarPedidoBalcao(){
        System.out.println("Pegando pedido do balcao");
    }
}
