import java.util.HashSet;

public class missingElementsInArray {

	public static void main(String[] args) {
		 int arr[] = {1,2,3,5,6,8};
	       int maxLen = arr[arr.length-1];
	       HashSet<Integer> hs = new HashSet<>();
	       for(int a: arr)
	       {
	          hs.add(a);
	       }
	       for(int i=1; i<=maxLen; i++)
	       {
	           if(!hs.contains(i))
	           {
	               System.out.println("Missing element " + i);
	           }
	       }

	}

}
