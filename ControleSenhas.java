import java.util.Scanner;

public class ControleSenhas {
    private QueueInt filaDeSenhas;
    private int proximaSenha;
    private static final int MAX_CLIENTES = 20;

    public ControleSenhas(int tamanhoMaximo) {
        this.filaDeSenhas = new QueueInt(tamanhoMaximo);
        this.proximaSenha = 1;
    }

  
    public void emitirSenha() {
        if (filaDeSenhas.size() < MAX_CLIENTES) {
            System.out.println("Senha emitida: " + proximaSenha);
            filaDeSenhas.enqueue(proximaSenha);
            proximaSenha++;
        } else {
            System.out.println("Desculpe, o número máximo de clientes na fila foi atingido. Por favor, retorne em outro momento.");
        }
    }


    public void chamarSenha() {
        if (!filaDeSenhas.isEmpty()) {
            int senhaChamada = filaDeSenhas.dequeue();
            System.out.println("Senha chamada para atendimento: " + senhaChamada);
        } else {
            System.out.println("Não há clientes na fila de espera.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o tamanho máximo da fila de senhas (ou pressione Enter para usar o tamanho padrão 20): ");
        int tamanhoMaximo = scanner.hasNextInt() ? scanner.nextInt() : 20;
        scanner.nextLine(); 

        ControleSenhas controleSenhas = new ControleSenhas(tamanhoMaximo);

    
        int escolha;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Emitir Senha");
            System.out.println("2. Chamar Senha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    controleSenhas.emitirSenha();
                    break;
                case 2:
                    controleSenhas.chamarSenha();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
