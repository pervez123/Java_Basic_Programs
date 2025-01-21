package Arrays_Practice_Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"India", "China", "America", "India", "America", "India", "China"};
        HashMap<String, Integer> hm = new HashMap<>();

        // Count occurrences
        for (String s : str) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        // Sort based on values (count descending), and if values are equal, by key length ascending
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hm.entrySet()); 
  
        entryList.sort((a, b) -> {
            if (!b.getValue().equals(a.getValue())) {
                return b.getValue() - a.getValue(); // Sort by count descending
            } else {
                return b.getKey().length() - a.getKey().length() ; // Sort by key length ascending
            }
        });

        // Print the sorted entries
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
	