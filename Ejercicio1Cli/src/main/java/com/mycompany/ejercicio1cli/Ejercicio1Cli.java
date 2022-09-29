/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio1cli;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Crea un proyecto maven en NetBeans. Añade mediante maven la dependencia
 * Apache Commons CLI
 *
 * Crea un programa por línea de comandos usando apache commons cli que al
 * introducir la opción booleana -w (o --hello-world) imprima “Hola mundo”
 *
 * Queremos que el mundo pueda ser bonito o cruel (que se imprima por pantalla
 * “hola mundo bonito” o “hola mundo cruel”. Para ello, define un grupo que
 * incluya a -n (--nice) y - c (--cruel). Prueba a incluir ambas opciones al
 * lanzar el programa y comprueba lo que ocurre.
 *
 * La opción -h (--help) se suele usar para imprimir la ayuda. Añádela a tu
 * programa para mostrar por pantalla cómo usarlo
 *
 * Añade una opción con argumento numérico -y (--years) que imprima, siendo n el
 * número de años indicado, “tras n años de vida”
 *
 * OPCIONAL: Define una clase validador que compruebe que n es >= 0 y <= 122
 */
public class Ejercicio1Cli {

    public static void main(String[] args) {
        //Definicion de la clase Opcion
        Options opciones = new Options();
        OptionGroup grupo = new OptionGroup();

        //Definimos opciones
        opciones.addOption("w", "hello-world", false, "Hola mundo");
        opciones.addOption("h", "help", false, "ayuda");
        opciones.addOption("y", "years", true, "Tras años de vida");
        grupo.addOption(new Option("n", "nice", false, "Hola mundo bonito"));
        grupo.addOption(new Option("c", "cruel", false, "Hola mundo cruel"));
        opciones.addOptionGroup(grupo);

        //Parseamos entradas
        try {
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(opciones, args);
                    
            
            // Si está la opcion de ayuda, la imprimimos y salimos. 
            if (cmd.hasOption("h")) {
                System.out.println("ayuda");
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("h", opciones);
              // si no preguntamos por las demas opciones
            } else {

                if (cmd.hasOption("w")) {
                    System.out.println("Hola mundo");
                }
                if (cmd.hasOption("n")) {
                    System.out.println("Hola mundo bonito");
                }
                if (cmd.hasOption("c")) {
                    System.out.println("Hola mundo cruel");
                }
                if (cmd.hasOption("y")) {
                    String y = cmd.getOptionValue("y");
                                
                    System.out.println("tras: " + y + " años de vida");
                }

            }

        } catch (ParseException ex) {
            Logger.getLogger(Ejercicio1Cli.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
