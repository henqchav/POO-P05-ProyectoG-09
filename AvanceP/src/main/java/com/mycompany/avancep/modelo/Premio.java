/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avancep.modelo;

/**
 *
 * @author linco
 */
public class Premio {
    private String nivel;//1ro, 2do o 3ro 
    private float monto;
    private String adicional;//son productos de comidas

    public Premio(String nivel, float monto, String adicional) {
        this.nivel = nivel;
        this.monto = monto;
        this.adicional = adicional;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return nivel + " del Premio:  monto=" + monto + ", adicional=" + adicional;
    }


    
    
}
