import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Challenge {
    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante, List<Integer> minutosAssistidos) {

        List<Integer> resultadoFinal = new ArrayList<Integer>();
        int total = 0;
        int size = minutosAssistidos.size();
        for (int i = 0; i < size; i++) {

            int horas = (int) Math.ceil(minutosAssistidos.get(i) / 60.0);
            if (assinante.get(i)) {
                total += horas * 2;
            } else {
                total += horas;
            }
        }

        for (int i = 0; i < size; i++) {
            int horas = (int) Math.ceil(minutosAssistidos.get(i) / 60.0);
            if (assinante.get(i)) {
                horas *= 2;
            }

            resultadoFinal.add(Math.round((horas / (float) total) * 100));
        }

        return resultadoFinal;
    }
}
