/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Common.Validate;
import Controller.Controller;
import java.util.Scanner;

/**
 *
 * @author Acer Nitro5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View v = new View();
        Controller c = new Controller();
        Validate m = new Validate();

        while (true) {
            v.menu();
            int choice = m.inputChoice();
            switch (choice) {
                case 1:
                    v.addMatrix();
                    break;
                case 2:
                    v.subtractionMatrix();
                    break;
                case 3:
                    v.multipleMatrix();
                    break;
                case 4:
                    return;
            }
        }
    }

}
