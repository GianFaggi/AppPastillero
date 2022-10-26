package com.example.apppastillero.Clases;

public class Dosis {

    //usaremos este atributo como id para cada contacto

    private String Color;

    private String nombreProducto;

    private String Periodo;

    private String Proxima;

    public Dosis(String Color, String nombreProducto, String Periodo, String Proxima) {
        this.Color = Color;
        this.nombreProducto = nombreProducto;
        this.Periodo = Periodo;
        this.Proxima = Proxima;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public String getProxima() {
        return Proxima;
    }

    public void setProxima(String proxima) {
        Proxima = proxima;
    }

}