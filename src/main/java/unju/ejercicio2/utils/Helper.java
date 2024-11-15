package unju.ejercicio2.utils;

import java.util.Scanner;

public class Helper {
    public static float validarFloat(Scanner sc, String mensaje) {
        float numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.println(mensaje);
                valorIngresado = sc.nextLine();
                numero = Float.parseFloat(valorIngresado);
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!!!");
            }
        }
        return numero;
    }

    public static int validarEntero(Scanner sc, String mensaje) {
        int numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.print(mensaje);
                valorIngresado = sc.nextLine();
                numero = Integer.parseInt(valorIngresado);
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!!!");
            }
        }
        return numero;
    }

    public static int validarEntero4Cifras(Scanner sc, String mensaje) {
        int numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.print(mensaje);
                valorIngresado = sc.nextLine();
                numero = Integer.parseInt(valorIngresado);
                if (numero > 999 && numero < 10000) {
                    break;
                } else {
                    System.out.println("Ingrese un numero de 4 cifras!!!");
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!!!");
            }
        }
        return numero;
    }

    public static int validarOpciones(Scanner sc, String mensaje, int cantidad) {
        int numero;
        String valorIngresado;
        while (true) {
            try {
                System.out.print(mensaje);
                valorIngresado = sc.nextLine();
                numero = Integer.parseInt(valorIngresado);
                if (numero <= cantidad && cantidad >= 0) {
                    break;
                } else {
                    System.out.println("\nIngrese una opcion valida!!!");
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!!!");
            }
        }
        return numero;
    }

    /**
     * El metodo repetira el bucle hasta que el usuario ingrese una cadena distinta
     * de null
     *
     * @param sc
     * @param mensaje
     * @return Retorna una cadena de texto distinto de null
     */
    public static String validarString(Scanner sc, String mensaje) {
        String cadena = "";
        while (true) {
            System.out.print(mensaje);
            cadena = sc.nextLine();
            if (cadena.length() > 0) {
                break;
            } else {
                System.out.println("Ingrese una cadena valida!!!");
            }
        }
        return cadena;
    }

    /**
     * Valida que la entrada por teclado sea un sola letra entre la A-Z y a-z
     *
     * @param sc
     * @param mensaje
     * @return Retorna una sola letra
     */
    public static String validarLetra(Scanner sc, String mensaje) {
        String cadena = "";
        while (true) {
            System.out.print(mensaje);
            cadena = sc.next();
            if (cadena.length() == 1) {
                char caracter = cadena.charAt(0);
                if (Character.isLetter(caracter)) {
                    break;
                } else {
                    System.out.println("Ingrese una letra valida!!!");
                }
            } else {
                System.out.println("Ingrese solo un caracter");
            }
        }
        return cadena;
    }

    // * Formato de Fecha -> 2024-09-06 -> YYYY-MM-DD
    @SuppressWarnings("unused")
    public static String validarFecha(Scanner sc, String mensaje) {
        String cadena = "";
        while (true) {
            System.out.print(mensaje);
            cadena = sc.nextLine();
            if (cadena.length() > 0) {
                String[] fecha = cadena.split("-");
                try {
                    int anio = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int dia = Integer.parseInt(fecha[2]);
                    break;
                } catch (Exception e) {
                    System.out.println("Ingrese una fecha valida!!!");
                }
            } else {
                System.out.println("No se permite fecha vacia");
            }
        }
        return cadena;
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

