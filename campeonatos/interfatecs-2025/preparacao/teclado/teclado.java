public class teclado {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        int entradas = 2;
        String[] entrada = {"SOS", "AMBULANCIA"};

        run(entrada);
    }

    private static void run(String[] palavras) {
        String[] teclado = {
            "ABC", "DEF", "GHJ", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
        };

        for(String palavra:palavras) {
            for(String letra:palavra.split("")) {
                for(int i = 0; i < teclado.length; i++) {
                    if(teclado[i].indexOf(letra) != -1) {
                        System.out.println(i+2);
                    }
                }
            }

            System.out.println("");
        }
    }
}