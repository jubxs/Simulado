import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        boolean criterio1 = false; boolean criterio2 = false;boolean criterio3 = false;boolean criterio4 = false;
        int Tqerrada = 0;int qerradaouceta = 0;int areadaquestao = 0;
        int TqLINGUAGENS = 0;int TqHUMANAS = 0;int TqEXATAS = 0;int TqNATUREZA = 0;
        int TqELINGUAGENS = 0;int TqEHUMANAS = 0;int TqEEXATAS = 0;int TqENATUREZA = 0;
        int motivodoerro = 0;int Tnsabia = 0; int Tchutou = 0; int Tduvida = 0;
        int motivodoacerto = 0;int TAsabia = 0; int TAchutou = 0; int TAduvida = 0;
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
        System.out.println("Caso deseje o critério 2, obrigatoriamente você deve informar o criterio 1");
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
                 if (criterio2){
                     if (qerradaouceta == 1){
                         System.out.println("Qual o motivo do erro?");
                         System.out.println("Não sabia, digite 1");
                         System.out.println("Chutou, digite 2");
                         System.out.println("Ficou em dúvida, digite 3");
                         motivodoerro = in.nextInt();
                         if (motivodoerro == 1){Tnsabia +=1;}
                         if (motivodoerro == 2){Tchutou +=1;}
                         if (motivodoerro == 3){Tduvida +=1;}
                     }if (qerradaouceta==2){
                         System.out.println("Qual o motivo do acerto?");
                         System.out.println("Sabia, digite 1");
                         System.out.println("Chutou, digite 2");
                         System.out.println("Ficou em dúvida, digite 3");
                         motivodoacerto = in.nextInt();
                         if (motivodoacerto == 1){TAsabia +=1;}
                         if (motivodoacerto == 2){TAchutou +=1;}
                         if (motivodoacerto == 3){TAduvida +=1;}
                     }

                 } if(criterio4){
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

            }


        }
         if (criterio4 && !criterio1){
             for (int a =0; a<Questoes;a++){
                 System.out.println("QUESTÃO" + (a+1));
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

         }}

        if (criterio1){System.out.println("Questões"+ (Questoes - Tqerrada)+"/"+Questoes);}
        if (criterio2){
            System.out.println("Questões acertadas" + (Questoes - Tqerrada)+"/"+Questoes);
            System.out.println("  Questões que sabia:"+TAsabia + "/"+Questoes);
            System.out.println("  Questões que chutou e acertou:"+TAchutou+ "/"+Questoes);
            System.out.println("  Questões que teve dúvida e acertou:"+TAduvida + "/"+Questoes);
            System.out.println("Questões erradas" + Tqerrada+"/"+Questoes);
            System.out.println(" Questões que não sabia:"+Tnsabia + "/"+Questoes);
            System.out.println(" Questões que não chutou e errou:"+Tchutou + "/"+Questoes);
            System.out.println(" Questões que não sabia:"+Tduvida + "/"+Questoes);

        }
        if (criterio4){
            System.out.println("Questões de Linguagens:"+ (TqLINGUAGENS - TqELINGUAGENS) +"/"+ TqLINGUAGENS);
            System.out.println("Questões de Humanas:"+ (TqHUMANAS - TqEHUMANAS) +"/"+ TqHUMANAS);
            System.out.println("Questões de Natureza:"+ (TqNATUREZA - TqENATUREZA) +"/"+ TqNATUREZA);
            System.out.println("Questões de Exatas"+ (TqEXATAS - TqEEXATAS) + "/"+ TqEXATAS);
        }

    }
}
