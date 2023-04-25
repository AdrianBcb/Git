import java.util.Scanner;

public class git_práctica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escriba imprimir para ver el nombre");
		Scanner io = new Scanner(System.in);
		
		String actionString = io.nextLine();
		if (actionString.equals("imprimir")) {
			imprimir();
			System.out.println("Hasta aquí el código xd");
				}

	}
public static void imprimir() {
	System.out.println("Mi nombre es Adrian Cocom Bacab");	
	}


}
