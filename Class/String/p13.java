import java.util.*;

class demo{

	static double printShortestPath(String path){

		int x = 0;
		int y = 0;

		for(int i=0; i<path.length(); i++){
			
			//south
			if(path.charAt(i) == 'S'){
				y--;
			}

			//north
			else if(path.charAt(i) == 'N'){
				y++;
			}
			//west
			else if(path.charAt(i) == 'W'){
				x--;
			}
			//east
			else{
				x++;
			}
		}

		int X2 = x*x;
		int Y2 = y*y;

		return Math.sqrt(X2+Y2);       //return type is double
	}
	public static void main(String[] args){

		String path = "WNEENESENNN";	

		System.out.println(printShortestPath(path));
	}
}
