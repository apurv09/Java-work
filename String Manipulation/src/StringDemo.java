
public class StringDemo {

	public static void main(String [] Args) {
		
	/*	String name = "Robert";
		String word1="java";
		String word2=word1;
		/*char firstInitial= "Robert".charAt(0);
		System.out.println(firstInitial);
		char firstInitial1=name.charAt(0);
		System.out.println(name);
		System.out.println(word1);
		System.out.println(word2);
*/
/*	boolean isSame;
	isSame=word1.equals(word2);
	System.out.println(isSame);
	
	String str1= new String("Java");
	String str2= new String("Java");
	
	isSame = str1.equals(str2);
System.out.println(isSame);

	isSame= word1==word2;
	System.out.println(isSame);
	
	isSame= str1==str2;
	System.out.println(isSame);
	
		String word="java";
		char ch=Character.toUpperCase(word.charAt(0));
		word = ch + word.substring(1);
		System.out.println(word);
	*/
	String str="Welcome to zensar!";
	/*String cname=str.substring(10,14);
	System.out.println(cname);
	*/
		String word1="";
		String word2=new String();
		
		System.out.println(word1);
		System.out.println(word2);
	
	String errorMsg;
	//	System.out.println(errorMsg);
	String str3;
	str3=null;
	//System.out.println(str3.charAt(0));
	int len;
	len=str.length();
	System.out.println("no.of character"+len);
	System.out.println(str.endsWith("ar!"));
	String str4,str5;
	str4="Java is";
	//str4.concat("OOP Lang") this is annonymous object and hence cannot(modified) be assigned to any otheer object
	str5=str4.concat(" Platform independent");
	System.out.println(str5);
	
	//;
	System.out.println(str4.concat(" OOP Lang"));
	}
	
}
