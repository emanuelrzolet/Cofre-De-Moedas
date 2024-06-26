package cofre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try ( //Criação do Scanner e a inicialização de cofre
                Scanner tScanner = new Scanner(System.in)) {
                Cofrinho cofre = new Cofrinho();
            
            //Inicio da Execução
            System.out.println("-_- Cofrinho de Moedas -_-");
            //Aqui está a implementação do menu, criei a função que fará o print na tela para o código ser reutilizado e ter um uso da aplicação mais fluído.
            printMenu();
            //A variável escolha vai ser utilizada para quando o usuário entrar com alguma ação
            int escolha = tScanner.nextInt();
            while (escolha != 0) {
                //Trechos condicionais encadenados
                //switch
                //  if
                switch (escolha) {
                    
                    case 1:
                        if (cofre.checarTamanho() == true){
                            System.out.println("A lista está vazia");
                            break;
                        }else{
                            cofre.listarMoedas();
                            System.out.println("Moeda foi adicionada.");
                            break;}
                        
                    case 2:
                    	System.out.println("-_-_-_-Adicionando Moeda-_-_-_-");
                        System.out.println("Escolha o tipo de moeda para adicionar: ");
                        System.out.println("[1] - Real");
                        System.out.println("[2] - Dólar");
                        System.out.println("[3] - Euro");
                        System.out.println("[0] - Cancelar");
                        escolha = tScanner.nextInt();
                        System.out.println("Digite o valor da moeda: ");
                        double valor = tScanner.nextDouble();
                        if(escolha == 1){
                            cofre.adicionar(new Real(valor,"Real"));
                            break;
                            
                        }
                        else if(escolha == 2){
                            cofre.adicionar(new Dolar(valor, "Dolar"));
                            break;
                        }
                        else if (escolha == 3){
                            cofre.adicionar(new Euro(valor, "Euro"));
                            break;
                            
                        }
                        else if (escolha == 0){
                            break;
                        }
                        else{
                            System.out.println("Valor digitado não é válido!");
                            break;
                        }
                    case 3:
                        System.out.println("-_-_-_-Lista De Moedas-_-_-_-");
                        cofre.listarMoedas();
                        System.out.println("Digite a moeda a ser removida ou qualquer outro número para sair: ");
                        if (cofre.checarTamanho() == true){
                            System.out.println("A lista está vazia");
                            break;
                        }
                        //Tratamento de erro
                        //Impedindo a entrada de caracteres difentes de números inteiros
                        try {
                            if (tScanner.hasNextInt()) {
                                escolha = tScanner.nextInt();
                            } else {
                                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                                // Limpar o buffer do scanner para evitar loops infinitos
                                tScanner.next();
                                break;
                            }
                            
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Valor digitado incorreto!");
                            break;

                        }
                        catch(InputMismatchException e){
                            break;
                        }
                        catch (Exception generic){
                            break;
                        }
                        
                        try{
                        	cofre.remover(escolha);
                        	}
                        catch (IndexOutOfBoundsException ce) {
                            System.out.println("Valor digitado incorreto!");
                            break;}
                        break;
                    case 4:
                        System.out.println("-_-_-_-Convertendo Moedas Para Real-_-_-_-");
                        //Aqui a função para converter é acionada, o tipo de moeda será alterado para evitar erros
                        cofre.totalConvertido();
                        break;
                        
                        
                    default:
                        System.out.println("Valor digitado não é válido!");
                        break;
                }
                printMenu();
                escolha = tScanner.nextInt();
            }
        }
    }


    //Método para imprimir o MENU
    public static void printMenu(){
        System.out.println("Menu: ");
        System.out.println("[1] - Listar Moedas");
        System.out.println("[2] - Adicionar Moeda");
        System.out.println("[3] - Remover Moeda");
        System.out.println("[4] - Converter Moedas");
        System.out.println("[0] - Encerrar aplicação");
    };

}
