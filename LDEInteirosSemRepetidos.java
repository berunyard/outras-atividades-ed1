public class LDEInteirosSemRepetidos {
    private No inicio;
    private No fim;

    public LDEInteirosSemRepetidos() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para inserir um valor no final da lista sem repetição
    public void inserirNoFinal(int valor) {
        if (!existeValor(valor)) {
            No novoNo = new No(valor);
            if (inicio == null) {
                inicio = novoNo;
                fim = novoNo;
            } else {
                novoNo.anterior = fim;
                fim.proximo = novoNo;
                fim = novoNo;
            }
        } else {
            System.out.println("Valor " + valor + " já existe na lista. Não pode ser inserido novamente.");
        }
    }

    // Método para inserir um valor no início da lista sem repetição
    public void inserirNoInicio(int valor) {
        if (!existeValor(valor)) {
            No novoNo = new No(valor);
            if (inicio == null) {
                inicio = novoNo;
                fim = novoNo;
            } else {
                novoNo.proximo = inicio;
                inicio.anterior = novoNo;
                inicio = novoNo;
            }
        } else {
            System.out.println("Valor " + valor + " já existe na lista. Não pode ser inserido novamente.");
        }
    }

    // Método para remover o valor situado no início da lista
    public void removerInicio() {
        if (inicio != null) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
        } else {
            System.out.println("A lista está vazia. Não é possível remover do início.");
        }
    }

    // Método para remover o valor situado no final da lista
    public void removerFinal() {
        if (inicio != null) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
        } else {
            System.out.println("A lista está vazia. Não é possível remover do final.");
        }
    }

    // Método para exibir todos os valores da lista
    public void exibirValores() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Método para remover o valor específico da lista
    public void removerValor(int valor) {
        No encontrado = procurarValor(valor);
        if (encontrado != null) {
            if (encontrado == inicio) {
                removerInicio();
            } else if (encontrado == fim) {
                removerFinal();
            } else {
                encontrado.anterior.proximo = encontrado.proximo;
                encontrado.proximo.anterior = encontrado.anterior;
            }
            System.out.println("Valor " + valor + " removido da lista.");
        } else {
            System.out.println("Valor " + valor + " não encontrado na lista.");
        }
    }

    // Método que procura um valor na lista e retorna um nó que contém o valor (ou null se não encontrar)
    public No procurarValor(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    // Método privado para verificar se um valor já existe na lista
    private boolean existeValor(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}