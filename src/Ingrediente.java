
public class Ingrediente {
	private String nombreIngrediente;
	private int cantidadGramos;
    private int cantidadUnidad;
    private boolean enGramos; 

	//************** SET ****************************************
	public void setNombreIngrediente(String dato){
	    	this.nombreIngrediente = dato;
		//System.out.println("\n "+nombreIngrediente);
	}
	public void setCantidadGramos(int dato){
	    	this.cantidadGramos = dato;
		//System.out.println("\n "+cantidadGramos);
	}
	public void setCantidadUnidad(int dato){
	    	this.cantidadUnidad = dato;
		//System.out.println("\n "+cantidadUnidad);
	}
	public void setEnGramos(boolean dato){
	    	this.enGramos = dato;
		//System.out.println("\n "+enGramos);
	}

 	//************** GET *****************************************
	public String getNombreIngrediente() {
	return this.nombreIngrediente;
	}
	public int getCantidadGramos() {
	return this.cantidadGramos;
	}
   	 public int getCantidadUnidad() {
		return this.cantidadUnidad;
   	}
   	 public boolean getEnGramos() {
		return this.enGramos;
   	}

}
