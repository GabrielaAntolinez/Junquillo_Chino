/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junquillo_chino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Angie Gabriela Antolinez
 */
public class Junquillo_Chino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada = " ";
        double[] diametro;
        List<Double> diametrolist = new ArrayList<>();
        double[] porcion;
        List<Double> porcionlist = new ArrayList<>();
        List<Double> soluciones = new ArrayList<>();
        
        while (!entrada.equals("0 0")) {
            Scanner leer = new Scanner(System.in);
            entrada = leer.nextLine();
            String[] result = entrada.split(" ");
            diametrolist.add(Double.parseDouble(result[0]));
            porcionlist.add(Double.parseDouble(result[1]));
        }
        soluciones = solucionar(diametrolist, porcionlist, soluciones);
                for (int i = 0; i < soluciones.size(); i++) {
                    System.out.println(soluciones.get(i));
        }
    }

    public static List solucionar(List<Double> diametrolist, List<Double> porcionlist, List<Double> soluciones) {
        for (int i = 0; i < diametrolist.size()-1; i++) {
            double numero1 = (0.25 * (Math.pow((double) diametrolist.get(i), 2))) / (0.02 * porcionlist.get(i));
            double numero2 = (0.0001 * (porcionlist.get(i)) / (0.02));
            soluciones.add(-1*(Math.round((numero2 - numero1) * 10.0)/10.0));
        }
        return soluciones;
    }
}
