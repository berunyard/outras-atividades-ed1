// Classe FilaPedidos representa uma fila de pedidos usando a classe QueueInt
class FilaPedidos {
    private QueueInt filaDePedidos;

    public FilaPedidos(int tamanhoMaximo) {
        this.filaDePedidos = new QueueInt(tamanhoMaximo);
    }

    public void adicionarPedido(Pedido pedido) {
        filaDePedidos.enqueue(pedido);
        System.out.println("Pedido adicionado: " + pedido.getNumeroDoBoleto() + " - " + pedido.getDescricao());
    }

    public void registrarAtendimento() {
        if (!filaDePedidos.isEmpty()) {
            Pedido pedidoAtendido = filaDePedidos.dequeue();
            System.out.println("Pedido atendido e entregue: " + pedidoAtendido.getNumeroDoBoleto() + " - " + pedidoAtendido.getDescricao());
        } else {
            System.out.println("Não há pedidos na fila para serem atendidos.");
        }
    }
}
