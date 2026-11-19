import java.util.Scanner;

public class TRABALHO {

private static Scanner tec = new Scanner(System.in);

public static void main(String[] args) {
    int opcao = 0;
    
    do {
        System.out.println("\n"); 
        System.out.println("Menu Principal:");
        System.out.println("------------------");
        System.out.println("1- Iniciar leilão");
        System.out.println("2- Encerrar jogo");
        System.out.println("------------------");
        opcao = tec.nextInt();


    } while (opcao != 2);
}
}
