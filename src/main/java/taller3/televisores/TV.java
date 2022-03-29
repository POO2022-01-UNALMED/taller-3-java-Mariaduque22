package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado){
		TV.numTV++;
		this.marca =marca;
		this.estado=estado;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public static void setNumTv(int numTv) {
		TV.numTV=numTv;
	}
		
	public Marca getMarca(){
		return marca;
	}

	public void setMarca(Marca marc){
		this.marca=marc;
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

	public void setPrecio(int prec){
		this.precio=prec;
	}
	public int getVolumen(){
		return volumen;
	}

	public void setVolumen(int vol){
		this.volumen=vol;
	}
	public int getCanal(){
		return canal;
	}

	public void setCanal(int canal){
			if ((canal>=1 && canal<=120) && this.estado == true){
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
		if (this.estado && canal<120){
			canal=canal+1;
		}
	}

	public void canalDown(){
		if (this.estado && canal>1){
			canal--;
		}
	}

	public void volumenUp(){
		if (this.estado && this.volumen<7){
			volumen++;
		}
	}

	public void volumenDown(){
		if (this.estado && this.volumen>0){
			volumen--;
		}
	}
}