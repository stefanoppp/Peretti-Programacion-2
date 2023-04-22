package Figuras;

public class Rectangulo implements FiguraGeometrica{
    public float lado1;
    public float lado2;
    public float x;
    public float y;

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        if (lado1 <= 0) {
            throw new IllegalArgumentException("El lado no puede ser 0 o menos.");
        }
        this.lado1=lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        if (lado2 <= 0) {
            throw new IllegalArgumentException("El lado no puede ser 0 o menos.");
        }
        this.lado2=lado2;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        if (x < 0) {
            throw new IllegalArgumentException("X debe ser positiva.");
        }
        this.x=x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        if (y < 0) {
            throw new IllegalArgumentException("Y debe ser positiva.");
        }
        this.y=y;
    }

    public Rectangulo(float lado1, float lado2, float x, float y){
        setLado1(lado1);
        setLado2(lado2);
        setX(x);
        setY(y);
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
