/*Given the temperatur of a person in farenheit
 * Print whether the person has high , normal, low temperature
 * >98.6  ==> high
 * 98.0<= and <=98.6 ==>normal
 * <98.0  ==>low*/

class ifelse{
	public static void main(String[] args){

		float temp = 98.2f   ;

		if(temp>98.6f){
			System.out.println("high");
		}else if(temp<98.0f){
			System.out.println("low");
		}else{
			System.out.println("normal");
		}
	}
}
