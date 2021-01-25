import java.util.*;


public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		long StartTime, endTime, executionTime;
		StartTime=System.currentTimeMillis();
		int MaxSequenceLength=-1;
		int Chosen=0;
		/* arr[0] is equal to starting n,
		 * arr[1] is the length of Collatz Sequence,
		 * arr[2] is the number which has the longest subsequence*/
		int [] arr= new int[100000000];
		int Input=obj.nextInt();
		StartTime=System.currentTimeMillis();
		while(Input!=0) {
			Collatz(arr,Input);
			for(int i=2;i<Input;++i) {
				if(contains(arr,i)!=true) {
					Collatz(arr,i);
				}
				if(MaxSequenceLength< arr[i]) {
					MaxSequenceLength=arr[i];
					Chosen=i;
				}
				
			}
			endTime=System.currentTimeMillis();
			executionTime=endTime-StartTime;
			System.out.println(Input+" "+Chosen+" "+MaxSequenceLength+" "+executionTime);
			Input=obj.nextInt();
			
		}
	}
	//calculate the Collatz sequence
	
	public static int Collatz(int []arr,int i) {
		if(contains(arr,i)) {
			return arr[i];
		}
		if(i==1) {
			arr[i]=1;
		}
		if(i%2==0) {
			arr[i]=1+Collatz(arr,i/2);
		}
		else {
			arr[i]=1+Collatz(arr,(3*i)+1);
		}
		return arr[i];
	}
	public static boolean contains(final int[] arr, final int key) {
	    return Arrays.stream(arr).anyMatch(i -> i == key);
	}
}
