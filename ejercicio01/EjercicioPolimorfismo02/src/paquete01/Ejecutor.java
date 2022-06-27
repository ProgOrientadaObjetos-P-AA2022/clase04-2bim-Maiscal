/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Automovil> auto = new ArrayList<>();
        AutomovilGasolina autoG = new AutomovilGasolina();
        AutomovilDiesel autoD = new AutomovilDiesel();

        boolean bandera;
        int tipo;

        String nomP;
        String placa;

        do {
            System.out.println("Tipo de Automovil a registrar...\n"
                    + "Automovil a Gasolina      [1]\n"
                    + "Automovil a Diesel        [2]");
            tipo = Integer.parseInt(sc.nextLine());

            System.out.println("Digite el nombre del propietario: ");
            nomP = sc.nextLine();

            System.out.println("Digite la placa del automovil: ");
            placa = sc.nextLine();

            if (tipo == 1) {
                System.out.println("Ingrese el numero de galones: ");
                autoG.establecerNumGalones(sc.nextDouble());
                System.out.println("Ingrese el costo de galones: ");
                autoG.establecerCostoGalones(sc.nextDouble());

                autoG.establecerNomPro(nomP);
                autoG.establecerIva();
                autoG.establecerPlaca(placa);

                auto.add(autoG);
            } else {
                if (tipo == 2) {
                    System.out.println("Ingrese el numero del litro: ");
                    autoD.establecernumeroLimax(sc.nextDouble());
                    System.out.println("Ingrese el costo del litro: ");
                    autoD.establecercostolitro(sc.nextDouble());
                    System.out.println("Ingrese el descuento: ");
                    autoD.establecerdescuentol(sc.nextDouble());

                    autoD.establecerNomPro(nomP);
                    autoD.establecerPlaca(placa);

                    auto.add(autoD);
                }
            }
            sc.nextLine();
            System.out.println("¿Desea ingresar otro estudiante?");
            String a = sc.nextLine();
            if ("si".equals(a) || "Si".equals(a)) {
                bandera = true;
            } else {
                bandera = false;
            }
        } while (bandera = false);

        for (int i = 0; i < auto.size(); i++) {
            auto.get(i).calcularValorCancelar();

            System.out.printf("Datos del auto\n%s\n",
                     auto.get(i)
            );
        }

    }
}
