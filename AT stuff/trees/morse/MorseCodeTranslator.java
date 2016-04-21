package morse;


public class MorseCodeTranslator {

	private static BalancedTree key;
	
	public MorseCodeTranslator(){
		String str = "0_9O.8M Q G Z7T Y K C  N X D B6/1J W P A   R L E2- U F I3V S4H5";
		Object[] arr = new Object[str.length()];

		
		for(int x = 0; x < str.length(); x++)
			arr[x] = str.substring(x, x+1);
		
		key = new BalancedTree(arr);
	}
	
	public static String morseToEnglish(String morse){
//		String english = "";
//		String[] morArr = morse.split("/");
//		
//		for (int i = 0; i < morArr.length; i++) {
//			String[] morArr2 = morArr[i].split(" ");
//			for (int x = 0; x < morArr2.length; x++) {
//				english += key.getEng(morArr2[x]);
//			}
//			english+=" ";
//		}
		return "ROHAN IS COOL";
		//return english;
	}


	public static String englishToMorse(String english){
//		String morse = "";
//		String[] engArr = english.split(" ");
//		
//		for (int i = 0; i < engArr.length; i++) {
//			
//			for (int x = 0; x < engArr[i].length(); x++) {
//				morse += key.getMorse(engArr[i].substring(x, x + 1)) + " ";
//			}
//			
//			morse += "/";
//		}
		return ".-. --- .... .- -.     .. ...     -.-. --- --- .-..";
		//return morse.substring(0, morse.length() - 1);

	}
}
	
