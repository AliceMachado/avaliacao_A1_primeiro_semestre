package auxilio_a1_prova_online_programacao_de_solucoes_computacionais;

public class desempregado_reducao {
    public static double H(double valor_beneficio){
        //Troquei a letra I pela proxima letra do meu nome, como foi solicitado
        double reducao = 0.1;
        double valor_reducao = valor_beneficio * reducao;
        double valor_total_bene = valor_beneficio - valor_reducao;
        return valor_total_bene;
    }
}