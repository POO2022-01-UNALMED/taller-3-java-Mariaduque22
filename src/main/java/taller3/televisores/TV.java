package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
    	TV.numTV += 1;
        this.marca = marca;
        this.estado = estado;
        
    }

    public Marca getMarca() {
        return marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getVolumen() {
        return volumen;
    }
    
    public void setVolumen(int volumen) {
        if(volumen <= 7 && volumen >= 0 && this.estado){
            this.volumen = volumen;
        }
    }


    public Control getControl() {
        return control;
    }
    
    public void setControl(Control control) {
        this.control = control;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if (canal <= 120 && canal >= 1 && this.estado){
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public boolean getEstado() {
        return estado;
    }


    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }
    public static int getNumTV() {
        return numTV;
    }



    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
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