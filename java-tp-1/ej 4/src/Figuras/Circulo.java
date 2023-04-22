package Figuras;

public class Circulo implements FiguraGeometrica{
    public float radio;
    public Circulo(float radio){
        this.radio=radio;
    }
    public double calcularPerimetro(){
        double perimetro=Math.PI*this.radio*2;
        return perimetro;

    }
    public double calcularSuperficie(){
        double area=this.radio*this.radio*Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circulo con radio " + radio + ", superficie " + calcularSuperficie() + ", y perimetro " + calcularPerimetro();
    }
}
