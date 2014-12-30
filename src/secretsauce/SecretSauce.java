package secretsauce;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import secretsauce.food.Food;

public class SecretSauce {

	private static final String JSON_FILE = "/Users/kaushikchaubal/Documents/workspace/Eclipse/SecretSauce/resources/food.json";

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Food food = new Food("Fish and Chips", "Orange Juice", Arrays.asList("Crips", "mashed potatoes") , "ice cream");
		
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(JSON_FILE);
		mapper.writeValue(file, food);
		System.out.println(mapper.writeValueAsString(food));

		Food user = mapper.readValue(file, Food.class);
		System.out.println(user);
	}

}
