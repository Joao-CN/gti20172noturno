package lista3;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		 
		Scanner leia=new Scanner(System.in);
		
		 int Cont = 1, B;
	        double A, Mult = 1;
	        
	        System.out.println("Digite o valor de A: ");
	        A = leia.nextDouble();
	        System.out.println("Digite o valor de B: ");
	        B = leia.nextInt();
	       
	        while(Cont <= B){
	        Mult = Mult * A;
	        Cont++;
	        }
	        System.out.println("A elevado a B é:"+Mult);
	    }
	}
