import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de questões:");
        int Questoes = in.nextInt();
        System.out.println("Quais critérios você gostaria de usar?");
        System.out.println("Opções:");
        System.out.println("1 - Questão errada ou acertada");
        System.out.println("2 - Motivo do erro ou acerto");
        System.out.println("3 - Matéria");
        System.out.println("4 - Área do conhecimento");
        System.out.println("Digite os números correspondentes aos critérios desejados, caso deseje todos digite: T ");
        String criterios = in.nextLine();
        System.out.println("Questão errada ou acertada");
        ArrayList<Integer> Qerrada = new ArrayList<Integer>();
        System.out.println("Eradda,digite 1 ou Certa, digite 2");
        int qerradaouceta = in.nextInt();
        in.nextLine();
        if (criterios.equals("T")) {
            System.out.println("A questão foi: ");
            System.out.println("Errada, digite 1");
            System.out.println("Acertada, digite 2");
            int CE = in.nextInt();
            if (CE == 1){



        }

    }



    }
}