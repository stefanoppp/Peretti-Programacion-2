import Figuras.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1=new Circulo(1,1,2);
        Circulo circulo2=new Circulo(2,2,5);
        Rectangulo rectangulo1=new Rectangulo(10,20,2,1);
        Rectangulo rectangulo2=new Rectangulo(15,40,2,2);
        Pentagono pentagono1=new Pentagono(10,1,5);

        List<FiguraGeometrica> ListaFiguras = new ArrayList<>();

        ListaFiguras.add(circulo1);
        ListaFiguras.add(circulo2);
        ListaFiguras.add(rectangulo1);
        ListaFiguras.add(rectangulo2);
        ListaFiguras.add(pentagono1);

        for(FiguraGeometrica figuraGeometrica:ListaFiguras){
            System.out.println(figuraGeometrica.toString());
        }
        Circulo circulo3=new Circulo(-12,2,5);
        Rectangulo rectangulo3=new Rectangulo(10,-20,2,1);
    }
}