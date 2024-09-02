package test;
import java.util.Scanner;
public class JavaTeste {

	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	int min = 0 ;
	while(min < 10) {
		min = min + 1;
		System.out.println(min);
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
            e.printStackTrace();

		}
	}
	tec.close();
	}

}
