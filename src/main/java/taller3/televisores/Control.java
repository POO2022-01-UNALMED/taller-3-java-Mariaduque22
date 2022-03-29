package taller3.televisores;

public class Control{
	private TV tv;

	public void turnOff(){
		tv.turnOff();
	}
	
	
	public void setCanal(int canal){
			if ((canal>=1 && canal<=120) && this.tv.getEstado()== true) {
				this.tv.setCanal(canal);
		}
	}
	
	public void turnOn(){
		tv.turnOn();
	}
	
	public void canalUp(){
		tv.canalUp();
	}

	public void canalDown(){
		tv.canalDown();
	}
	
	public void volumenUp(){
		tv.volumenUp();
	}

	public void volumenDown(){
		tv.volumenDown();
	}
	
	public void enlazar(TV televisor){
		this.tv =televisor;
		tv.control=this;
	}
	

	public TV getTv(){
		return tv;
	}

	public void setTv(TV tvv){
		this.tv=tvv;
	}
}