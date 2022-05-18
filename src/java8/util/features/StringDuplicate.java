package java8.util.features;

public class StringDuplicate {
	
	public void remvoeDuplicateChar() {
		String str="Prasannanjali aravala";
		char[] strChar=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<strChar.length;j++) {
				if(strChar[i]==strChar[j]) {
					System.out.println(strChar[i]);
					break;
				}
			}
		}
	}
	
	public void duplicteWords() {
		String str="Aravala prasanna, prasanna. is great, prasanna is strong";
		
		String[] strArr=str.split(" ");
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=i+1;j<strArr.length;j++) {
				if(remvoeSpacilaChar(strArr[i]).equalsIgnoreCase(remvoeSpacilaChar(strArr[j]))) {
					System.out.println(remvoeSpacilaChar(strArr[i]));
					break;
				}
				
			}
		}
	}

	public String remvoeSpacilaChar(String s) {
		
		if(s.contains(".") || s.contains(",")){
			StringBuilder sb=new StringBuilder(s);
			
			int index=s.contains(".")?s.indexOf("."):s.indexOf(",");
			sb.deleteCharAt(index);
			return sb.toString();
		}
		 return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDuplicate sd=new StringDuplicate();
		sd.duplicteWords();

	}

}
