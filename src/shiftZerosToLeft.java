import java.util.Arrays;

public class shiftZerosToLeft {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0,9,1,8,0,4};
        int nonZero = arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[nonZero] = arr[i];
                nonZero--;
            }
        }
        while(nonZero>=0)
        {
            arr[nonZero] = 0;
            nonZero--;
        }
        System.out.print("Arrys after shifting zeros to the left "+ Arrays.toString(arr));

	}

}
