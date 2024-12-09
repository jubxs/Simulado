import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean criterio1 = false;boolean criterio2 = false;boolean criterio3 = false;boolean criterio4 = false;

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
        String[] s = criterios.split(" ");

        if (criterios.equalsIgnoreCase("T")) {
            criterio1 = true;
            criterio2 = true;
            criterio3 = true;
            criterio4 = true;
        } else {
            for (int l = 0; l < s.length; l++) {
                if (s[l].equals("1")) { criterio1 = true; }
                if (s[l].equals("2")) { criterio2 = true; }
                if (s[l].equals("3")) { criterio3 = true; }
                if (s[l].equals("4")) { criterio4 = true; }
            }
        }




    }
}