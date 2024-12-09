import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean criterio1 = false;
        boolean criterio2 = false;
        boolean criterio3 = false;
        boolean criterio4 = false;

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

        if (criterio1) { System.out.println("Apresentar questões erradas ou certas no geral"); }
        if (criterio2) { System.out.println("Apresentar o motivo do erro das questões erradas"); }
        if (criterio4) { System.out.println("Apresentar questões erradas ou certas de cada área"); }
        if (criterio3) { System.out.println("Apresentar o assunto das questões"); }
    }
}
