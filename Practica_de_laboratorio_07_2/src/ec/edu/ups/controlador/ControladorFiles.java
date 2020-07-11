package ec.edu.ups.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ControladorFiles {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorFiles(String ruta) {
        this.ruta = ruta;
    }

    public String desencriptar(String texto) {
        String r = "";
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);
            if (letra.equalsIgnoreCase("g")) {
                r = r + "a";
            }
            if (letra.equalsIgnoreCase("q")) {
                r = r + "b";
            }
            if (letra.equalsIgnoreCase("ñ")) {
                r = r + "c";
            }
            if (letra.equalsIgnoreCase("l")) {
                r = r + "d";
            }
            if (letra.equalsIgnoreCase("k")) {
                r = r + "e";
            }
            if (letra.equalsIgnoreCase("i")) {
                r = r + "f";
            }
            if (letra.equalsIgnoreCase("t")) {
                r = r + "g";
            }
            if (letra.equalsIgnoreCase("x")) {
                r = r + "h";
            }
            if (letra.equalsIgnoreCase("p")) {
                r = r + "i";
            }
            if (letra.equalsIgnoreCase("r")) {
                r = r + "j";
            }
            if (letra.equalsIgnoreCase("w")) {
                r = r + "k";
            }
            if (letra.equalsIgnoreCase("u")) {
                r = r + "l";
            }
            if (letra.equalsIgnoreCase("h")) {
                r = r + "m";
            }
            if (letra.equalsIgnoreCase("a")) {
                r = r + "n";
            }
            if (letra.equalsIgnoreCase("f")) {
                r = r + "ñ";
            }
            if (letra.equalsIgnoreCase("d")) {
                r = r + "o";
            }
            if (letra.equalsIgnoreCase("v")) {
                r = r + "p";
            }
            if (letra.equalsIgnoreCase("b")) {
                r = r + "q";
            }
            if (letra.equalsIgnoreCase("z")) {
                r = r + "r";
            }
            if (letra.equalsIgnoreCase("c")) {
                r = r + "s";
            }
            if (letra.equalsIgnoreCase("m")) {
                r = r + "t";
            }
            if (letra.equalsIgnoreCase("y")) {
                r = r + "u";
            }
            if (letra.equalsIgnoreCase("e")) {
                r = r + "v";
            }
            if (letra.equalsIgnoreCase("s")) {
                r = r + "w";
            }
            if (letra.equalsIgnoreCase("o")) {
                r = r + "x";
            }
            if (letra.equalsIgnoreCase("j")) {
                r = r + "y";
            }
            if (letra.equalsIgnoreCase("n")) {
                r = r + "z";
            }
            if (letra.equalsIgnoreCase(" ")) {
                r = r + " ";
            }

            if (letra.equalsIgnoreCase("1")) {
                r = r + "0";
            }
            if (letra.equalsIgnoreCase("2")) {
                r = r + "9";
            }
            if (letra.equalsIgnoreCase("3")) {
                r = r + "8";
            }
            if (letra.equalsIgnoreCase("4")) {
                r = r + "7";
            }
            if (letra.equalsIgnoreCase("5")) {
                r = r + "6";
            }
            if (letra.equalsIgnoreCase("6")) {
                r = r + "5";
            }
            if (letra.equalsIgnoreCase("7")) {
                r = r + "4";
            }
            if (letra.equalsIgnoreCase("8")) {
                r = r + "3";
            }
            if (letra.equalsIgnoreCase("9")) {
                r = r + "2";
            }
            if (letra.equalsIgnoreCase("0")) {
                r = r + "1";
            }

        }

        return r;
    }

    public String tomarTexto() {
        String linea = "";
        try {
            System.out.println(ruta);
            FileReader archivoLectura = new FileReader(ruta);
            BufferedReader lectura = new BufferedReader(archivoLectura);
            while (linea != null) {
                linea = lectura.readLine();
                return linea;

            }
            lectura.close();

        } catch (FileNotFoundException e1) {
            System.out.println("Ruta no encontrada");
        } catch (IOException e2) {
            System.out.println("Error de lectura");
        } catch (Exception e3) {
            System.out.println("Error general");
        }
        return "";

    }

}
