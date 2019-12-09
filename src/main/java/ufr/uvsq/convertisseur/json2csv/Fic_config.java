package ufr.uvsq.convertisseur.json2csv;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.beanutils.converters.IntegerConverter;

public class Fic_config 
{
	
	private static String libelle;
	private static int quantite;
	private static  float prix;	

	
	public static String getLibelle() {
		return libelle;
	}


	public static void setLibelle(String libelle) {
		Fic_config.libelle = libelle;
	}


	public static int getQuantite() {
		return quantite;
	}


	public static void setQuantite(int quantite) {
		Fic_config.quantite = quantite;
	}


	public static float getPrix() {
		return prix;
	}


	public static void setPrix(float prix) {
		Fic_config.prix = prix;
	}


	public static void conf()
	{
		
		 //First we have to create object of Properties class.
		 Properties prop=new Properties();
		 
		// Create object of FileInputStream and give property file location as fileInputStream parameter (which property file is to be read)
		try 
		{
			 FileInputStream ip= new FileInputStream("F:/EclipseProjects/json2csv/src/main/ressources/Mesconfig.properties");
			 prop.load(ip);
			 libelle= prop.getProperty("libbele");
			 quantite=Integer.parseInt(prop.getProperty("quantite"));
			 prix=Float.parseFloat(prop.getProperty("prix"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			Properties_Config conf= new Properties_Config()
		{

			@Override
			public void setLibelle(String libelle) {
				// 
				super.setLibelle(libelle);
			}

			@Override
			public void setPrix_total(int prix_total) {
				// 
				super.setPrix_total(quantite);
			}

			@Override
			public void setQuantite(float quantite) {
				// TODO Auto-generated method stub
				super.setQuantite(quantite);
			}
				
				
				
			
		};
	   
			
		
	}
}
