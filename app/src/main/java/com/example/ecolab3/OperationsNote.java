package com.example.ecolab3;

public class OperationsNote {
    private Integer proyecto1;
    private Integer proyecto2;
    private Integer quices;
    private Integer parcial1;
    private Integer parcial2;

    public OperationsNote(Integer proyecto1, Integer proyecto2, Integer quices, Integer parcial1, Integer parcial2){
        this.proyecto1=proyecto1;
        this.proyecto2=proyecto2;
        this.parcial1=parcial1;
        this.parcial2=parcial2;
        this.quices=quices;
    }

    public Integer getProyecto1() {
        return proyecto1;
    }

    public Integer getQuices() {
        return quices;
    }

    public Integer getParcial1() {
        return parcial1;
    }

    public Integer getParcial2() {
        return parcial2;
    }

    public void setProyecto1(Integer proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public void setProyecto2(Integer proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public void setQuices(Integer quices) {
        this.quices = quices;
    }

    public void setParcial1(Integer parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(Integer parcial2) {
        this.parcial2 = parcial2;
    }
}
