// Classe Lanchonete é a aplicação principal que utiliza a classe FilaPedidos
public class Lanchonete {
    public static void main(String[] args) {
        // Criando uma fila de pedidos com tamanho máximo 10
        FilaPedidos filaPedidos = new FilaPedidos(10);

        // Adicionando alguns pedidos
        filaPedidos.adicionarPedido(new Pedido(1, "Hamburguer"));
        filaPedidos.adicionarPedido(new Pedido(2, "Batata Frita"));
        filaPedidos.adicionarPedido(new Pedido(3, "Refrigerante"));

        // Registrando o atendimento de pedidos
        filaPedidos.registrarAtendimento();
        filaPedidos.registrarAtendimento();
        filaPedidos.registrarAtendimento();
        filaPedidos.registrarAtendimento();
    }
}