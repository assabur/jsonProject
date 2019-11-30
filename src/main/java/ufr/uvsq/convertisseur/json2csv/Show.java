package ufr.uvsq.convertisseur.json2csv;

import java.util.Scanner;

public class Show 
{
	public static int menu ()
	{
		  

		        int selection;
		        Scanner input = new Scanner(System.in);

		        /***************************************************/

		        System.out.println("Votre choix Svp\n");
		        System.out.println("-------------------------\n");
		        System.out.println("1 - Convertion JSON en CSV ");
		        System.out.println("2 - Convertion CSV en JSON ");
		        System.out.println("3 - Quitter");
		        
		        selection = input.nextInt();
		        return selection;    
		
	}
	
	public static int suite()
	{
		int selection;
		Scanner input=new Scanner(System.in);
		System.out.println("*******************************************\n");
		
		System.out.println("Souhaitez vous continuer (1/0)?\n");

		System.out.println("*******************************************\n");

		selection = input.nextInt();
		return selection;
	}

}
