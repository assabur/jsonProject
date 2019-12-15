package ufr.uvsq.convertisseur.json2csv;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import ufr.uvsq.convertisseur.Exceptions.*;

public class Convertisseur

{
<<<<<<< HEAD
 
	
	  public void to_csv (String chemin) 
=======
	
	  public void to_csv (String chemin) throws CheminsExceptions,FichiersVide
>>>>>>> dacfd92d82c824290a8cc1557730776a1345ff65
	{
		  //Verification de l'existance du fichier
		  File Fichier=new File(chemin);
		  if(Fichier.exists()==false){
			  throw new CheminsExceptions();
		  //if(true){
		  }else{
			  
			  if(Fichier.length()==0){
				  throw new FichiersVide();
			  }else{
				  try {

						JsonNode jsonTree = new ObjectMapper().readTree(Fichier);
						com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
						
						JsonNode firstObject = jsonTree.elements().next();
						
						firstObject.fieldNames().forEachRemaining(fieldName -> {((com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder) csvSchemaBuilder).addColumn(fieldName);} );
						CsvSchema csvSchema = ((CsvSchema) csvSchemaBuilder.build()).withHeader();
						
						CsvMapper csvMapper = new CsvMapper();
						csvMapper.writerFor(JsonNode.class)
							  .with(csvSchema)
							  .writeValue(new File("C:/Users/ACER E1/Documents/java/Convert_Json_Csv/jsonProject/src/main/ressources/Json_to_Csv/csvFrom_Json.csv"), jsonTree);
						
						
					} catch (Exception e)
					{
						e.printStackTrace();
					}
			  }
			  
		  }
		
			
	}
	
	public void to_json(String chemin)
	{
		
		try 
		{
			CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
			CsvMapper csvMapper = new CsvMapper();
<<<<<<< HEAD
			MappingIterator<Structure> Structure= csvMapper.readerFor(Structure.class)
=======
			MappingIterator<Structure> orderLines = csvMapper.readerFor(Structure.class)
>>>>>>> dacfd92d82c824290a8cc1557730776a1345ff65
			  .with(orderLineSchema)
			  .readValues(new File(chemin));
			
			
			new ObjectMapper()
			  .configure(SerializationFeature.INDENT_OUTPUT, true)
<<<<<<< HEAD
			  .writeValue(new File("src/main/ressources/Fichier_Csv_2_Json"), Structure.readAll());
=======
			  .writeValue(new File("C:/Users/ACER E1/Documents/java/Convert_Json_Csv/jsonProject/src/main/ressources/Csv_to_Json"), orderLines.readAll());
>>>>>>> dacfd92d82c824290a8cc1557730776a1345ff65
		}
		 catch (Exception e)
		{
			 e.printStackTrace();
		};
	}

}


