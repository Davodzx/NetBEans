/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mypharmacy.mypharmacy;

/**
 *
 * @author david
 */
public class Validations {
    
    public static String Validador(String nombreMedicamento, String tipoMedicamento, String cantidad, String distribuidor, String sucursal, int indexMedicamento){
        StringBuilder errorMessage = new StringBuilder();
    
        if (nombreMedicamento.trim().isEmpty()) {
            errorMessage.append("El nombre del medicamento es obligatorio.\n");
        }

        if (tipoMedicamento == null || indexMedicamento == 0) {
            errorMessage.append("El tipo de medicamento es obligatorio.\n");
        }
    
        if (cantidad.trim().isEmpty()  ) {
            errorMessage.append("La cantidad del producto es obligatoria.\n");
        }
        else{
            try {
                Integer.parseInt(cantidad);
                if(Integer.parseInt(cantidad) < 0){
                    errorMessage.append("La cantidad del producto debe ser un numero positivo.\n");
                }
            }catch (NumberFormatException e) {
                errorMessage.append("La cantidad del producto debe ser un número.\n");
            }
        }

        if (distribuidor.isEmpty()) {
            errorMessage.append("Debe seleccionar un distribuidor.\n");
        }

        if (sucursal.isEmpty()) {
            errorMessage.append("Debe seleccionar una sucursal.\n");
        }

        return errorMessage.toString();
    }
}
    
   
        
    
    

    

