package domain;

/**
 * Se asume que el Triangulo es Equilátero
 */
public class Triangulo extends Figura{
    private float lado;
    @Override
    public float calcularArea(){
        return (this.lado * this.calcularAltura())/2;
    }
    @Override
    public float calcularPerimetro(){
        return lado*3;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Tipo de figura: Triangulo");
        System.out.println("Dimensiones: " + "Lado: " + this.lado);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
        System.out.println("Dimensionamiento: " + this.dimensionar);
    }
    public Triangulo(float lado){
        super();
        this.lado = lado;
        this.dimensionar = this.calcularPerimetro();
    }
    private float calcularAltura(){
        return (3*lado*lado)/4;
    }
}
