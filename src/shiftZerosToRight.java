import java.util.Arrays;

public class shiftZerosToRight {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0,9,1,8,0,4};
        int nonZero = 0;
        for(int a: arr)
        {
            if(a!=0)
            {
                arr[nonZero] = a;
                nonZero++;
            }
        }
        while(nonZero<arr.length)
        {
            arr[nonZero] = 0;
            nonZero++;
        }
        System.out.print("Arrys after shifting "+ Arrays.toString(arr));

	}

}
