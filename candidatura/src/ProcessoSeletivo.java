import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA","DANIELA", "JORGE" };

        List<String> candidatosLista = new LinkedList<String>(Arrays.asList(candidatos));
        candidatosLista = selecionarCandidatos(candidatosLista);

            System.out.println(candidatosLista);
        }
    
    static List<String> selecionarCandidatos(List<String> candidatos) {
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.size()) {
            double salarioPretendido = valorPretendido();
            if (analisarCandidato(salarioPretendido)) {
                candidatosSelecionados += 1;
            } else {
                candidatos.remove(candidatoAtual);
            }
        }
          return candidatos;
    }

    static boolean analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
         //   System.out.println("LIGAR PARA O CANDIDATO.");
            return true;
        } else if (salarioPretendido == salarioBase) {
        //    System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
            return true;
        } else {
        //    System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            return false;
        }
    }
    static double valorPretendido() { 
            return ThreadLocalRandom.current().nextDouble(1800,2200);
        }
}
