// Classe Pedido representa um pedido na lanchonete
class Pedido {
    private int numeroDoBoleto;
    private String descricao;

    public Pedido(int numeroDoBoleto, String descricao) {
        this.numeroDoBoleto = numeroDoBoleto;
        this.descricao = descricao;
    }

    public int getNumeroDoBoleto() {
        return numeroDoBoleto;
    }

    public String getDescricao() {
        return descricao;
    }
}
