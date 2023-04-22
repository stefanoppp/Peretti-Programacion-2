package Figuras;

public class Rectangulo implements FiguraGeometrica{
    public float lado1;
    public float lado2;
    public Rectangulo(float lado1,float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public double calcularPerimetro(){
        double perimetro=this.lado1*2+this.lado2*2;
        return perimetro;
    }
    public double calcularSuperficie(){
        double area=this.lado1*this.lado2;
        return area;
    }
    @Override
    public String toString() {
        return "Rectangulo de superficie "+ calcularSuperficie() + ", y perimetro " + calcularPerimetro();
    }
}
