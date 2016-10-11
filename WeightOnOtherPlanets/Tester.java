import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
	Scanner AdrianHas3Nipples=new Scanner(System.in);
	System.out.println("What is your weight on Earth?");
	double weight=AdrianHas3Nipples.nextDouble();
	
	Scanner AdrianHas4Nipples=new Scanner(System.in);
	System.out.println("Planet options:");
	System.out.println("1. Voltar");
	System.out.println("2. Krypton");
	System.out.println("3. Fertos");
	System.out.println("4. Servontos");
	System.out.println();
	System.out.println("Selection?");
	
	int x=AdrianHas4Nipples.nextInt();
	
	switch(x)
	{
		case 1:
			System.out.println(weight*.091);
			break;
		case 2:
			System.out.println(weight*.720);
			break;	
		case 3:
			System.out.println(weight*.865);
			break;
		case 4:
			System.out.println(weight*4.612);
			break;
		default:
			System.out.println("That is not a valid"
					+ " response, silly child.");
			
	}		
	}

}
