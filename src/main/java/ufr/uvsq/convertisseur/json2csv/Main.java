package ufr.uvsq.convertisseur.json2csv;


import java.util.Scanner;

public class Main {
	
	static Scanner sc;

	public static void main(String[] args)
	{
		
		System.out.println("Entrez le chemin absolu du fichier JSON");
		
		sc =new Scanner(System.in);		
		String chemin=sc.nextLine();		
		Convertisseur converter =new Convertisseur();
		
		converter.to_csv(chemin);		
		
	}

}
