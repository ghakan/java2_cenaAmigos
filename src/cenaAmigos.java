import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class cenaAmigos {
	public static void main (String args[]) throws IOException {

		ArrayList<Receta> recetas = new ArrayList<Receta>();
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		System.out.println("\n ¿Cuantas recetas quieres introducir?");
		Scanner sc = new Scanner(System.in);
		int cantdRecetas = sc.nextInt();
			for(int i=0; i<cantdRecetas; i++){
				Receta receta = new Receta();
				System.out.println("\n ¿Cual es el nombre de la receta numero "+(i+1)+"?");
				receta.setNombreReceta(sc.next());

				System.out.println("\n ¿Cuantos ingredientes tiene?");
				int cantIngredientes = sc.nextInt();
				for(int k=0; k<cantIngredientes; k++){
					Ingrediente ingrediente = new Ingrediente();
					System.out.println("\n ¿Dime el nombre del ingrediente numero "+(k+1)+"?");
					String nomIngredi = sc.next();
					ingrediente.setNombreIngrediente(nomIngredi);
					char gramos;	

					do{
						System.out.println("\n ¿"+nomIngredi+" se pesa en gramos 'S/N?'");
						gramos = sc.next().charAt(0);
							if (gramos == 's'){
								ingrediente.setEnGramos(true);
								System.out.println("\n ¿Cuantos gramos de "+nomIngredi+" ?");
								ingrediente.setCantidadGramos(sc.nextInt());
							}
							else if (gramos == 'n'){
								ingrediente.setEnGramos(false);
								System.out.println("\n ¿Que cantidad de unidad tiene "+nomIngredi+" ?");
								ingrediente.setCantidadUnidad(sc.nextInt());
							}
							else{
								System.out.println("Lo siento no has introducido ni 'S' ni 'N'");
							}

					}while((gramos !='s') && (gramos !='n'));
				}		
			}







	}
}