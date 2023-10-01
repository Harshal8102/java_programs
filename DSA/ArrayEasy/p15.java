
import java.util.*;
class Demo{

	static int nextDistinct(int arr[],int i){

		while(i < arr.length-1 && arr[i] == arr[i+1]){
			i++;
		}

		return i+1;
	}

	static void unionOfArrays(int a[],int n,int b[],int m){

		HashMap<Integer,Integer> hm = new HashMap<>();
		int i =0,j=0;

		while(i<n || j<m){

			if(i<n){
				if(hm.containsKey(a[i])){
					hm.put(a[i],hm.get(a[i])+1);
				}
				else{
					hm.put(a[i],1);
				}
				i++;
			}
			if(j < m){
				if(hm.containsKey(b[j])){
					hm.put(b[j],hm.get(b[j])+1);
				}
				else{
					hm.put(b[j],1);
				}
				j++;
			}
		}
		for(int  x : hm.keySet())
			System.out.print(x + "  ");
		System.out.println();
	
	/*nt k=0,i=0,j=0;
		int ans[] = new int[n+m];

		while(i < n && j < m){

			if(a[i] < b[j]){

				ans[k++] = a[i];
				i = nextDistinct(a,i);
			}
			else if (b[j] < a[i]){
			       ans[k++] = b[j];
		       		j = nextDistinct(b,j);
			}else{
				ans[k++] = a[i];
				i = nextDistinct(a,i);
				j = nextDistinct(b,j);
			}
		}

		while(i < a.length){
			ans[k++] = a[i];
			i = nextDistinct(a,i);
		}
		while(j < b.length){
			ans[k++] = b[j];
			j = nextDistinct(b,j);
		}

		for(int l=0; l<k; l++){
			System.out.print(ans[l] + "    ");
		}
		System.out.println();*/
	}		
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter array 2 ");
		int m = sc.nextInt();
		int arr2[] = new int[m];

		for(int i=0;i < m; i++)
			arr2[i] = sc.nextInt();

		unionOfArrays(arr,n,arr2,m);

	}
}
