package auxilio_a1_prova_online_programacao_de_solucoes_computacionais;

import java.time.LocalDateTime;

public class anoNascimento {
    
    public static int A (int ano_nasci) {
            
            LocalDateTime data1 = LocalDateTime.now();
            int anoatual = data1.getYear();
            int idade = anoatual - ano_nasci;
            
            return idade;
        }
    
}