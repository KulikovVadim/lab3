import java.util.Scanner;

public class regul {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Пожалуйста, введите пароль, содержащий хотя бы" +
			"одну заглавную букву, одну маленькую букву, одну цифру (допускается нижнее подчеркивание)");
	String password = sc.next();
	sc.close();
	if (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=[_]*).{8,}")) {
		System.out.println("Ваш пароль надежен и может быть использован");
	}
	else {
		System.out.println("Ваш пароль не соответствует требованиям, пожалуйста измените его.");
		}
	}
}