import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int qerradaouceta =0;
        int motivodoerro = 0;int Tnsabia = 0; int Tchutou = 0; int Tduvida = 0;
        int motivodoacerto = 0;int TAsabia = 0; int TAchutou = 0; int TAduvida = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de questões:");
        int Questoes = in.nextInt();
            for (int i = 0; i < Questoes; i++) {
                System.out.println("Questão" + (i + 1));
                System.out.println("Questão errada ou acertada");
                ArrayList<Integer> Qerrada = new ArrayList<Integer>();
                System.out.println("Eradda,digite 1 ou Certa, digite 2");
                qerradaouceta = in.nextInt();
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
                System.out.println(" ");}
            System.out.println("  Questões que sabia:"+TAsabia + "/"+Questoes);
            System.out.println("  Questões que chutou e acertou:"+TAchutou+ "/"+Questoes);
            System.out.println("  Questões que teve dúvida e acertou:"+TAduvida + "/"+Questoes);
            System.out.println("  ERRADAS");
            System.out.println(" Questões que não sabia:"+Tnsabia + "/"+Questoes);
            System.out.println(" Questões que não chutou e errou:"+Tchutou + "/"+Questoes);
            System.out.println(" Questões que não sabia:"+Tduvida + "/"+Questoes);
        }


    }

