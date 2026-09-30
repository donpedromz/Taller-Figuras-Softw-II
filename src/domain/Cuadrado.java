package domain;
import java.math.*;
public class Cuadrado extends Figura{
    private float lado;
    @Override
    public float calcularPerimetro(){
        return this.lado*4;
    }
    @Override
    public float calcularArea(){
        return this.lado*this.lado;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Tipo de figura: Cuadrado");
        System.out.println("Dimensiones: " + "Lado: " + this.lado);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
        System.out.println("Dimensionamiento: " + this.dimensionar);
    }
    public Cuadrado(float lado){
        super();
        this.lado = lado;
        this.dimensionar = calcularDistanciaCentro();
    }
    private float calcularDistanciaCentro(){
        return  (float) (Math.sqrt(2)*this.lado)/2;
    }
}
