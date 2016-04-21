package morse;

public class MorseTester {

public static void main(String[] args) {		
		
		String str= "ROHAN IS COOL";
		System.out.println("String to translate to Morse: "+str);
		String morse= MorseCodeTranslator.englishToMorse(str);
		System.out.println("Morse: "+morse);
		System.out.println("Translated back: "+MorseCodeTranslator.morseToEnglish(morse));

	}

}
