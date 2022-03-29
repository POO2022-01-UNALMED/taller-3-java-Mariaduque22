package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado){
		TV.numTV+=1;
		this.marca =marca;
		this.estado=estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTv(int numTv) {
		TV.numTV=numTv;
	}
		
	public Marca getMarca(){
		return marca;
	}

	public void setMarca(Marca marca){
		this.marca=marca;
	}
	public Control getControl(){
		return control;
	}

	public void setControl(Control cont){
		this.control=cont;
	}
	public int getPrecio(){
		return precio;
	}

	public void setPrecio(int precio){
		this.precio=precio;
	}
	public int getVolumen(){
		return volumen;
	}

    	public void setVolumen(int volumen) {
		if(volumen <= 7 && volumen >= 0 && this.estado){
        		this.volumen = volumen;
        	}
   	}
	public int getCanal(){
		return canal;
	}

	public void setCanal(int canal){
		if ((canal>=1 && canal<=120) && this.estado){
			this.canal = canal;
		}
	}

	public void turnOn(){
		this.estado=true;
	}

	public void turnOff(){
		this.estado=false;
	}

	public boolean getEstado(){
		return estado;
	}
   	public void canalUp(){
        	if (this.canal < 120 && this.canal >= 1 && this.estado){
            		this.canal += 1;
        	}
    	}

    	public void canalDown(){
        	if (this.canal <= 120 && this.canal > 1 && this.estado){
            		this.canal -= 1;
        	}
    	}

    	public void volumenUp(){
        	if(this.volumen < 7 && this.volumen >= 0 && this.estado){
            	this.volumen += 1;
        	}
   	}
    	public void volumenDown(){
        	if(this.volumen <= 7 && this.volumen > 0 && this.estado){
            	this.volumen -= 1;
        	}
    	}
}