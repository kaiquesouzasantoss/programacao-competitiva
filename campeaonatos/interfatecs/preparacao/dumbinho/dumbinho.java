public class dumbinho {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        String entrada = "23582";

        run(entrada.split(""));
    }

    private static void run(String[] numeros) {
        int soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += Integer.parseInt(numeros[i]);
        }

        if(soma % 2 == 0) 
            System.out.println("dumbinho");
        else
            System.out.println("8-bonito");
    }
}