package domain;

import exceptions.DimensionInvalidaException;

public class PentagonoRegular extends Figura{
    private float apotema;
    private float lado;
    @Override
    public float calcularPerimetro(){
        return this.lado*5;
    }
    @Override
    public float calcularArea(){
        return (this.calcularPerimetro()*apotema)/2;
    }
    @Override
    public void imprimirInformacion(){
        System.out.println("Tipo de figura: PentagonoRegular");
        System.out.println("Dimensiones: " + "Lado: " + this.lado + "Apotema" + apotema);
        System.out.println("Area: " + this.calcularArea());
        System.out.println("Perimetro: " + this.calcularPerimetro());
        System.out.println("Dimensionamiento: " + this.dimensionar);
    }
    public PentagonoRegular(float apotema, float lado){
        super();
        if(apotema <= 0 || lado <= 0){
            throw new DimensionInvalidaException("Las dimensiones de creacion son invalidas");
        }
        this.apotema = apotema;
        this.lado = lado;
        this.dimensionar = this.calcularPerimetro();
    }
}
