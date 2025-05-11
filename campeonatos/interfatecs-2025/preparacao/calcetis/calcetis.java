public class calcetis {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        String[] linha_01 = {"34", "10"};
        int carrinho = Integer.parseInt(linha_01[0]);
        // int leituras = Integer.parseInt(linha_01[1]);

        int[] leituras = {
            50,
            30,
            33,
            91,
            68,
            40,
            30,
            32,
            41,
            38
        };

        run(carrinho, leituras);
    }

    private static void run(int carrinho, int[] leituras) {
        for(int i = 0; i < leituras.length; i++) {
            for(int j = 1; j < leituras.length - 1; j++) {
                // System.out.printf("%d + %d + %d = %d\n", carrinho, leituras[i], leituras[j], carrinho + leituras[i] + leituras[j]);

                if((carrinho + leituras[i] + leituras[j] >= 200) && (i != j)) {
                    System.out.print("fretegratis");
                    System.exit(0);
                }
            }
        }

        System.out.print("fretepago");
    }
}