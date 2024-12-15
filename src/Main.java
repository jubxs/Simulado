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
        int materia;
        int TEhist = 0;int TEgeo = 0;int TEfilo = 0;int TEsocio = 0;
        int TEgram = 0;int TEinter = 0;int TEreda = 0;
        int TEbio = 0;int TEquim = 0;int TEfis = 0;int TEmat = 0;
        int hist = 0;int geo = 0;int filo = 0;int socio = 0;
        int gram = 0;int inter = 0;int reda = 0;
        int bio = 0;int quim = 0;int fis = 0;int mat = 0;
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
                in.nextLine();
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
                        in.nextLine();
                        if (motivodoerro == 1){Tnsabia +=1;}
                        if (motivodoerro == 2){Tchutou +=1;}
                        if (motivodoerro == 3){Tduvida +=1;}
                    }if (qerradaouceta==2){
                        System.out.println("Qual o motivo do acerto?");
                        System.out.println("Sabia, digite 1");
                        System.out.println("Chutou, digite 2");
                        System.out.println("Ficou em dúvida, digite 3");
                        motivodoacerto = in.nextInt();
                        in.nextLine();
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
                    in.nextLine();
                    if (areadaquestao == 1){
                        TqLINGUAGENS +=1;
                        if (qerradaouceta ==1){TqELINGUAGENS += 1;}
                        if (criterio3){
                            System.out.println("Qual é a matéria da questão");
                            System.out.println("1 - Gramática");
                            System.out.println("2 - Interpretação");
                            System.out.println("3 - Redação");
                            materia = in.nextInt();
                            in.nextLine();
                            if (materia == 1) {gram += 1;if (qerradaouceta==1){TEgram += 1;}}
                            if (materia == 2) {inter += 1;if (qerradaouceta==1){TEinter += 1;}}
                            if (materia == 3) {reda += 1;if (qerradaouceta==1){TEreda +=1;}
                            }}

                        if (areadaquestao == 2){
                            TqHUMANAS +=1;
                            if (qerradaouceta ==1){TqEHUMANAS +=1;}
                            if (criterio3){
                                System.out.println("4 - História");
                                System.out.println("5 - Geografia");
                                System.out.println("6 - Filosofia");
                                System.out.println("7 - Sociologia");
                                materia = in.nextInt();
                                in.nextLine();
                                if (materia == 4) {hist += 1;if (qerradaouceta==1){TEhist += 1;}}if (materia == 5) {geo += 1;if (qerradaouceta==1){TEgeo += 1;}}if (materia == 6) {filo += 1;if (qerradaouceta==1){TEfilo += 1;}}if (materia == 7) {socio += 1;if (qerradaouceta==1){TEsocio += 1;}}
                            }}
                        if (areadaquestao == 3){
                            TqEXATAS +=1;
                            if (qerradaouceta ==1){TqEEXATAS +=1;}
                            if (criterio3){
                                System.out.println("Qual é a matéria da questão");
                                System.out.println("11- Matemática");
                                materia = in.nextInt();
                                in.nextLine();
                                if (materia == 11) {mat += 1;if (qerradaouceta==1){TEmat += 1;}}
                            }}
                        if (areadaquestao == 4){
                            TqNATUREZA +=1;
                            if (qerradaouceta ==1){TqENATUREZA +=1;}
                            if (criterio3){
                                System.out.println("Qual é a matéria da questão");
                                System.out.println("8 - Biologia");
                                System.out.println("9 - Química");
                                System.out.println("10 - Física");
                                materia = in.nextInt();
                                in.nextLine();
                                if (materia == 8) {bio += 1;if (qerradaouceta==1){TEbio += 1;}}if (materia == 9) {quim += 1;if (qerradaouceta==1){TEquim += 1;}}if (materia == 10) {fis += 1;if (qerradaouceta==1){TEfis += 1;}}
                            }}

                    }

                }}
            if (criterio4 && !criterio1){
                for (int a =0; a<Questoes;a++){
                    System.out.println("QUESTÃO" + (a+1));
                    System.out.println("A questão é de qual área do conhecimento:");
                    System.out.println("Digite 1 -> Linguagens");
                    System.out.println("Digite 2 -> Humanas");
                    System.out.println("Digite 3 -> Exatas");
                    System.out.println("Digite 4 -> Natureza");
                    areadaquestao = in.nextInt();
                    in.nextLine();
                    if (areadaquestao == 1){TqLINGUAGENS +=1; if (qerradaouceta ==1){TqELINGUAGENS += 1;}}
                    if (areadaquestao == 2){TqHUMANAS +=1; if (qerradaouceta ==1){TqEHUMANAS +=1;}}
                    if (areadaquestao == 3){TqEXATAS +=1; if (qerradaouceta ==1){TqEEXATAS +=1;}}
                    if (areadaquestao == 4){TqNATUREZA +=1; if (qerradaouceta ==1){TqENATUREZA +=1;}}

                }}
            if (criterio3 && !criterio1){
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
            }


            System.out.println("RESUMO:");
            if (criterio1){System.out.println(" Total de questões:"+ (Questoes - Tqerrada)+"/"+Questoes);}
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

            if (criterio3 && !criterio1){
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

            if (criterio3){
                System.out.println("   Por matéria:");
                System.out.println("    Interpretação:" + (inter - TEinter )+ "/"+inter);
                System.out.println("    Gramática:" + (gram - TEgram) + "/"+ gram);
                System.out.println("    Redação" + (reda - TEreda ) +reda);
                System.out.println(" ");
                System.out.println("    Geografia:" +(geo - TEgeo)+ "/"+ geo);
                System.out.println("    História:" + (hist - TEhist) + "/"+ hist);
                System.out.println("    Filosofia" + (filo - TEfilo) + "/"+ filo);
                System.out.println("    Sociologia" + (socio - TEsocio)+ "/"+ socio);
                System.out.println(" ");
                System.out.println("    Biologia" + (bio - TEbio)+ "/"+ bio);
                System.out.println("    Química" + (quim - TEquim)+ "/"+ quim);
                System.out.println("    Física" + (fis - TEfis)+ "/"+ fis);
                System.out.println(" ");
                System.out.println("    Matemática" + (mat - TEmat)+ "/"+ mat);
                System.out.println("  ");
            }

        }
    }}
