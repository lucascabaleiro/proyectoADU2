package com.example.proba.Model;

public class Anime {
    public String titulo;
    public float valoracion;
    public int popularidad;

    public Anime(String titulo, float valoracion, int popularidad) {
        this.titulo = titulo;
        this.valoracion = valoracion;
        this.popularidad = popularidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getValoracion() {
        return valoracion;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
}
