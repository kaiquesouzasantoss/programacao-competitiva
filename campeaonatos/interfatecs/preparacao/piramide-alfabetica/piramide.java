public class piramide {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        String entrada = "8 maisculas";

        int letras = Integer.parseInt(entrada.split(" ")[0]);
        String tipo = entrada.split(" ")[1];

        if(letras < 1 || letras > 26)
            System.exit(0);

        run(letras, tipo);
    }

    private static void run(int letras, String tipo) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String[] alfabeto_str = alfabeto.split("");

        // processamento
        if(tipo.equalsIgnoreCase("maisculas")) {
            for(int i = 1; i <= letras; i++) {
                int pontos = 26 - i;

                for(int j = 1; j <= pontos; j++) {
                    System.out.print(".");
                }

                for(int k = 1; k <= i; k++) {
                    System.out.print(alfabeto_str[k-1].toUpperCase());
                }

                System.out.println();
            }
        } else if(tipo.equalsIgnoreCase("minusculas")) {
            for(int i = 1; i <= letras; i++) {
                int pontos = 26 - i;

                for(int j = 1; j <= pontos; j++) {
                    System.out.print(".");
                }

                for(int k = 1; k <= i; k++) {
                    System.out.print(alfabeto_str[k-1].toLowerCase());
                }

                System.out.println();
            }
        }
    }
}