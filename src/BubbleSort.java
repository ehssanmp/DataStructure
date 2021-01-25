import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long StartTime, endTime, executionTime;
		Scanner obj= new Scanner(System.in);
		for(int i=0 ; i<4;++i) {
			System.out.println("Enter an Input size: ");
			int n=obj.nextInt();
			StartTime=System.currentTimeMillis();
			int [] arr= new int[n];
			for (int j=0;j<n;++j) {
				arr[j]=(int)(Math.random()*(n)+1);	//finding a random number between 1 and n
			}
			int [] List=sort(arr);
			endTime=System.currentTimeMillis();
			executionTime=endTime-StartTime;
			System.out.println("the execution time: "+(int)executionTime+"\n");
			
		}
	}
	public static int[] sort(int [] arr) {
		for (int i=0;i<arr.length-1;++i) {
			//Perform the kth pass
			for(int j=0; j<arr.length-1-i;++j) {
				if(arr[j]>arr[j+1]) {
					//Swapping the arr[j] with arr[j+1]
					int k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
		}
		return arr;
	}

}
