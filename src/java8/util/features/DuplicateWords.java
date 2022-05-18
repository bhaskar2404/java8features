package java8.util.features;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateWords dwr=new DuplicateWords();

		String str="Welcome to Prasanna, she is leading testing  prasanna having 13 exp she is. good preson";
		
		String[] arryStr=str.split(" ");
		
		for(int i=0;i<arryStr.length;i++) {
			for(int j=i+1;j<arryStr.length;j++) {
				if(dwr.removeSpecialChars(arryStr[i]).equalsIgnoreCase(dwr.removeSpecialChars(arryStr[j]))) {
					System.out.println(dwr.removeSpecialChars(arryStr[i]));
				}
			}
		}
	}
	
	public String removeSpecialChars(String s) {
		
		if(s.contains(".")|| s.contains(",")) {
			StringBuffer sb= new StringBuffer(s);  
			sb.deleteCharAt(sb.length()-1);  
			return sb.toString();

		}
		
		return s;
	}

}
