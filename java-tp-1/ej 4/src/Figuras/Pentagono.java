package Figuras;

public class Pentagono implements FiguraGeometrica{
    public float lado;
    public Pentagono(float lado){
        this.lado=lado;
    }
    public double calcularPerimetro(){
        float perimetro=this.lado*5;
        return perimetro;
    }
    public double calcularSuperficie(){
        double apotema= this.lado / (2 * Math.tan(Math.PI/5));
        double area = (calcularPerimetro() * apotema) / 2;
        return area;
    }
    public String toString() {
        return "Pentagono de superficie "+ calcularSuperficie() + ", y perimetro " + calcularPerimetro();
    }
}
