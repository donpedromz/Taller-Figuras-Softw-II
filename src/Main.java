import controller.FiguraController;
import domain.*;
import exceptions.DimensionInvalidaException;

import java.util.Scanner;

public class Main {
    private static Triangulo crearTriangulo(Scanner scanner){
        System.out.println("Ingrese el tamaño del lado");
        while(true){
            try{
                float lado = scanner.nextFloat();
                return new Triangulo(lado);
            }catch (DimensionInvalidaException exception){
                System.out.println("Valor Inválido, Ingrese un nuevo valor");
                scanner.nextLine();
            }
        }
    }
    private static Cuadrado crearCuadrado(Scanner scanner) {
        System.out.println("Ingrese el tamaño del lado");
        while(true){
            try{
                float lado = scanner.nextFloat();
                return new Cuadrado(lado);
            }catch (DimensionInvalidaException exception){
                System.out.println("Valor Inválido, Ingrese un nuevo valor");
                scanner.nextLine();
            }
        }
    }
    private static Circulo crearCirculo(Scanner scanner){
        System.out.println("Ingrese el radio del circulo");
        while(true){
            try{
                float radio = scanner.nextFloat();
                return new Circulo(radio);
            }catch (DimensionInvalidaException exception){
                System.out.println("Valor Inválido, Ingrese un nuevo valor");
                scanner.nextLine();
            }
        }
    }
    private static PentagonoRegular crearPentagono(Scanner scanner){
        while(true){
            try{
                System.out.println("Ingrese el lado del pentagono");
                float lado = scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Ingrese el apotema del pentagono");
                float apotema = scanner.nextFloat();
                return new PentagonoRegular(lado, apotema);
            }catch (DimensionInvalidaException exception){
                System.out.println("Valor Inválido, Ingrese un nuevo valor");
                scanner.nextLine();
            }
        }
    }

    private static Figura crearFigura(Scanner scanner){
        while(true){
            System.out.println("Ingrese el tipo de figura que quiere crear");
            System.out.println("1. Triangulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Circulo");
            System.out.println("4. Pentagono");
            try{
                int opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        scanner.nextLine();
                        return  crearTriangulo(scanner);
                    case 2:
                        scanner.nextLine();
                        return crearCuadrado(scanner);
                    case 3:
                        scanner.nextLine();
                        return crearCirculo(scanner);
                    case 4:
                        scanner.nextLine();
                        return crearPentagono(scanner);
                        default:
                        throw new IllegalStateException("Unexpected value: " + opcion);
                }
            }catch (IllegalArgumentException exception){
                System.out.println("Valor Invalido, Por favor ingrese un ");
            }
        }
    }
    public static void main(String[] args) {
        FiguraController controller = new FiguraController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Manejo de Figuras Geometricas");
        while(true){
            System.out.println("Ingrese una opción: ");
            System.out.println("1. Crear una Figura");
            System.out.println("2. Ver todas las figuras");
            System.out.println("3. Salir del sistema: ");
            try{
                int opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        Figura figura = crearFigura(scanner);
                        controller.agregarFigura(figura);
                        break;
                    case 2:
                        controller.listarFiguras();
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema!!");
                        return;
                    default:
                        System.out.println("Opcion invalida, por favor ingrese una opcion valida");
                        scanner.nextLine();
                }
            }catch (IllegalArgumentException exception){
                System.out.println("Opcion invalida");
                scanner.nextLine();
            }

        }

    }
}
