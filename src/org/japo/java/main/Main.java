/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nombres de plantas
        final String NOMBRE_PLANTA0 = "Planta Baja";
        final String NOMBRE_PLANTA1 = "Primera Planta";
        final String NOMBRE_PLANTA2 = "Segunda Planta";
        final String NOMBRE_PLANTA3 = "Tercera Planta";
        final String NOMBRE_PLANTAA = "Ático";
        final String NOMBRE_PLANTAX = "Selección incorrecta";

        // Números de plantas
        final int NUMERO_PLANTA0 = 0;
        final int NUMERO_PLANTA1 = 1;
        final int NUMERO_PLANTA2 = 2;
        final int NUMERO_PLANTA3 = 3;
        final int NUMERO_PLANTAA = 9;

        // Instancia un objeto Scanner
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        try {
            // Selección de planta
            System.out.print("Selección de planta ..: ");
            int numeroPlanta = scn.nextInt();
            scn.nextLine();

            // Análisis selección
            String nombrePlanta;
            switch (numeroPlanta) {
                case NUMERO_PLANTA0:
                    nombrePlanta = NOMBRE_PLANTA0;
                    break;
                case NUMERO_PLANTA1:
                    nombrePlanta = NOMBRE_PLANTA1;
                    break;
                case NUMERO_PLANTA2:
                    nombrePlanta = NOMBRE_PLANTA2;
                    break;
                case NUMERO_PLANTA3:
                    nombrePlanta = NOMBRE_PLANTA3;
                    break;
                case NUMERO_PLANTAA:
                    nombrePlanta = NOMBRE_PLANTAA;
                    break;
                default:
                    nombrePlanta = NOMBRE_PLANTAX;
            }

            // Mensaje selección
            System.out.printf("Planta seleccionada ..: %s\n", nombrePlanta);
        } catch (Exception e) {
            System.out.println(">>> Error de entrada");
        }
    }
}
