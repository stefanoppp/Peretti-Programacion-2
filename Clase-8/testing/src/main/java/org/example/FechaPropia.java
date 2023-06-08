package org.example;
public class FechaPropia {
    private int year;
    private int month;
    private int day;
    public FechaPropia(String fecha) {
        String[] partes = fecha.split("-");
        year = Integer.parseInt(partes[0]);
        month = Integer.parseInt(partes[1]);
        day = Integer.parseInt(partes[2]);
    }
    public void sumarDias(int dias) {
        while (dias > 0) {
            int diasEnMes = diasEnMes(month, year);
            if (day + dias > diasEnMes) {
                dias -= (diasEnMes - day + 1);
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                }
                else {
                    month++;
                }
            }
            else {
                day += dias;
                break;
            }
        }
    }
    public void restarDias(int dias) {
        while (dias > 0) {
            if (day - dias < 1) {
                if (month == 1) {
                    month = 12;
                    year--;
                }
                else {
                    month--;
                }
                int diasEnMesAnterior = diasEnMes(month, year);
                dias -= day;
                day = diasEnMesAnterior;
            }
            else {
                day -= dias;
                break;
            }
        }
    }
    private int diasEnMes(int month, int year) {
        if (month == 2) {
            return esBisiesto(year) ? 29 : 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else {
            return 31;
        }
    }
    private boolean esBisiesto(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}




