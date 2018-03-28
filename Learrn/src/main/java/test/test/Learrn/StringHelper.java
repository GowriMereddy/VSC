package test.test.Learrn;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		try {
		
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
		
		}catch (NullPointerException e) {
			throw new NullPointerException ("Null Values Passed to " + this.getClass().getSimpleName().toString() + "\n");
			
		}
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}

}