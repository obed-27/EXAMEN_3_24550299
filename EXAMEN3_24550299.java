/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen3_24550299;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EXAMEN3_24550299 {

    public static double caliM=0, calim=100;
    public static void main(String[] args) {
        double[] califa=new double[100];
        Scanner mtr = new Scanner(System.in);
        int alumnos , MoI=0, a=0;
        double caliP=0, cali;
        System.out.print("cuantos alumnos son:  ");
        alumnos=mtr.nextInt();
        for (int i = 1; i <= alumnos; i++) {
            System.out.print("inserta la calificacion del alumno: "+i+"  ");
            cali=mtr.nextInt();
            califa[a]=cali;
            a=a+1;
            caliP=caliP+cali;
            Max(cali);
            Min(cali);
        }
        caliP=promedio(caliP,alumnos,califa);
        MoI=MoI(caliP,califa);
        System.out.println("El promedio del salon es: " + caliP);
        System.out.println("calificacions iguales o mayores al promedio: "+MoI);
        System.out.println("La calificacion mas alta es: " + caliM);
        System.out.println("La calificacion mas baja es: " + calim);
    }
    public static double promedio(double caliP,double alumnos,double[]califa){
       double promedio=0;
       for (int i = 0; i < califa.length; i++) {
            if (califa[i]>0) {
                promedio=promedio+califa[i];    
            }
        }
       promedio=promedio/alumnos;
        return promedio; 
    }
    public static void Max(double NC){
        if(caliM<=NC){
            caliM=NC;
        }
    }
    public static void Min(double NC){
        if(calim>=NC){
            calim=NC;
        }
    }
    public static int MoI(double caliP, double[]califa){
        int MoI=0;
        for (int i = 0; i < califa.length; i++) {
            if (califa[i]>=caliP) {
            MoI++;
            }
        }
        return MoI;
    }
}
