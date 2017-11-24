package lista3;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		 
		Scanner leitura=new Scanner(System.in);
		
		int cont = 1, idade, contOtimo = 0,max=0;
        float contBom =0, difBR =0, contRegular = 0, mIdade, somaIruim = 0, somaIpessimo = 0, contRuim = 0;
        float  contPessimo = 0, idadeMaiorP = 0, percPessimo = 0, idadeMaiorR = 0, idadeMaiorO = 0, difIdadeOeR = 0, percBeR = 0;
        String nota;
        
        while(cont<= max){
            System.out.print("Digite a idade da "+cont+"ª Pessoa: ");
        idade = leitura.nextInt();
            do{
            System.out.println("Digite a nota que você da para o cinema:");
            System.out.println("Nota | Significado");
            System.out.println(" A   |   Ótimo  ");
            System.out.println(" B   |   Bom");
            System.out.println(" C   |   Regular");
            System.out.println(" D   |   Ruim");
            System.out.println(" E   |   Péssimo");
            System.out.println("");
            System.out.print("Qual é a nota?: ");
            nota = leitura.next();
            if(!nota.equalsIgnoreCase("A") && !nota.equalsIgnoreCase("B") && !nota.equalsIgnoreCase("C") && !nota.equalsIgnoreCase("D") && !nota.equalsIgnoreCase("E")){
                    System.out.println("");
                    System.out.println("NOTA INVALIDA! DIGITE UMA DAS OPÇÕES:");
                }
            }while(!nota.equalsIgnoreCase("A") && !nota.equalsIgnoreCase("B") && !nota.equalsIgnoreCase("C") && !nota.equalsIgnoreCase("D") && !nota.equalsIgnoreCase("E"));
            
            cont++;
            
            if(nota.equalsIgnoreCase("A")){
                contOtimo++;
                if(idade>idadeMaiorO){
                    idadeMaiorO = idade;
                }
            }
            else if(nota.equalsIgnoreCase("B")){
                contBom++;
            }
            else if(nota.equalsIgnoreCase("C")){
                contRegular++;
            }
            else if(nota.equalsIgnoreCase("D")){
                contRuim++;
                somaIruim= somaIruim+idade;
                if(idade>idadeMaiorR){
                    idadeMaiorR = idade;
                }
            }
            else if(nota.equalsIgnoreCase("E")){
                contPessimo++;
                somaIpessimo = somaIpessimo+idade;
                if(idade>idadeMaiorP){
                    idadeMaiorP = idade;
                }
            }   
        }
        if(contBom>contRegular){
            difBR = contBom - contRegular; 
            percBeR = difBR/contBom * 100f;
        }
        else if(contBom<contRegular){
            difBR = contRegular - contBom; 
            percBeR = difBR/contRegular * 100f;
        }
        mIdade = somaIruim/contRuim;
        percPessimo = contPessimo/(cont-1) * 100f;
        if(idadeMaiorR>idadeMaiorO){
            difIdadeOeR = idadeMaiorR - idadeMaiorO;
        }
        else if(idadeMaiorO>idadeMaiorR){
            difIdadeOeR = idadeMaiorO - idadeMaiorR;
        }
        System.out.println("A quantidade de respostas ótimo: "+contOtimo);
        System.out.println("A diferença percentual entre respostas bom e regular: "+percBeR+"%");
        System.out.println("Média de idade das pessoas que respondeu ruim: "+mIdade);
        System.out.println(percPessimo+"% das pessoas responderam péssimo e a maior idade que utilizou esta opção foi:"+idadeMaiorP);
        System.out.println("A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim e:"+difIdadeOeR);
    }
}
