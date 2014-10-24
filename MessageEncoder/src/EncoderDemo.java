public class EncoderDemo {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			SubstitutionCipher aShift = new SubstitutionCipher(3);
			ShuffleCipher aShuffle = new ShuffleCipher (1);
			System.out.println("Shifted message:");
			System.out.println(aShift.encode("abcdefghi"));
			System.out.println("Shuffled message:");
			System.out.println(aShuffle.encode("abcdefghi"));
		}
	}