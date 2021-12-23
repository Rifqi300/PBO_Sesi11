/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch_Exception {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int num = 0;
        boolean done = false;
        while(!done){
            try{
                System.out.print("Masukkan Angka :  ");
                num = kb.nextInt();
                done = true;
            }
            catch (InputMismatchException e){
                kb.nextLine();
                System.out.println("Tidak Valid, Masukkan Angka!");
            }
        }
        System.out.println("Angka Yang Dimasukkan : " + num);
    }
}
