import java.util.Scanner;


public class Main {

    private static int Tqerrada = 0, TqLINGUAGENS = 0, TqHUMANAS = 0, TqEXATAS = 0, TqNATUREZA = 0;
    private static int TqELINGUAGENS = 0, TqEHUMANAS = 0, TqEEXATAS = 0, TqENATUREZA = 0;
    private static int Tnsabia = 0, Tchutou = 0, Tduvida = 0;
    private static int TAsabia = 0, TAchutou = 0, TAduvida = 0;
    private static int TEhist = 0, TEgeo = 0, TEfilo = 0, TEsocio = 0;
    private static int TEgram = 0, TEinter = 0, TEreda = 0;
    private static int TEbio = 0, TEquim = 0, TEfis = 0, TEmat = 0;
    private static int hist = 0, geo = 0, filo = 0, socio = 0;
    private static int gram = 0, inter = 0, reda = 0;
    private static int bio = 0, quim = 0, fis = 0, mat = 0;
    private static int area = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalQuestoes = solicitarQuantidadeQuestoes(in);
        boolean[] criterios = solicitarCriterios(in);

        for (int i = 0; i < totalQuestoes; i++) {
            System.out.println("Questão " + (i + 1));
            processarQuestao(in, criterios);
        }

        gerarResumo(totalQuestoes, criterios);
    }

    // Método 1: Solicitar quantidade de questões
    private static int solicitarQuantidadeQuestoes(Scanner in) {
        System.out.println("Quantidade de questões:");
        return in.nextInt();
    }

    // Método 2: Solicitar critérios de avaliação
    private static boolean[] solicitarCriterios(Scanner in) {
        boolean[] criterios = new boolean[4]; // critério 1, 2, 3 e 4
        System.out.println("Quais critérios você gostaria de usar?");
        System.out.println("Opções:");
        System.out.println("1 - Questão errada ou acertada");
        System.out.println("2 - Motivo do erro ou acerto");
        System.out.println("3 - Matéria");
        System.out.println("4 - Área do conhecimento");
        System.out.println("Digite os números correspondentes aos critérios desejados ou T para todos:");

        in.nextLine();
        String entrada = in.nextLine();
        if (entrada.equalsIgnoreCase("T")) {
            criterios[0] = criterios[1] = criterios[2] = criterios[3] = true;
        } else {
            String[] opcoes = entrada.split(" ");
            for (String opcao : opcoes) { // permite que todos os elementos do array sejam armazenado e lidos por opcoao
                if (opcao.equals("1")) criterios[0] = true;
                if (opcao.equals("2")) criterios[1] = true;
                if (opcao.equals("3")) criterios[2] = true;
                if (opcao.equals("4")) criterios[3] = true;
            }
        }
        return criterios;
    }

    // Método 3: Processar cada questão
    private static void processarQuestao(Scanner in, boolean[] criterios) {
        int questaoCertaErrada = 0, motivo = 0;

        if (criterios[0]) {
            questaoCertaErrada = solicitarQuestaoCertaErrada(in);
            if (questaoCertaErrada == 1) {
                Tqerrada++;
            }
        }//ok

        if (criterios[1]) {
            motivo = solicitarMotivo(in, questaoCertaErrada);
        }

        if (criterios[3]) {
            area = solicitarAreaConhecimento(in);
            atualizarEstatisticasPorArea(area, questaoCertaErrada, criterios[2], in);
        }

        if (criterios[2]){
            solicitarMateria(in, area, questaoCertaErrada);
        }
    }

    // Submétodos para processar uma questão
    private static int solicitarQuestaoCertaErrada(Scanner in) {
        System.out.println("A questão está errada (1) ou certa (2)?");
        return in.nextInt();
    }

    private static int solicitarMotivo(Scanner in, int questaoCertaErrada) {
        if (questaoCertaErrada == 1) {
            System.out.println("Motivo do erro: 1 - Não sabia, 2 - Chutou, 3 - Ficou em dúvida");
            int motivo = in.nextInt();
            if (motivo == 1) Tnsabia++;
            if (motivo == 2) Tchutou++;
            if (motivo == 3) Tduvida++;
            return motivo;
        } else {
            System.out.println("Motivo do acerto: 1 - Sabia, 2 - Chutou, 3 - Ficou em dúvida");
            int motivo = in.nextInt();
            if (motivo == 1) TAsabia++;
            if (motivo == 2) TAchutou++;
            if (motivo == 3) TAduvida++;
            return motivo;
        }
    }

    private static int solicitarAreaConhecimento(Scanner in) {
        System.out.println("Área do conhecimento: 1 - Linguagens, 2 - Humanas, 3 - Exatas, 4 - Natureza");
        return in.nextInt();
    }

    private static void atualizarEstatisticasPorArea(int area, int questaoCertaErrada, boolean criterioMateria, Scanner in) {
        switch (area) {//switch é  condicional
            case 1 -> {TqLINGUAGENS++;if (questaoCertaErrada ==1){TqELINGUAGENS++;}}
            case 2 -> {TqHUMANAS++;if (questaoCertaErrada ==1){TqEHUMANAS++;}}
            case 3 -> {TqEXATAS++;if (questaoCertaErrada ==1){TqEEXATAS++;}}
            case 4 -> {TqNATUREZA++;if (questaoCertaErrada ==1){TqENATUREZA++;}}
        }
    }

    private static void solicitarMateria(Scanner in, int area, int questaoCertaErrada) {
        int materia;
        switch (area) {
            case 1: // Linguagens
                System.out.println("Escolha a matéria: 1 - Gramática, 2 - Interpretação, 3 - Redação");
                materia = in.nextInt();
                if (materia == 1) { gram++; if (questaoCertaErrada == 1) TEgram++; }
                if (materia == 2) { inter++; if (questaoCertaErrada == 1) TEinter++; }
                if (materia == 3) { reda++; if (questaoCertaErrada == 1) TEreda++; }
                break;

            case 2: // Humanas
                System.out.println("Escolha a matéria: 4 - História, 5 - Geografia, 6 - Filosofia, 7 - Sociologia");
                materia = in.nextInt();
                if (materia == 4) { hist++; if (questaoCertaErrada == 1) TEhist++; }
                if (materia == 5) { geo++; if (questaoCertaErrada == 1) TEgeo++; }
                if (materia == 6) { filo++; if (questaoCertaErrada == 1) TEfilo++; }
                if (materia == 7) { socio++; if (questaoCertaErrada == 1) TEsocio++; }
                break;

            case 3: // Exatas
                System.out.println("Escolha a matéria: 8 - Matemática");
                materia = in.nextInt();
                if (materia == 8) { mat++; if (questaoCertaErrada == 1) TEmat++; }
                break;

            case 4: // Natureza
                System.out.println("Escolha a matéria: 9 - Biologia, 10 - Química, 11 - Física");
                materia = in.nextInt();
                if (materia == 9) { bio++; if (questaoCertaErrada == 1) TEbio++; }
                if (materia == 10) { quim++; if (questaoCertaErrada == 1) TEquim++; }
                if (materia == 11) { fis++; if (questaoCertaErrada == 1) TEfis++; }
                break;
            case 0:
                System.out.println("Escolha a matéria da questão:");
                System.out.println(" 1 - Gramática, 2 - Interpretação, 3 - Redação");
                System.out.println(" 4 - História, 5 - Geografia, 6 - Filosofia, 7 - Sociologia");
                System.out.println(" 8 - Matemática");
                System.out.println(" 9 - Biologia, 10 - Química, 11 - Física");
                materia = in.nextInt();
                if (materia == 1) { gram++; if (questaoCertaErrada == 1) TEgram++; }
                if (materia == 2) { inter++; if (questaoCertaErrada == 1) TEinter++; }
                if (materia == 3) { reda++; if (questaoCertaErrada == 1) TEreda++; }
                if (materia == 4) { hist++; if (questaoCertaErrada == 1) TEhist++; }
                if (materia == 5) { geo++; if (questaoCertaErrada == 1) TEgeo++; }
                if (materia == 6) { filo++; if (questaoCertaErrada == 1) TEfilo++; }
                if (materia == 7) { socio++; if (questaoCertaErrada == 1) TEsocio++; }
                if (materia == 8) { mat++; if (questaoCertaErrada == 1) TEmat++; }
                if (materia == 9) { bio++; if (questaoCertaErrada == 1) TEbio++; }
                if (materia == 10) { quim++; if (questaoCertaErrada == 1) TEquim++; }
                if (materia == 11) { fis++; if (questaoCertaErrada == 1) TEfis++; }
                break;
            default:
                System.out.println("Área inválida!");
        }
    }


    // Método 4: Gerar resumo final
    private static void gerarResumo(int totalQuestoes, boolean[] criterios) {
        System.out.println("RESUMO:");
        if (criterios[0]) {
            System.out.println("Acertos em geral: " + (totalQuestoes - Tqerrada) + "/" + totalQuestoes);
        }
        if (criterios[1]) {
            System.out.println("  MOTIVO DOS ACERTOS: ");
            System.out.println("  Sabia:" + TAsabia);
            System.out.println("  Chutou e acertou:" + TAchutou);
            System.out.println("  Ficou em dúvida e acertou:" + TAduvida);
            System.out.println(" ");
            System.out.println("  Erros em geral: " + (Tqerrada) + "/" + totalQuestoes);
            System.out.println("  MOTIVO DOS ERROS: ");
            System.out.println("  Não sabia: " + Tnsabia);
            System.out.println("  Chutou e errou: " + Tchutou);
            System.out.println("  Ficou em dúvida e errou: " + Tduvida);
            System.out.println(" ");
        }
        if (criterios[3] && !criterios[2]) {
            System.out.println("  Questões por área:");
            if (TqLINGUAGENS != 0){System.out.println("   Linguagens: " + (TqLINGUAGENS - TqELINGUAGENS) + "/"+TqLINGUAGENS);}
            System.out.println(" ");
            if (TqHUMANAS != 0){System.out.println("   Humanas: " + (TqHUMANAS - TqEHUMANAS) + "/"+TqHUMANAS);}
            System.out.println(" ");
            if (TqEXATAS != 0){System.out.println("   Exatas: " + (TqEXATAS - TqEEXATAS) + "/"+TqEXATAS);}
            System.out.println(" ");
            if (TqNATUREZA != 0){ System.out.println("   Natureza: " + (TqNATUREZA - TqENATUREZA) + "/"+TqNATUREZA);}
            System.out.println(" ");
        }
        if (criterios[2] && criterios[3]){
            System.out.println("POR MATÉRIA:");
            if (TqLINGUAGENS != 0){System.out.println("   Linguagens: " + (TqLINGUAGENS - TqELINGUAGENS) + "/"+TqLINGUAGENS);
            System.out.println("     Interpretação: " + (inter - TEinter )+ "/"+inter);
            System.out.println("     Gramática: " + (gram - TEgram) + "/"+ gram);
            System.out.println("     Redação: " + (reda - TEreda )+ "/" +reda);}
            System.out.println(" ");
            if (TqHUMANAS != 0){System.out.println("   Humanas: " + (TqHUMANAS - TqEHUMANAS) + "/"+TqHUMANAS);
            System.out.println("    Geografia: " +(geo - TEgeo)+ "/"+ geo);
            System.out.println("    História: " + (hist - TEhist) + "/"+ hist);
            System.out.println("    Filosofia: " + (filo - TEfilo) + "/"+ filo);
            System.out.println("    Sociologia: " + (socio - TEsocio)+ "/"+ socio);}
            System.out.println(" ");
            if (TqNATUREZA != 0){ System.out.println("   Natureza: " + (TqNATUREZA - TqENATUREZA) + "/"+TqNATUREZA);
            System.out.println("    Biologia: " + (bio - TEbio)+ "/"+ bio);
            System.out.println("    Química: " + (quim - TEquim)+ "/"+ quim);
            System.out.println("    Física: " + (fis - TEfis)+ "/"+ fis);
                System.out.println(" ");
            if (TqEXATAS != 0){System.out.println("   Exatas: " + (TqEXATAS - TqEEXATAS) + "/"+TqEXATAS);}
            System.out.println("    Matemática: " + (mat - TEmat)+ "/"+ mat);
            System.out.println("  ");}
        }
        if (criterios[2] && !criterios[3]){
            System.out.println("   Por materia:");
            System.out.println(" ");
            System.out.println("     Interpretação:" + (inter - TEinter )+ "/"+inter);
            System.out.println("     Gramática:" + (gram - TEgram) + "/"+ gram);
            System.out.println("     Redação" + (reda - TEreda )+ "/" +reda);
            System.out.println(" ");
            System.out.println("     Geografia:" +(geo - TEgeo)+ "/"+ geo);
            System.out.println("     História:" + (hist - TEhist) + "/"+ hist);
            System.out.println("     Filosofia" + (filo - TEfilo) + "/"+ filo);
            System.out.println("     Sociologia" + (socio - TEsocio)+ "/"+ socio);
            System.out.println(" ");
            System.out.println("    Biologia" + (bio - TEbio)+ "/"+ bio);
            System.out.println("    Química" + (quim - TEquim)+ "/"+ quim);
            System.out.println("    Física" + (fis - TEfis)+ "/"+ fis);
            System.out.println("    Matemática" + (mat - TEmat)+ "/"+ mat);
            System.out.println("  ");
        }
    }
}