package array;

import java.util.Arrays;
import java.util.Scanner;

public class smallest_element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int element=0;element<n;element++) {
			for(int j=element+1;j<n;j++) {
				int temp;
				if(arr[element]>arr[j] ){
					temp=arr[element];
					arr[element]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
		
	}

}
