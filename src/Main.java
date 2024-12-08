import java.util.Map;
import java.util.HashMap;
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

        Map<String,Object[]>mapa = new HashMap<String,Object[]>();
        String[] Area = {"Linguagens","Humanas","Exatas","Natureza"};
        String[] Materia = {"Estudos linguisticos, Interpretação"};

        Object[] clasificacao = {Area,Materia};
        mapa.put("Questão 1",clasificacao);
        Object[] recDados = mapa.get("Questão 1");
        for (int i = 0; i < recDados.length; i++){
            switch (i){
                case 0:
                    System.out.println("Area: ");
                    break;
                case 1:
                    System.out.println("Materia: ");
                    break;}
            for (String s : (String[])recDados[i]){
                System.out.println(s);
            }
            System.out.println();
        }




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