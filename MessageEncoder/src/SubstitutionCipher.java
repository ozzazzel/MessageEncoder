public class SubstitutionCipher implements MessageEncoder{
	int numberOfShift;

	public SubstitutionCipher(int shift){
		this.numberOfShift=shift;
	}
	public String encode(String plainText){
		String shiftedString="";
		for (int i=0;i<plainText.length();i++){
			shiftedString=shiftedString+shifter(plainText.charAt(i));
	// add the chars to shifted String
	}
		return shiftedString;
	}
	
	//chatAt will add selected number of shift. EX: shifts: 3 for 'a'
	//according to the vocabulary 'a'+3(letters)='d'
	private char shifter(char letter){
		return (char)(letter+this.numberOfShift);
		//shift the char
	}
}