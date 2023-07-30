import java.io.*;
import java.util.*;
class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String str){
		
		super(str);
	}
}
class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String str){
		
		super(str);
	}
}

class Arraydemo{

	public static void main(String[] args){

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements");
		System.out.println("Note : 0<element<100");
		
		for(int i=0; i<arr.length; i++){

			int data = sc.nextInt();
			if(data < 0)
				throw new DataUnderFlowException("mitra data less than zero takla ahe");
			if(data > 100)
				throw new DataOverFlowException("mitra data more than 100 takla ahe");

			arr[i] = data;
		}
		for(int x : arr)
			System.out.println(x + "   ");
	}
}



