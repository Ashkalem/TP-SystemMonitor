/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitor;

/**
 *
 * @author Alumno
 */
public class Testing {
        public static void main(String[] Args){
            Monitor m = new MonitorWindows();
            
            System.out.println("familia: "+m.getMicro().getFamilia());
            System.out.println("modelo: "+m.getMicro().getModelo());
            System.out.println("fabricante: "+m.getMicro().getFabricante());
            System.out.println("Nombre: "+m.getMicro().getNombre());
            System.out.println("Nucleos: "+m.getMicro().getNucleosFisicos());
            System.out.println("Hilos: "+m.getMicro().getNucleosLogicos());
            //Tester de Rodrigo soria. -testeando
            //TesteandoMemoria
            System.out.println("Memoria RAM total: " + m.getMemoria().getMemFisicaTotal());
            System.out.println("Memoria RAM usada: " + m.getMemoria().getMemFisicaUsada());
            System.out.println("Memoria RAM dispo: " + m.getMemoria().getMemFisicaDisponible());
            System.out.println("Memoria de intercambio total: " + m.getMemoria().getMemIntercambioTotal());
            System.out.println("Memoria de intercambio usada: " + m.getMemoria().getMemIntercambioUsada());
            System.out.println("Memoria de intercambio dispo: "+ + m.getMemoria().getMemIntercambioDisponible());
            
        }
}