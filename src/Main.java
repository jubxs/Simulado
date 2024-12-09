import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        boolean criterio1 = false; boolean criterio2 = false;boolean criterio3 = false;boolean criterio4 = false;
        int Tqerrada = 0;int qerradaouceta = 0;int areadaquestao = 0;
        int TqLINGUAGENS = 0;int TqHUMANAS = 0;int TqEXATAS = 0;int TqNATUREZA = 0;
        int TqELINGUAGENS = 0;int TqEHUMANAS = 0;int TqEEXATAS = 0;int TqENATUREZA = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de questões:");
        int Questoes = in.nextInt();
        in.nextLine();
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
                if (s[l].equals("1")) {
                    criterio1 = true;
                }
                if (s[l].equals("2")) {
                    criterio2 = true;
                }
                if (s[l].equals("3")) {
                    criterio3 = true;
                }
                if (s[l].equals("4")) {
                    criterio4 = true;
                }
            }
        }

         if (criterio1) {
             for (int i = 0; i < Questoes; i++) {
                 System.out.println("Questão" + (i + 1));
                 System.out.println("Questão errada ou acertada");
                 ArrayList<Integer> Qerrada = new ArrayList<Integer>();
                System.out.println("Eradda,digite 1 ou Certa, digite 2");
                qerradaouceta = in.nextInt();
                 if (qerradaouceta == 1){
                     Tqerrada +=1;}
                 System.out.println(" ");
            }


        }
         if (criterio4){
             System.out.println("A questão é de qual área do conhecimento:");
             System.out.println("Digite 1 -> Linguagens");
             System.out.println("Digite 2 -> Humanas");
             System.out.println("Digite 3 -> Exatas");
             System.out.println("Digite 4 -> Natureza");
             areadaquestao = in.nextInt();
             if (areadaquestao == 1){TqLINGUAGENS +=1; if (qerradaouceta ==1){TqELINGUAGENS += 1;}}
             if (areadaquestao == 2){TqHUMANAS +=1; if (qerradaouceta ==1){TqEHUMANAS +=1;}}
             if (areadaquestao == 3){TqEXATAS +=1; if (qerradaouceta ==1){TqEEXATAS +=1;}}
             if (areadaquestao == 4){TqNATUREZA +=1; if (qerradaouceta ==1){TqENATUREZA +=1;}}

         }

        if (criterio1){System.out.println("Questões"+ Tqerrada+"/"+Questoes);}
        if (criterio2){
            System.out.println("Questões de Linguagens:"+ (TqLINGUAGENS - TqELINGUAGENS) +"/"+ TqLINGUAGENS);
            System.out.println("Questões de Humanas:"+ (TqHUMANAS - TqEHUMANAS) +"/"+ TqHUMANAS);
            System.out.println("Questões de Natureza:"+ (TqNATUREZA - TqENATUREZA) +"/"+ TqNATUREZA);
            System.out.println("Questões de Exatas"+ (TqEXATAS - TqEEXATAS) + "/"+ TqEXATAS);
        }

    }
}