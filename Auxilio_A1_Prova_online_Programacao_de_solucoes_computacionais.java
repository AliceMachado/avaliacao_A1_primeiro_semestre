package auxilio_a1_prova_online_programacao_de_solucoes_computacionais;
 // @autor Alice Machado Koch
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Auxilio_A1_Prova_online_Programacao_de_solucoes_computacionais {

    public static void main(String[] args) {
        
        String nome_completo, estado, letra, aposentado, meses_desempregado = "", nome_maiorValor1 = "", nome_maiorValor2 = "", nome_maior_tempo1 = "", nome_maior_tempo2 = "";
        int ano_nasci = 0, categoria, qtd_funcionario, meses_desem, meses_beneficio = 0, qtd_beneficiados = 0, usuarios_lidos = 0;
        int maiorValor2 = 0, maiorValor1 = 0, valor_beneficio = 0, maior_tempo1 = 0, maior_tempo2 = 0;
        double valor_total = 0, valor_total_meses = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Deseja executar o programa?\nDigite 's' para SIM\nDigite 'n' para NÃO");
        letra = teclado.next();
        
        while (letra.equals("s") || letra.equals("S")) {
            
            teclado.nextLine();
            
            System.out.println("Digite o seu nome completo");
            nome_completo = teclado.nextLine();

            System.out.println("Digite o seu ano de nascimento");
            ano_nasci = teclado.nextInt();
            int a = anoNascimento.A(ano_nasci);
            
            teclado.nextLine();
            
            System.out.println("Digite a sigla do seu estado");
            estado = teclado.nextLine();
            
            
            System.out.println("Informe a sua categoria:"
                    + "\n1 - Empregado"
                    + "\n2 - Empregador"
                    + "\n3 - Desempregado");
            categoria = teclado.nextInt();
            
            teclado.nextLine();
            
            switch (categoria) {
                
                case 1:
                    System.out.println("O empregado é aposentado?\nDigite 's' para SIM\nDigite 'n' para NÃO");
                    aposentado = teclado.next();
                    
                    if (aposentado.equals("s") || aposentado.equals("S")) {
                        
                        String e = aposentados.E(aposentado);
                        System.out.println("Digite um valor entre R$1000 e R$1800 para o benefício: ");
                        valor_beneficio = teclado.nextInt();
                        qtd_beneficiados = qtd_beneficiados + 1;
                        if (valor_beneficio < 1000 && valor_beneficio > 1800) {
                            System.out.println(" Valor inválido!\nDigite um valor entre R$1000 e R$1800 para o benefício: ");
                            valor_beneficio = teclado.nextInt();
                        }
                        if (estado.equals("sp") || estado.equals("SP") || estado.equals("Sp")) {
                            double m = sao_paulo_acrescimo.M(valor_beneficio);
                            valor_beneficio = (int) m;
                            System.out.println("O usuário atende às seguintes regras:\n"
                                        + "- Usuário é maior de idade\n"
                                        + "- Usuário aposentado, portanto terá 6 meses de duração do benefício\n"
                                        + "- Usuário de São Paulo, portanto ganha um acrescimo de 10% no valor do benefício");
                            System.out.println("O aposentado " + nome_completo + ", nascido no ano de " + ano_nasci + ", da categoria Empregado\n"
                                        + "Receberá benefício durante " + e + ", no valor de R$" + valor_beneficio);
                            meses_beneficio = 6;
                            valor_total_meses = valor_beneficio * meses_beneficio;
                        }else{
                            System.out.println("O usuário atende às seguintes regras:\n"
                                        + "- Usuário é maior de idade\n"
                                        + "- Usuário aposentado, portanto terá 6 meses de duração do benefício");
                            System.out.println("O aposentado " + nome_completo + ", nascido no ano de " + ano_nasci + ", da categoria Empregado\n"
                                        + "Receberá benefício durante " + e + ", no valor de R$" + valor_beneficio);
                            meses_beneficio = 6;
                            valor_total_meses = valor_beneficio * meses_beneficio;
                        }
                        
                    }else if (a > 18) {
                        
                        System.out.println("Digite um valor entre R$1000 e R$1800 para o benefício: ");
                        valor_beneficio = (int) teclado.nextDouble();
                        qtd_beneficiados = qtd_beneficiados + 1;
                        if (valor_beneficio < 1000 && valor_beneficio > 1800) {
                            System.out.println(" Valor inválido!\nDigite um valor entre R$1000 e R$1800 para o benefício: ");
                            valor_beneficio = (int) teclado.nextDouble();
                        }
                        
                        System.out.println("Digite a duração do benefício de no máximo 12 meses e mínimo 2 meses: ");
                        meses_beneficio = teclado.nextInt();
                        if (meses_beneficio < 2 && meses_beneficio > 12) {
                            System.out.println(" Valor inválido!\nDigite a a duração do benefício de no máximo 12 meses e mínimo 2 meses: ");
                            valor_beneficio = (int) teclado.nextDouble();
                        }
                        
                        if (estado.equals("sp") || estado.equals("SP") || estado.equals("Sp")) {
                            double m = sao_paulo_acrescimo.M(valor_beneficio);
                            valor_beneficio = (int) m;
                            System.out.println("O usuário atende às seguintes regras:\n"
                                        + "- Usuário é maior de idade\n"
                                        + "- Usuário de São Paulo, portanto ganha um acrescimo de 10% no valor do benefício");
                            System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Empregado\n"
                                        + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                            valor_total_meses = valor_beneficio * meses_beneficio;
                        }else{
                            System.out.println("O usuário atende às seguintes regras:\n"
                                        + "- Usuário é maior de idade");
                            System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Empregado\n"
                                        + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                            valor_total_meses = valor_beneficio * meses_beneficio;
                        }
                        }else{
                            System.out.println("Menores de 18 anos não ganham benefício");
                            valor_beneficio = 0;
                        }
                    break;
                    
                case 2:
                        System.out.println("Quantos funcionários o empregador tem?");
                        qtd_funcionario = teclado.nextInt();
                        
                    if (a > 18) {
                        
                        if (qtd_funcionario <= 50) {
                            
                            valor_beneficio = 200 * qtd_funcionario;
                            double c = acrescimo_empregador.C(valor_beneficio);
                            qtd_beneficiados = qtd_beneficiados + 1;
                            
                            System.out.println("Digite a duração do benefício de no máximo 12 meses e mínimo 2 meses: ");
                            meses_beneficio = teclado.nextInt();
                            if (meses_beneficio < 2 && meses_beneficio > 12) {
                                System.out.println(" Valor inválido!\nDigite a a duração do benefício de no máximo 12 meses e mínimo 2 meses: ");
                                valor_beneficio = (int) teclado.nextDouble();
                            }
                            valor_beneficio = (int) c;
                            if (estado.equals("sp") || estado.equals("SP") || estado.equals("Sp")) {
                            double m = sao_paulo_acrescimo.M(valor_beneficio);
                            valor_beneficio = (int) m;
                            System.out.println("O usuário atende às seguintes regras:\n"
                                        + "- Usuário é maior de idade\n"
                                        + "- Usuário de São Paulo, portanto ganha um acrescimo de 10% no valor do benefício\n"
                                        + "- Usuário tem menos de 50 funcionários, portanto haverá um acrescimo de 10% no valor do benefício");
                            System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Empregador\n"
                                        + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                            valor_total_meses = valor_beneficio * meses_beneficio;
                            }else{
                            System.out.println("O usuário atende às seguintes regras:\n"
                                    + "- Usuário é maior de idade\n"
                                    + "- Usuário tem menos de 50 funcionários, portanto haverá um acrescimo de 10% no valor do benefício");
                            System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Empregador\n"
                                    + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                            valor_total_meses = valor_beneficio * meses_beneficio;
                            }
                        }else{
                            
                            System.out.println("Digite a duração do benefício de no máximo 12 meses e mínimo 2 meses: ");
                            meses_beneficio = teclado.nextInt();
                            if (meses_beneficio < 2 && meses_beneficio > 12) {
                                System.out.println(" Valor inválido!\nDigite a a duração do benefício de no máximo 12 meses e mínimo 2 meses: ");
                                valor_beneficio = (int) teclado.nextDouble();
                            }
                            valor_beneficio = 200 * qtd_funcionario;
                            if (estado.equals("sp") || estado.equals("SP") || estado.equals("Sp")) {
                                double m = sao_paulo_acrescimo.M(valor_beneficio);
                                valor_beneficio = (int) m;
                                System.out.println("O usuário atende às seguintes regras:\n"
                                            + "- Usuário é maior de idade\n"
                                            + "- Usuário de São Paulo, portanto ganha um acrescimo de 10% no valor do benefício");
                                System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Empregador\n"
                                            + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                                valor_total_meses = valor_beneficio * meses_beneficio;
                            }else{
                                System.out.println("O usuário atende às seguintes regras:\n"
                                        + "- Usuário é maior de idade");
                                System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Empregador\n"
                                        + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                                valor_total_meses = valor_beneficio * meses_beneficio;
                            }
                        }
                        
                    }else{
                        System.out.println("Menores de 18 anos não ganham benefício");
                        valor_beneficio = 0;
                    }
                    break;
                    
                case 3:
                    System.out.println("Há quantos meses está desempregado?");
                    meses_desem = teclado.nextInt();
                    
                    if (a > 18) {
                        
                        System.out.println("Digite um valor entre R$1500 e R$2300 para o benefício: ");
                        valor_beneficio = (int) teclado.nextDouble();
                        if (valor_beneficio < 1500 && valor_beneficio > 2300) {
                            System.out.println(" Valor inválido!\nDigite um valor entre R$1500 e R$2300 para o benefício: ");
                            valor_beneficio = (int) teclado.nextDouble();
                        }
                        
                        String l = desempregado_meses.L(meses_desempregado);
                        meses_desempregado = l;
                        qtd_beneficiados = qtd_beneficiados + 1;
                        meses_beneficio = 6;
                        
                        if (meses_desem < 6) {
                            double h = desempregado_reducao.H(valor_beneficio);
                            valor_beneficio = (int) h;
                            if (estado.equals("sp") || estado.equals("SP") || estado.equals("Sp")) {
                                double m = sao_paulo_acrescimo.M(valor_beneficio);
                                valor_beneficio = (int) m;
                                System.out.println("O usuário atende às seguintes regras:\n"
                                            + "- Usuário é maior de idade\n"
                                            + "- Usuário de São Paulo, portanto ganha um acrescimo de 10% no valor do benefício\n"
                                            + "- Usuário está desempregado a menos de 6 meses, portanto foi reduzido 10% do valor do benefício\n"
                                            + "- Usuário está desempregado, portanto terá 6 meses de duração do benefício");
                                System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Desempregado\n"
                                            + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                                valor_total_meses = valor_beneficio * meses_beneficio;
                            }else{
                                System.out.println("O usuário atende às seguintes regras:\n"
                                            + "- Usuário é maior de idade\n"
                                            + "- Usuário está desempregado a menos de 6 meses, portanto foi reduzido 10% do valor do benefício\n"
                                            + "- Usuário está desempregado, portanto terá 6 meses de duração do benefício");
                                System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Desempregado\n"
                                            + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + l);
                                meses_beneficio = 6;
                                valor_total_meses = valor_beneficio * meses_beneficio;
                            }
                        }else{
                            if (estado.equals("sp") || estado.equals("SP") || estado.equals("Sp")) {
                                double m = sao_paulo_acrescimo.M(valor_beneficio);
                                valor_beneficio = (int) m;
                                System.out.println("O usuário atende às seguintes regras:\n"
                                            + "- Usuário é maior de idade\n"
                                            + "- Usuário de São Paulo, portanto ganha um acrescimo de 10% no valor do benefício\n"
                                            + "- Usuário está desempregado, portanto terá 6 meses de duração do benefício");
                                System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Desempregado\n"
                                            + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + meses_beneficio + " meses");
                                valor_total_meses = valor_beneficio * meses_beneficio;
                            }else{
                                System.out.println("O usuário atende às seguintes regras:\n"
                                            + "- Usuário é maior de idade\n"
                                            + "- Usuário está desempregado, portanto terá 6 meses de duração do benefício");
                                System.out.println("O Usuário " + nome_completo + ",  nascido no ano de " + ano_nasci + ", da categoria Desempregado\n"
                                            + "Receberá benefício no valor de R$" + valor_beneficio + " durante " + l);
                                meses_beneficio = 6;
                                valor_total_meses = valor_beneficio * meses_beneficio;
                            }
                        }
                        valor_total_meses = valor_beneficio * meses_beneficio;
                        
                    }else{
                        System.out.println("Menores de 18 anos não ganham benefício");
                        valor_beneficio = 0;
                    }
                    break;
                
                default: System.out.println("Número digitado inválido!");
                break;
            }
            
            ArrayList<String> nome_tempo = new ArrayList<> ();
            nome_tempo.add(nome_completo);
            Arrays.toString( nome_tempo.toArray() );
            
            ArrayList<String> nomes = new ArrayList<> ();
            nomes.add(nome_completo);
            Arrays.toString( nomes.toArray() );
            
            List<Integer> valores = new ArrayList<> ();
            valores.add(valor_beneficio);
            Arrays.toString( valores.toArray() );
            
            List<Integer> tempo = new ArrayList<> ();
            tempo.add(meses_beneficio);
            Arrays.toString( tempo.toArray() );
            
            for (int i = 0; i < valores.size(); i++) {  
                valores.set(i, valor_beneficio);
                nomes.set(i, nome_completo);
                nome_tempo.set(i, nome_completo);
                tempo.set(i, meses_beneficio);
            }
            for (int i = 0; i < valores.size(); i++) { 
                valores.get(i);
                nomes.get(i);
                if(valores.get(i) > maiorValor1){
                    nome_maiorValor2 = nome_maiorValor1;
                    maiorValor2 = maiorValor1;
                    maiorValor1 = valores.get(i);
                    nome_maiorValor1 = nomes.get(i);
                }else{
                    if((valores.get(i) > maiorValor2) && (valores.get(i) != maiorValor1) && (nomes.get(i) != nome_maiorValor1)) {
                        maiorValor2 = valores.get(i);
                        nome_maiorValor2 = nomes.get(i);
                    }
                }
            }
            
            for (int i = 0; i < tempo.size(); i++) {
                tempo.get(i);
                nome_tempo.get(i);
                if (tempo.get(i) > maior_tempo1) {
                    nome_maior_tempo2 = nome_maior_tempo1;
                    maior_tempo2 = maior_tempo1;
                    maior_tempo1 = tempo.get(i);
                    nome_maior_tempo1 = nome_tempo.get(i);
                }else{
                    if ((tempo.get(i) > maior_tempo2) && (tempo.get(i) != maior_tempo1) && (nome_tempo.get(i) != nome_maior_tempo1)) {
                        maior_tempo2 = tempo.get(i);
                        nome_maior_tempo2 = nome_tempo.get(i);
                    }
                }
                
            }
            
            valor_total = valor_total + valor_total_meses;
            usuarios_lidos = usuarios_lidos + 1;
            
            System.out.println("Deseja executar o programa novamente?\nDigite 's' para SIM\nDigite 'n' para NÃO");
            letra = teclado.next();
        }
        
        System.out.println("A quantidade de usuários lidos é: " + usuarios_lidos);
        System.out.println("A quantidade de usuários beneficiados é: " + qtd_beneficiados);
        System.out.println("O valor total concedido é: " + valor_total);
        System.out.println("O nome da pessoa que irá receber o maior valor é: " + nome_maiorValor1);
        System.out.println("O nome da pessoa que irá receber o segundo maior valor é: " + nome_maiorValor2);
        System.out.println("O nome da pessoa que irá receber benefício pelo maior tempo é: " + nome_maior_tempo1);
        System.out.println("O nome da pessoa que irá receber benefício pelo segundo maior tempo é: " + nome_maior_tempo2);
        
        teclado.close();
    }
}