/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

/**
 *
 * @author acer
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika dandy = new Matematika(2,7);
        
        System.out.println("Penjumlahan : "+dandy.setPenjumlahan());
        System.out.println("Pengurangan : "+dandy.setPengurangan());
        System.out.println("Perkalian   : "+dandy.setPerkalian());
        System.out.println("Pembagian   : "+dandy.setPembagian());
    }
}
