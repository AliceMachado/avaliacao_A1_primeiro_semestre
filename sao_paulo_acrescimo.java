package auxilio_a1_prova_online_programacao_de_solucoes_computacionais;

public class sao_paulo_acrescimo {
    
    public static double M(double valor_beneficio){
        double acrescimo_sp = 0.1;
        double valor_acrescimo_sp = valor_beneficio * acrescimo_sp;
        double valor_total_bene_sp = valor_beneficio + valor_acrescimo_sp;
        return valor_total_bene_sp;
        
    }
}