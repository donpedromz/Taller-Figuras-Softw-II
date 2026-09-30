package domain;

public abstract class Figura {
    protected float dimensionar;
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    public void escalar(){
        System.out.println("Figura escalada");
    }
    public void desplazar(){
        System.out.println("Figura desplazada");
    }
    public void imprimirInformacion(){
        System.out.println("Informacion de la figura");
    }
    public Figura(float dimensionar){
        this.dimensionar = dimensionar;
    }
    public Figura(){}

    public float getDimensionar() {
        return dimensionar;
    }
}