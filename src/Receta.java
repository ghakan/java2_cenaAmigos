import java.util.ArrayList;

public class Receta {

	private String nombreReceta;
	private ArrayList<Ingrediente> ingredientes;
    private String preparacion;

	
	//************** SET ****************************************
	public void setIngredientes(ArrayList<Ingrediente> dato){
	    	this.ingredientes = dato;
    	}
	public void setNombreReceta(String dato){
	    	this.nombreReceta = dato;
    	}
	public void setPreparacion(String dato){
	    	this.preparacion = dato;
	}

	//************** GET *****************************************
	public ArrayList<Ingrediente> getIngredientes() {
	return this.ingredientes;
	}
	public String getNombreReceta() {
	return this.nombreReceta;
	}
	public String getPreparacion() {
	return this.preparacion;
	}

}
