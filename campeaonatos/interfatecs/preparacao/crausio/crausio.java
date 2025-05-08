public class crausio {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        // LINHA 1
        String entrada_1 = "5 5 10";
        int linha = Integer.parseInt(entrada_1.split(" ")[0]);
        int coluna = Integer.parseInt(entrada_1.split(" ")[1]);
        int bateria = Integer.parseInt(entrada_1.split(" ")[2]);

        // LINHA 2
        String entrada_2 = "3 3";
        int inicial_x = Integer.parseInt(entrada_2.split(" ")[0]);
        int inicial_y = Integer.parseInt(entrada_2.split(" ")[1]);

        // LINHA 3
        String rotina = "EEEEEEDDDDDD";

        run(linha, coluna, bateria, inicial_x, inicial_y, rotina);
    }

    private static void run(int linha, int coluna, int bateria, int inicial_x, int inicial_y, String rotina) {
        int batidas = 0;
        int posicao_x = inicial_x, posicao_y = inicial_y;

        for(int i = 1, j = rotina.length(); i <= bateria && j > 0; i++, j--) {
            String rotina_exec = rotina.split("")[i-1];

            switch (rotina_exec) {
                case "E":
                    if((posicao_x - 1) == 0)
                        batidas++;
                    else 
                        posicao_x--;
                    break;
                case "D":
                    if((posicao_x + 1) > linha)
                        batidas++;
                    else 
                        posicao_x++;
                    break;
                case "C":
                    if((posicao_y - 1) == 0)
                        batidas++;
                    else 
                        posicao_y--;
                    break;
                case "B":
                    if((posicao_y + 1) > coluna)
                        batidas++;
                    else 
                        posicao_y++;
                    break;
            }
        }

        // SAIDA
        System.out.printf("%d %d %d", posicao_x, posicao_y, batidas);
    }
}