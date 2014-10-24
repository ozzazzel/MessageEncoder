public class ShuffleCipher implements MessageEncoder {
	int numberOfShuffle;
	//the times we do shuffle
	/**
	* @param numberOfShuffle
	*/
	public ShuffleCipher(int numberOfShuffle){
		this.numberOfShuffle=numberOfShuffle;
	}
	public String encode(String plainText){
	
		String newString=plainText;
		for (int i=0;i<numberOfShuffle;i++){
		newString=shuffler(newString);
	}
	return newString;
	//implements the MessageEncode
	}
	
	private String shuffler(String message){
		String firstHalf;
		String secondHalf;
		StringBuilder shuffledmsg = new StringBuilder();
		int halfLength;
		//If the message has odd number of letters we add one
		//because we will have a remainder if we directly use message.length()/2
		//and the length of the first half will be greater than the second
		boolean isOdd = message.length()%2 != 0;
		if (isOdd)
			halfLength=(message.length()+1)/2;
		//determine the length of first half and second half
		//using message.length()/2 if message is even
		else
			halfLength=message.length()/2;
			//split message from beginning to the half
			firstHalf=message.substring(0,halfLength);
			//split message from half to the end
			secondHalf=message.substring(halfLength, message.length());
		//when the length of message is odd, we cannot append the last
		//letter in the loop, since there is no more letter in the second
		//half when i is equal to halfLength-1
			if (isOdd){
				for (int i=0;i<(halfLength-1);i++){
				shuffledmsg=shuffledmsg.append(firstHalf.charAt(i));
				shuffledmsg=shuffledmsg.append(secondHalf.charAt(i));
				}
				shuffledmsg=shuffledmsg.append(firstHalf.charAt(halfLength-1));
	
			}
			else{
				for (int i=0;i<halfLength;i++){
				shuffledmsg=shuffledmsg.append(firstHalf.charAt(i));
				//append second half to first half instantiating the same object
				shuffledmsg=shuffledmsg.append(secondHalf.charAt(i));
			}
	}
	//build the string newMessage
	return shuffledmsg.toString();
	}
}