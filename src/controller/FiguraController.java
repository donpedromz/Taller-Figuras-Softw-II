package controller;

import domain.Figura;

import java.util.ArrayList;
import java.util.List;

public class  FiguraController {
    private List<Figura> figuras;
    public FiguraController(){
        this.figuras = new ArrayList<>();
    }
    public void agregarFigura(Figura figura){
        this.figuras.add(figura);
    }
    public void listarFiguras(){
        for(Figura figura : this.figuras){
            figura.imprimirInformacion();
        }
    }
    public boolean compararFiguras(Figura figura1, Figura figura2){
        return figura1.getDimensionar() == figura2.getDimensionar();
    }
}
