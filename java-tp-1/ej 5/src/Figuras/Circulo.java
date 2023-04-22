package Figuras;

public class Circulo implements FiguraGeometrica{
    public float radio;
    public float x;
    public float y;
    public Circulo(float radio, float x, float y) throws IllegalArgumentException{
        setRadio(radio);
        setX(x);
        setY(y);
    }
    public float getRadio(){
        return radio;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setRadio(float radio){
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio no puede ser 0 o menos.");
        }
        this.radio=radio;
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
