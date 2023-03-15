
class ifelse{

	public static void main(String[] args){

		int num1=42, num2 =32, num3 =42;

		if(num1>num2 && num1>num3){

			System.out.println(num1 + " is the maximum between " + num1 + "," + num2 + " & " + num3);

		}else if(num2>num3 && num2>num1){

			System.out.println(num2 + " is the maximum between " + num1 + "," + num2 + " & " + num3);

		}else if(num3>num1 && num3>num2){

			System.out.println(num3 + " is the maximum between " + num1 + "," + num2 + " & " + num3);

		}else if(num1==num2 && num1>num3){

			System.out.println(num1 + " is equal to " + num2 + " and " + num1 + " is greater than " + num3);

		}else if(num1==num3 && num1>num2){

			System.out.println(num1 + " is equal to " + num3 + " and " + num1 + " is greater than " + num2);

		}else if(num2==num3 && num2>num1){

			System.out.println(num2 + " is equal to " + num3 + " and " + num2 + " is greater than " + num1);

		}else if(num2==num1 && num2>num3){

			System.out.println(num2 + " is equal to " + num1 + " and " + num2 + " is greater than " + num3);

		}else if(num3==num1 && num3>num2){

			System.out.println(num3 + " is equal to " + num1 + " and " + num3 + " is greater than " + num2);

		}else if(num3==num2 && num3>num1){

			System.out.println(num3 + " is equal to " + num2 + " and " + num3 + " is greater than " + num1);

		}else if(num1==num2 && num2==num3){

			System.out.println("All are equal");
		}
	}
}

	


