public class plantaoduvidas {
    static String algoritmos = "", praticas = "", desempenho = "", fluxo = "", interrupcao = "", sintaxe = "", proxima = "";

    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        int vagas = 2;

        String[] inscricoes = {
            "joao 1",
            "maria 1",
            "jose 1",
            "carlos 1",
            "ana 1"
        };

        run(vagas, inscricoes);
    }

    private static void run(int vagas, String[] inscricoes) {
        for(int j = 0; j < inscricoes.length; j++) {
            if(j + 1 > vagas) 
                proxima = proxima.concat(inscricoes[j].split(" ")[0] + "\n");
            else
                selectIncricao(inscricoes[j].split(" "));
        }

        System.out.print("------------------------------\nALGORITMOS\n------------------------------\n");
        System.out.println(algoritmos);
        System.out.print("------------------------------\nBOAS PRATICAS\n------------------------------\n");
        System.out.println(praticas);
        System.out.print("------------------------------\nDESEMPENHO\n------------------------------\n");
        System.out.println(desempenho);
        System.out.print("------------------------------\nFLUXOGRAMAS\n------------------------------\n");
        System.out.println(fluxo);
        System.out.print("------------------------------\nINTERPRETACAO DE ENUNCIADOS\n------------------------------\n");
        System.out.println(interrupcao);
        System.out.print("------------------------------\nSINTAXE DA LINGUAGEM\n------------------------------\n");
        System.out.println(sintaxe);

        if (!proxima.isEmpty())
            System.out.print("------------------------------\nFICA PARA A PROXIMA!\n------------------------------\n");
            System.out.println(proxima);
    }

    static void selectIncricao(String[] aluno) {
        String nome = aluno[0];

        for(int i = 1; i < aluno.length; i++) {
            switch (Integer.parseInt(aluno[i])) {
                case 1:
                    algoritmos = algoritmos.concat(nome + "\n");
                    break;
                case 2:
                    praticas = praticas.concat(nome + "\n");
                    break;
                case 3:
                    desempenho = desempenho.concat(nome + "\n");
                    break;
                case 4:
                    fluxo = fluxo.concat(nome + "\n");
                    break;
                case 5:
                    interrupcao = interrupcao.concat(nome + "\n");
                    break;
                case 6:
                    sintaxe = sintaxe.concat(nome + "\n");
                    break;
                default:
                    break;
            }
        }
    }
}