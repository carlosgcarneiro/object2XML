/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2xml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caca
 */
public class Pessoa {

    static int id = 0;
    private int identidade;
    private String nome;
    private int idade;
    private float peso;
    private List<Celular> celulares;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Pessoa.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }

    public Pessoa(int idade, String nome, float peso, List<Celular> celulares) {
        id++;
        this.identidade = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        Celular.id=0;
        this.celulares = celulares;
    }

}
