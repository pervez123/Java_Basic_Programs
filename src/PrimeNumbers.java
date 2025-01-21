import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,8,10,20};
        List<Integer> primeArr = new ArrayList<>();
        for(int num: a)
        {
            boolean isPrime = true;
            if(num<=1)
            {
                isPrime = false;
            }
            else{
            for(int i=2; i<=Math.sqrt(num); i++)
            {
                if(num%i==0)
                {
                    isPrime = false;
                }
            }
            }
            if(isPrime)
            {
                primeArr.add(num);
            }
            else
            {
                System.out.println("non Prime number " + num);
            }
        }
        
        System.out.print("Prime numbers : "+ primeArr);

	}

}
