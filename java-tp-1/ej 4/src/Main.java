import Figuras.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1=new Circulo(1);
        Circulo circulo2=new Circulo(2);
        Rectangulo rectangulo1=new Rectangulo(10,20);
        Rectangulo rectangulo2=new Rectangulo(15,40);
        Pentagono pentagono1=new Pentagono(10);

        List<FiguraGeometrica> ListaFiguras = new ArrayList<>();

        ListaFiguras.add(circulo1);
        ListaFiguras.add(circulo2);
        ListaFiguras.add(rectangulo1);
        ListaFiguras.add(rectangulo2);
        ListaFiguras.add(pentagono1);

        for(FiguraGeometrica figuraGeometrica:ListaFiguras){
            System.out.println(figuraGeometrica.toString());
        }

    }
}