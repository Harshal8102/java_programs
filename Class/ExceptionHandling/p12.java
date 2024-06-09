//InterruptedException (unreported Exception)

import java.io.*;
class Demo{
	
	public static void main(String[] args){

		for(int i = 0; i< 10; i++){

			System.out.println("In loop");
			try{
				Thread.sleep(2000);

			}catch(InterruptedException obj){
				
				System.out.println("Catch 1");

			}
		}
	}
}

