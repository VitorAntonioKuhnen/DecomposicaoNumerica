/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decompondo;

import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author vitor.kuhnen
 */
public class Executando_Decomposicao {

    public static void main(String[] args) {
        for (int i = 1000; i < 6666; i++) {
            int numero = i;
            int n = 0;
            int proximoDigito = 0;

            while (numero > 0) {
                proximoDigito = numero % 10;
                if (proximoDigito <= 6) {
                    numero = numero / 10;
                    n = proximoDigito + n;
                }else{
                    break;
                }

            }
            if (n == 21) {
                System.out.println(i + "\n" + n + "\n \n");
            }

        }

    }
}
