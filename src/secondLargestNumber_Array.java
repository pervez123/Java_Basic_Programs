public class secondLargestNumber_Array {
	public static void main(String[] args) {

		int[] arr = {1,2,3,0,0,1,8,8,7};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (arr.length < 2) {
			System.out.print("Array Size is lesser than 2");
		} else {
			for (int n : arr) {
				if (n > largest) {
					secondLargest = largest;
					largest = n;
				} else if (n > secondLargest && n < largest) {
					secondLargest = n;
				}
			}

			if (secondLargest == Integer.MIN_VALUE) {
				System.out.print("Second largest number is not available");
			} else {
				System.out.print("Second Largest number is " + secondLargest);
			}
		}
	}

}
