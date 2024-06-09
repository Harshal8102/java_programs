
//find starting & ending position of target

import java.util.*;
import java.io.*;
class BinarySearch{

	ArrayList<Integer> searchElement(int a[],int target){

		int start = 0,end = a.length-1;

		ArrayList<Integer> al = new ArrayList<>();
		int s=-1,e=-1;
		while(start <= end){

			int mid = (start+end)/2;

			if(a[mid] == target){

				if(mid != 0 && a[mid-1] == target){
					end = mid - 1;
				}else{
					s = mid;
					al.add(s);
					break;
				}

			}else if(a[mid] < target)
				start = mid+1;
			else
				end = mid-1;
		}
		
		if(s > -1){
			for(int i=s;i<a.length; i++){

				if(a[i] == target)
					e = i;
				else
					break;
			}

			al.add(e);
		}
		return al;
	}

	public static void main(String[] args)throws IOException{

		BinarySearch obj = new BinarySearch();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter array size & elements");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];

		for(int i=0; i<n; i++)
			a[i] = Integer.parseInt(br.readLine());

		System.out.println("enter element to search");
		int s = Integer.parseInt(br.readLine());

		System.out.println(obj.searchElement(a,s));
	}
}
