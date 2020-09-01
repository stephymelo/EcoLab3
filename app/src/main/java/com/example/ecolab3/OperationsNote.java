package com.example.ecolab3;

public class OperationsNote {
    private int proyecto1;
    private int proyecto2;
    private int quices;
    private int parcial1;
    private int parcial2;
    private int ejercicios;
    private double resultado;

    public OperationsNote(int proyecto1, int proyecto2, int quices, int parcial1, int parcial2,int ejercicios){
        this.proyecto1=proyecto1;
        this.proyecto2=proyecto2;
        this.parcial1=parcial1;
        this.parcial2=parcial2;
        this.quices=quices;
        this.ejercicios=ejercicios;

    }

    public void calcularNotaFinal(){
       resultado=(parcial1*0.15)+(parcial2*0.15)+(quices*0.15)+(proyecto1*0.25)+(proyecto2*0.25)+(ejercicios*0.05);

    }

    public int getProyecto1() {
        return proyecto1;
    }

    public int getProyecto2() {
        return proyecto2;
    }

    public int getQuices() {
        return quices;
    }

    public int getParcial1() {
        return parcial1;
    }

    public int getParcial2() {
        return parcial2;
    }

    public int getEjercicios() {
        return ejercicios;
    }

    public double getResultado() {
        return resultado;
    }

    public void setProyecto1(int proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public void setProyecto2(int proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public void setQuices(int quices) {
        this.quices = quices;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public void setEjercicios(int ejercicios) {
        this.ejercicios = ejercicios;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
