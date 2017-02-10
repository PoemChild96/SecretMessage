/**
 * This is RGB class that handles the each pixel's rgb value and the encryption of each pixel. 
 * 
 * @author utakokase
 *
 */

public class RGB{
	int r;
	int g;
	int b;
	int rDigit;
	int gDigit;
	int bDigit;

	/**
	 * constructor of RGB object  
	 * @param String colorCode 
	 */
	public RGB(String colorCode){
        r = Integer.valueOf(colorCode.substring( 1, 3 ), 16);
        g = Integer.valueOf(colorCode.substring( 3, 5 ), 16);
        b = Integer.valueOf(colorCode.substring( 5, 7 ), 16);
	}
	
	/**
	 * This method encrypt a letter into a pixel 
	 * 
	 * @param int asciiCode
	 */
	public void encrypt(int asciiCode){
		bDigit = asciiCode % 10;
		asciiCode = asciiCode / 10;
		gDigit = asciiCode % 10;
		asciiCode = asciiCode / 10;
		rDigit = asciiCode % 10;
		
		r = ((r / 10) * 10) + rDigit;
		g = ((g / 10) * 10) + gDigit;
		b = ((b / 10) * 10) + bDigit;	
	}
	
	public int getR(){
		return rDigit;
	}
	
	public int getG(){
		return gDigit;
	}
		
	public int getB(){
		return bDigit;
	}
	
	public String toString(){
		return "(" + r + "," + g + "," + b + ")";
	}
}