import java.util.ArrayList;
import java.util.Comparator;

public class pivo {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception ignored) {}
    }

    private static void input() {
        String[] entrada = String.valueOf("10 20 30").split(" ");
        ArrayList<Integer> valores = new ArrayList<>();

        for(String valor:entrada) {
            valores.add(Integer.parseInt(valor));
        }

        run(valores);
    }

    private static void run(ArrayList<Integer> valores) {
        valores.sort(Comparator.naturalOrder());

        System.out.print(valores.get(1));
    }
}