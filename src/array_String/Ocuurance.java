package array_String;

public class Ocuurance {
public static void ocur(String s) {
	//String s1=s.replace("\\s","");
	char[] ch=s.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		for(int j=i+1;j<=ch.length-1;j++) {
			if((ch[i]==ch[j])&&(i!=j)) {
				System.out.println("duplicate is"+" "+ch[j]);
			}
		}
	}
}
public static void main(String[] args) {
	ocur("anandismyname");
}
}
