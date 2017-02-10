
public class Main {
	
	static String message; 
	static RGB[] rgbArray;
	
	public static void main(String args[]) {		
		
		//creating RGB array 
		rgbArray = new RGB[5];
		
		rgbArray[0] = new RGB("#A93535");
		rgbArray[1] = new RGB("#3580A9");
		rgbArray[2] = new RGB("#31D43C");
		rgbArray[3] = new RGB("#F0F063");
		rgbArray[4] = new RGB("#F13C1C");
		
		encrypt("1");
		
		System.out.println(decrypt());
	}	
	
	/**
	 * This class enpryte the message and hide it in the photo 
	 * 
	 * @param String message 
	 */
	public static void encrypt(String message){
		
		for(int i = 0; i < message.length(); i++){
			RGB obj = rgbArray[i];	
			//System.out.println("original RGB: " + obj);
			obj.encrypt((int) message.charAt(i));
			//System.out.println("encoded RGB: " + obj);
		}
	}
	
	/**
	 * This class returns decrypted message hidden in the photo 
	 * 
	 * @return String 
	 */
	public static String decrypt(){
		String result = "";
		for(RGB colorPixel: rgbArray) {
			int onesDigit = colorPixel.getB();
			int tenthDigit = colorPixel.getG() * 10;
			int hundredthDigit = colorPixel.getR() * 100;
			
			int asciiCode = onesDigit + tenthDigit + hundredthDigit;	
			result = result + (char) asciiCode;
		}
		
		return result;
	}
}


