//Alternate positive & negative number

import java.util.*;
class Demo{

	static void alterPosOrNeg(int a[] ,int n){

		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for(int i=0; i<n; i++){
			if(a[i] >= 0)
				pos.add(a[i]);
			else
				neg.add(a[i]);
		}
		int j=0,p=0,ne=0;
		while(j < n){
			if(p < pos.size()){
				a[j++] = pos.get(p);
				p++;
			}
			if(ne < neg.size()){
				a[j++] = neg.get(ne);
				ne++;
			}
		}	
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		alterPosOrNeg(arr,n);
		
		for(int x : arr)
			System.out.print(x + "  ");
		System.out.println();
	}
}
