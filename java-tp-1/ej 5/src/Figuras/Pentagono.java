package Figuras;

public class Pentagono implements FiguraGeometrica{
    public float lado;
    public float x;
    public float y;
    public Pentagono(float lado, float x, float y) throws IllegalArgumentException{
        setLado(lado);
        setX(x);
        setY(y);
    }
    public float getLado(){return lado;}
    public float getX(){return x;}
    public float getY(){return y;}
    public void setLado(float lado){
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado no puede ser 0 o menos.");
        }
        this.lado=lado;
    }
    public void setX(float x){
        if (x < 0) {
            throw new IllegalArgumentException("El valor de X no puede ser negativo.");
        }
        this.x=x;
    }
    public void setY(float y){
        if (x < 0) {
            throw new IllegalArgumentException("El valor de Y no puede ser negativo.");
        }
        this.y=y;
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
