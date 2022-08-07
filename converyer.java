package inttoString;

public class converyer {

	public static void main(String[] args) {

		String strTime = "";
		String emptyTime = "";
		strTime = Integer.toString(185112);
		
		if (strTime.length() % 2 == 1)
			strTime = "0" + strTime ;
		
		for (int i = 0 ; i < strTime.length(); i++) {
			if ((i % 2 == 1) && (strTime.length() -1 != i ))
				 emptyTime += strTime.charAt(i) + ":";
			else emptyTime += strTime.charAt(i);
			
		}
		System.out.println(emptyTime);
	}
}
