package Day6;

import java.util.HashMap;
import java.util.Map;
// HashMap With Example
//Checked
public class Hashmap {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Priti Singh");
		map.put(2, "Gochu Alelele");
		map.put(3, "Punnu Singh");
		map.put(4, "Mahir Cute");
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
