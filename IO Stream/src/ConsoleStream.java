import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleStream {
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int number;
	String str=br.readLine();
	number=Integer.parseInt(str);
	System.out.println(number);
}
}