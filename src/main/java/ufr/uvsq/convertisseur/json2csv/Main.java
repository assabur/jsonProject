package ufr.uvsq.convertisseur.json2csv;


import java.io.IOException;
import java.util.Scanner;

<<<<<<< HEAD
import com.fasterxml.jackson.databind.JsonMappingException;
=======
import ufr.uvsq.convertisseur.Exceptions.*;
>>>>>>> dacfd92d82c824290a8cc1557730776a1345ff65

public class Main {
	
	static Scanner sc;

<<<<<<< HEAD
	public static void main(String[] args) throws IOException, JsonMappingException, IOException
=======
	public static void main(String[] args) throws SaisiesExceptions,CheminsExceptions
>>>>>>> dacfd92d82c824290a8cc1557730776a1345ff65
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
	        case 3:
        	{	   
		    	    System.out.println("Entrez le chemin absolu du fichier JSON");			    		
		    		sc =new Scanner(System.in);		
		    		String chemin=sc.nextLine();	
		    		To_Csv_With_Config converter =new To_Csv_With_Config();	    		
		    		converter.config(chemin);
		    		System.out.println("Operation terminÃ©e");
		    		
		    		test= Show.suite();
        	}
	            break;
	        case 4:
	        	
	            System.exit(0);
	       
	        /*default:
			        	System.out.println("Votre choix ne se trouve pas dans le menu/n! ");
			        	
			    		test= Show.suite();*/
		
	    }
	} while(test==1);
	
	}

}
