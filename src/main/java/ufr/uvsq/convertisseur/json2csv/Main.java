package ufr.uvsq.convertisseur.json2csv;


import java.util.Scanner;

import ufr.uvsq.convertisseur.Exceptions.*;

public class Main {
	
	static Scanner sc;

	public static void main(String[] args) throws SaisiesExceptions,CheminsExceptions
	{
		int test=1;
	
		do
	{
		
			int choice=0;
			try{ 
				
				choice=Show.menu();
				
			}catch(SaisiesExceptions e){};
				
		
		switch (choice) {
	        case 1:
			     {	   
			    	    System.out.println("Entrez le chemin absolu du fichier JSON");			    		
			    		sc =new Scanner(System.in);		
			    		String chemin=sc.nextLine();		
			    		Convertisseur converter =new Convertisseur();
			    		try{
			    			converter.to_csv(chemin);
			    			System.out.println("Operation terminée");
			    			test= Show.suite();
			    		}catch(Exception e){
			    			
			    		}
	        	 }
	            break; 
	        case 2:
	        	{	   
			    	    System.out.println("Entrez le chemin absolu du fichier CSV");			    		
			    		sc =new Scanner(System.in);		
			    		String chemin=sc.nextLine();	
			    		Convertisseur converter =new Convertisseur();	    		
			    		converter.to_json(chemin);
			    		System.out.println("Operation terminée");
			    		
			    		test= Show.suite();
	        	}
	            break;
	        case 3:
	        	
	            System.exit(0);
	       
	        /*default:
			        	System.out.println("Votre choix ne se trouve pas dans le menu/n! ");
			        	
			    		test= Show.suite();*/
		
	    }
	} while(test==1);
	
	}

}
