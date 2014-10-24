
/**
* This class is interface for substitutionCipher and ShuffleCipher
* SubstitutionCipher will substract a unit 'a' and add the number of shifts selected
    then divide by 26 (letters in the alphabet) and add the remainder to the the first unit 'a'
   example: if shifts = 3 and char = a    a+(a-a+3)%26 = 1+(0+3)%26= 1+3=4   in alphabet 4 would be 'd'
* ShuffleCipher will split a given text
  if it is odd will add one to the first half to make the shuffle correctly
  after splitting the text the second half will be put within the letters of the first half
  ex:  if the message is abcdefghi, the halves are abcde and fghi. The shuffled message is afbgchdie.
*/
public interface MessageEncoder {
public String encode(String plainText);
}