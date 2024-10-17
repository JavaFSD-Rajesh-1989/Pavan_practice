package basic;

import java.util.Arrays;

public class Pg2 {
	public static void main(String[] args) {
		int arr[] = {6,0,3,5};
		System.out.println("Before sorting:" + Arrays.toString(arr));
		int n = arr.length;
		for(int i = 0; i<n; i++)
		{
			for(int j = i;+ j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println("After sorting:" +Arrays.toString(arr));
	}

}
