
//SERIALIZATION

import java.io.*;
class Player implements Serializable{
	
	int jerNo = 0;
	String pName;

	Player(int jerNo, String pName){

		this.jerNo = jerNo;
		this.pName = pName;
	}
}
class SerializationDemo{

	public static void main(String[] args)throws IOException{

		Player obj1 = new Player(1,"KLRahul");
		Player obj2 = new Player(18,"VKohli");

		FileOutputStream fos = new FileOutputStream("PlayerData.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		System.out.println(obj1);
		System.out.println(obj2);

		oos.close();
		fos.close();
	}
}
