package lista3;

import java.util.Scanner;

public class Exer23{

	public static void main(String[] args) {
		 
		Scanner leitura=new Scanner(System.in);
		    
		  		    
		    int op, mes;
		    double salario;
		    
		            System.out.println("Digite uma das opções do Menu:" );
		            System.out.println("1 - Novo Salário");
		            System.out.println("2 - Férias");
		            System.out.println("3 - Décimo Terceiro");
		            System.out.println("4 - Sair");
		            op = leitura.nextInt();
		            
		            
		    //conf do menu mais enlace de verificaçãos
		            while((op < 1) || (op>4))
		            {
		                System.out.println("Opção inválida! Digite uma das opções do Menu:" );
		                System.out.println("1 - Novo Salário");
		                System.out.println("2 - Férias");
		                System.out.println("3 - Décimo Terceiro");
		                System.out.println("4 - Sair");
		                op = leitura.nextInt();
		            }
		            System.out.println("Digite o seu salário atual:");
		            salario = leitura.nextDouble();
		            if(op == 1)
		            {
		                while(salario <= 0)
		                {
		                    System.out.println("Salário inválido! Digite o seu salário atual:");
		                    salario = leitura.nextDouble();
		                }
		                if(salario <= 1200)
		                {
		                    salario = salario * 1.5;
		                }else if((salario > 1200)&&(salario < 6000))
		                        {
		                            salario = salario * 1.1;
		                        }
		                else
		                {
		                    salario = salario * 1.05;
		                }
		                        
		            }
		            if(op == 2)
		            {
		                salario = salario * 4/3;
		            }
		            if(op == 3)
		            {
		                System.out.println("Digite o número de meses trabalhados:");
		                mes = leitura.nextInt();
		                while((mes<1)||(mes>13))
		                        {
		                            System.out.println("Número de Meses Inválidos, digite novamente: "); 
		                            mes = leitura.nextInt();
		                        }
		                salario = (salario/12)* mes;
		            }
		            System.out.println("A receber: " + salario);
		            
		}
		}
