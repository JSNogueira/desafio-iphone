import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        System.out.println("\nMenu de testes\n");
        System.out.println("1 - Exibir página");
        System.out.println("2 - Adicionar nova aba");
        System.out.println("3 - Atualizar página");
        System.out.println("4 - Ligar");
        System.out.println("5 - Atender");
        System.out.println("6 - Iniciar correio de voz");
        System.out.println("7 - Tocar música");
        System.out.println("8 - Pausar música");
        System.out.println("9 - Selecionar música\n");

        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();

        switch (opc) {
        case 1:
            iphone.exibirPagina("https://www.teste.com");
            break;
        case 2:
            iphone.adicionarNovaAba();
            break;
        case 3:
            iphone.atualizarPagina();
            break;
        case 4:
            iphone.ligar("(99) 9 9999-9999");
            break;
        case 5:
            iphone.atender();
            break;
        case 6:
            iphone.iniciarCorreioVoz();
            break;
        case 7:
            iphone.tocar();
            break;
        case 8:
            iphone.pausar();
            break;
        case 9:
            iphone.selecionarMusica("Música de teste");
            break;
       
        default:
            System.out.println("\nOpção inválida!\n");
            break;
        }

    }
}
