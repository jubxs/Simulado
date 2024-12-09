import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Tqerrada = 0;
        int qerradaouceta = 0;
        int areadaquestao =0;
        int TqLINGUAGENS = 0; int TqHUMANAS = 0; int TqEXATAS = 0; int TqNATUREZA = 0;
        int TqELINGUAGENS = 0; int TqEHUMANAS = 0; int TqEEXATAS = 0; int TqENATUREZA = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de questões:");
        int Questoes = in.nextInt();


        for(int i=0; i<Questoes;i++){
            System.out.println("Questão" + (i+1));
        System.out.println("Questão errada ou acertada");
        ArrayList<Integer> Qerrada = new ArrayList<Integer>();
        System.out.println("Eradda,digite 1 ou Certa, digite 2");
            qerradaouceta = in.nextInt();
            if (qerradaouceta == 1){
                Tqerrada +=1;}
        System.out.println(" ");
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

               System.out.println("Questões"+ Tqerrada+"/"+Questoes);
               System.out.println("Questões de Linguagens:"+ (TqLINGUAGENS - TqELINGUAGENS) +"/"+ TqLINGUAGENS);
               System.out.println("Questões de Humanas:"+ (TqHUMANAS - TqEHUMANAS) +"/"+ TqHUMANAS);
               System.out.println("Questões de Natureza:"+ (TqNATUREZA - TqENATUREZA) +"/"+ TqNATUREZA);
               System.out.println("Questões de Exatas"+ (TqEXATAS - TqEEXATAS) + "/"+ TqEXATAS);

        }

    }
