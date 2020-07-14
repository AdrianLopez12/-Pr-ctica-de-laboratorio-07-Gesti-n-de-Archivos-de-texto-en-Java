package ec.edu.ups.controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ControladorFiles {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorFiles(String ruta) {
        this.ruta = ruta;
    }

    public String encriptar(String texto) {
        String r = "";
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            String letra = texto.substring(i, i + 1);
            if (letra.equalsIgnoreCase("a")) {
                r = r + "g";
            }
            if (letra.equalsIgnoreCase("b")) {
                r = r + "q";
            }
            if (letra.equalsIgnoreCase("c")) {
                r = r + "ñ";
            }
            if (letra.equalsIgnoreCase("d")) {
                r = r + "l";
            }
            if (letra.equalsIgnoreCase("e")) {
                r = r + "k";
            }
            if (letra.equalsIgnoreCase("f")) {
                r = r + "i";
            }
            if (letra.equalsIgnoreCase("g")) {
                r = r + "t";
            }
            if (letra.equalsIgnoreCase("h")) {
                r = r + "x";
            }
            if (letra.equalsIgnoreCase("i")) {
                r = r + "p";
            }
            if (letra.equalsIgnoreCase("j")) {
                r = r + "r";
            }
            if (letra.equalsIgnoreCase("k")) {
                r = r + "w";
            }
            if (letra.equalsIgnoreCase("l")) {
                r = r + "u";
            }
            if (letra.equalsIgnoreCase("m")) {
                r = r + "h";
            }
            if (letra.equalsIgnoreCase("n")) {
                r = r + "a";
            }
            if (letra.equalsIgnoreCase("ñ")) {
                r = r + "f";
            }
            if (letra.equalsIgnoreCase("o")) {
                r = r + "d";
            }
            if (letra.equalsIgnoreCase("p")) {
                r = r + "v";
            }
            if (letra.equalsIgnoreCase("q")) {
                r = r + "b";
            }
            if (letra.equalsIgnoreCase("r")) {
                r = r + "z";
            }
            if (letra.equalsIgnoreCase("s")) {
                r = r + "c";
            }
            if (letra.equalsIgnoreCase("t")) {
                r = r + "m";
            }
            if (letra.equalsIgnoreCase("u")) {
                r = r + "y";
            }
            if (letra.equalsIgnoreCase("v")) {
                r = r + "e";
            }
            if (letra.equalsIgnoreCase("w")) {
                r = r + "s";
            }
            if (letra.equalsIgnoreCase("x")) {
                r = r + "o";
            }
            if (letra.equalsIgnoreCase("y")) {
                r = r + "j";
            }
            if (letra.equalsIgnoreCase("z")) {
                r = r + "n";
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

    public void generarArchivo(String texto, String nombre) {

        try {
            // String ruta="E:/asdf/archivo.txt";
            FileWriter archivoEscritura = new FileWriter(ruta + "/" + nombre, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.append(texto);
            escritura.close();
            archivoEscritura.close();
        } catch (FileNotFoundException el) {
            System.out.println("archivo no encontrado");
        } catch (IOException e2) {
            System.out.println("Error de escritura");
        } catch (Exception e3) {
            System.out.println("Error general");
        }

    }

    public boolean existeArchivo(String nombre) {
        archivo = new File(ruta + "/" + nombre);
        System.out.println(archivo);
        if (archivo.exists() == true) {
            return true;
        }

        return false;
    }

}
