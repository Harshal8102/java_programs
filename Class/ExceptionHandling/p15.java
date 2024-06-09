//Parent = Throwable
//child = StackOverflowError

class StackDemo{

	static void fun(int x){
		
		try{
			fun(++x);
		}catch(StackOverflowError obj){
			
			System.out.println(x);
		}
	}

	public static void main(String[] args){
		fun(1);
		
	}
}
