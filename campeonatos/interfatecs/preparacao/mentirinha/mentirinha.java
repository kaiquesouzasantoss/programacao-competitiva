public class mentirinha {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        int entrada = 9;
        run(entrada);
    }

    private static void run(int valor) {
        int divisores = 0;

        for(int i = 1; i <= valor; i++) {
            if(valor % i == 0) {
                divisores++;
            }
        }

        System.out.println(divisores == 3 ? "sim" : "nao");
    }
}