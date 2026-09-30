package domain;
public class Circulo extends Figura{
    private static final float PI = 3.1416f;
    private float radio;
    @Override
    public float calcularArea(){
        return PI*(radio*radio);
    }
    @Override
    public float calcularPerimetro(){
        return 2*PI*radio;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Tipo de figura: Circulo");
        System.out.println("Dimensiones: " + "Lado: " + this.radio);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
        System.out.println("Dimensionamiento: " + this.dimensionar);
    }
    public Circulo(float radio){
        super();
        this.radio = radio;
        this.dimensionar = calcularArea();
    }
}
