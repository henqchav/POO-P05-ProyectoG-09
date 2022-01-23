/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javafx.util.StringConverter;
import modelo.Duenio;

/**
 *
 * @author Henry
 */
public class DuenioConverter extends StringConverter<Duenio>{
    @Override
            public String toString(Duenio duenio){
                return duenio == null ? null : duenio.getId()+ "-" + duenio.getNombre() + "-" + duenio.getApellido();
            }

            @Override
            public Duenio fromString(String string) {
                return null;
            }
    
}
