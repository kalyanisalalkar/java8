import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class OccuranceCharacter {
	public static void main(String[] args) {
	/*	String s = "Java programing";
		char s1[] = s.toCharArray();
		Map<Character, Integer> hmap = new HashMap<>();
		for (char c : s1) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
				
			}
			else {
				hmap.put(c, 1);
			}
			
		}
		for (Map.Entry<Character, Integer>entry :hmap.entrySet()){
			if(entry.getValue() >1) {
				System.out.println(entry.getKey() + ":" +entry.getValue());
			}
			
			
			
		}*/
		
		List<String> number = Arrays.asList("one","two","three","five");
		Optional<String> findFirst = number.stream().filter(str->str.startsWith("o")).findFirst();
		System.out.println(findFirst.isPresent());
		System.out.println(findFirst.isEmpty());
		System.out.println(findFirst.get());
		
				
		
	}

}
