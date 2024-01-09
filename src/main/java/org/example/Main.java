package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerDato=new Scanner(System.in);
        String cedulaUsuario;
        String correoUsuario;
        String nombreUsuario;
        int tipoCombo;
        int cantidadCombo;
        int PrecioUnidadCombo1=25000;
        int PrecioUnidadCombo2=32000;
        double valorIva;
        double valorDescuento;

        System.out.println("Bienvenido, Digite su documento: ");
        cedulaUsuario = leerDato.nextLine();

        System.out.println("Digite su correo: ");
        correoUsuario = leerDato.nextLine();

        System.out.print("Digite su nombre: ");
        nombreUsuario = leerDato.nextLine();

        System.out.println("MENU");
        System.out.println("*****Combo1*****");
        System.out.println("");
        System.out.println("*****Combo2*****");
        System.out.println("");


    }
}