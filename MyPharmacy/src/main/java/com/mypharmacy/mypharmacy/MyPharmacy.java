package com.mypharmacy.mypharmacy;

/**
 *
 * @author david
 */
public class MyPharmacy {

    public static void main(String[] args) {
        // Crear una instancia de PharmacyForm y hacerla visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacyForm().setVisible(true);
            }
        });
    }
}