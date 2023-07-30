import java.io.*;

class demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int temp[] = new int[arr1.length + arr2.length];
		System.out.println("Enter the array1 elements");
		for(int i=0; i<arr1.length; i++){
			arr1[i] = Integer.parseInt(br.readLine());
			temp[i] = arr1[i];
		}
		System.out.println("Enter array2 element");
		for(int j = 0; j<arr2.length; j++){
			arr2[j] = Integer.parseInt(br.readLine());
			temp[j+arr1.length] = arr2[j];
		}

		for(int i=0; i < temp.length-1; i++){

			if(temp[i] > temp[i+1]){
				int t = temp[i];
				temp[i] = temp[i+1];
				temp[i+1] = t;

				i = -1;
			}
		}

		for(int x : temp)
			System.out.print(x + "   ");

		int count = 0;
		for(int j=0; j<temp.length-1 ;j++){

			if(temp[j] != temp[j+1])
				count++;
		}

		count++;
		System.out.println("no. of freshed elements in union array : " + count);
		
	}
}


