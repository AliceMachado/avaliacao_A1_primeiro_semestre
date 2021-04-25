package auxilio_a1_prova_online_programacao_de_solucoes_computacionais;

public class acrescimo_empregador {

    public static double C(double valor_beneficio){
        double acrescimo = 0.1;
        double valor_acrescimo = valor_beneficio * acrescimo;
        double valor_total_bene = valor_beneficio + valor_acrescimo;
        return valor_total_bene;
    }
}