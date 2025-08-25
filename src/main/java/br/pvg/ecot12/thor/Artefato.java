package br.pvg.ecot12.thor;

import java.util.ArrayList;
import java.util.List;

public class Artefato {
    private String nome;
    private String objeto;
    private String estado;
    private String material;
    private List<Poder> poderes = new ArrayList<Poder>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getObjeto() {
        return objeto;
    }
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public List<Poder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }
}
