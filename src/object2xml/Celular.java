/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2xml;

/**
 *
 * @author caca
 */
public class Celular {
    private String numero;
    private String operadora;
    private int idCel;
    static int id;

    public int getIdCel() {
        return idCel;
    }

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public Celular(String numero, String operadora) {
        this.numero = numero;
        this.operadora = operadora;
        id++;
        this.idCel=id;
        
    }
    
    
}
