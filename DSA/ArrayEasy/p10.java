//First repeating element


import java.util.*;
class Demo{
	static int firstRepeatingElement(int arr[],int n){

			int rep = Integer.MAX_VALUE;
			/*
			for(int i=0; i<n-1; i++){
				for(int j=i+1; j<n; j++){
					if(arr[i] == arr[j])
						if(rep > i)
							rep = i;
				}
			}

			if(rep < n)
				return rep+1;*/

			int max = n;
			for(int x : arr)
				if(max < x)
					max = x;

			int temp[] = new int[max+1];

			for(int i=n-1; i>=0; i--){

				if(temp[arr[i]] != 0){
					if(rep > i){
						rep = i;
				}else{
					temp[arr[i]] = arr[i];
				}
			}

			if(rep < n)
				return rep+1;
			
			return -1;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(firstRepeatingElement(arr,n));
	}
}

