package ufr.uvsq.convertisseur.json2csv;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class Convertisseur

{
	

   
	
	  public void to_csv (String chemin) 
	{
		
		try {
			
			JsonNode jsonTree = new ObjectMapper().readTree(new File(chemin));
			
			com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder csvSchemaBuilder = CsvSchema.builder();
			
			JsonNode firstObject = jsonTree.elements().next();
			firstObject.fieldNames().forEachRemaining(fieldName -> {((com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder) csvSchemaBuilder).addColumn(fieldName);} );
			CsvSchema csvSchema = ((CsvSchema) csvSchemaBuilder.build()).withHeader();
			
			CsvMapper csvMapper = new CsvMapper();
			csvMapper.writerFor(JsonNode.class)
			  .with(csvSchema)
			  .writeValue(new File("F:/EclipseProjects/json2csv/src/main/ressources/Fichier_Json_2_Csv"), jsonTree);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
			
	}
	
	public void to_json()
	{
		
		try 
		{
			CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
			CsvMapper csvMapper = new CsvMapper();
			MappingIterator<OrderLine> orderLines = csvMapper.readerFor(OrderLine.class)
			  .with(orderLineSchema)
			  .readValues(new File("F:/EclipseProjects/json2csv/src/main/ressources/Fichier_Csv"));
			
			
			new ObjectMapper()
			  .configure(SerializationFeature.INDENT_OUTPUT, true)
			  .writeValue(new File("src/main/ressources/Fichier_Csv_2_Json"), orderLines.readAll());
		}
		 catch (Exception e)
		{
			 e.printStackTrace();
		}
		;
	}

}


