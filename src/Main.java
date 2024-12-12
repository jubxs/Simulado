import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int materia;int hist = 0;int geo = 0;int filo = 0;int socio = 0;
        int gram = 0;int inter = 0;int reda = 0;
        int bio = 0;int quim = 0;int fis = 0;int mat = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de questões:");
        int Questoes = in.nextInt();
        in.nextLine();

        for (int m = 0; m < Questoes; m++) {
            System.out.println("QUESTÃO" + (m+1));
            System.out.println("Qual é a matéria da questão");
            System.out.println("1 - Gramática");
            System.out.println("2 - Interpretação");
            System.out.println("3 - Redação");

            System.out.println("4 - História");
            System.out.println("5 - Geografia");
            System.out.println("6 - Filosofia");
            System.out.println("7 - Sociologia");

            System.out.println("8 - Biologia");
            System.out.println("9 - Química");
            System.out.println("10 - Física");

            System.out.println("11- Matemática");
            materia = in.nextInt();
            if (materia == 1) {gram += 1;}if (materia == 2) {inter += 1;}if (materia == 3) {reda += 1;}
            if (materia == 4) {hist += 1;}if (materia == 5) {geo += 1;}if (materia == 6) {filo += 1;}if (materia == 7) {socio += 1;}
            if (materia == 8) {bio += 1;}if (materia == 9) {quim += 1;}if (materia == 10) {fis += 1;}
            if (materia == 11) {mat += 1;}
        }
        System.out.println(" ");
        System.out.println(" Interpretação" + inter);
        System.out.println(" Gramática:" + gram);
        System.out.println(" Redação" + reda);
        System.out.println(" ");
        System.out.println(" Geografia:" + geo);
        System.out.println(" História:" + hist);
        System.out.println(" Filosofia" + filo);
        System.out.println(" Sociologia" + socio);
        System.out.println(" ");
        System.out.println(" Biologia" + bio);
        System.out.println(" Química" + quim);
        System.out.println(" Física" + fis);
        System.out.println(" Matemática" + mat);
        System.out.println("  ");

    }
}
