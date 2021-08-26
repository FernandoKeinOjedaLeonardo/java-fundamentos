
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {

    static void holaMundo() {
        System.out.println("Hola Mundo desde Java");
    }

    static void definirVariable() {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 20;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Nos vemos";
        System.out.println(miVariableCadena);
    }

    static void inferenciaTiposEnJava() {
        //Var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hola de nuevo";
        //soutv
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }

    static void reglasParaVariable() {
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var ámiVariable = 4;  No se recomienda
        //var #miVariable = 5;  No se permite usar caracteres especiales
    }

    static void concatenacionDeCadenas() {
        //Concatenación de cadenas
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + "" + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + usuario);//Evaluación de izq a der, realiza suma
        System.out.println(usuario + i + j);//Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//uso de parentesis modifican la prioridaden la evaluacion
    }

    static void caracteresEspeciales() {
        //Caracteres especiales en Java
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }

    static void claseScanner() {
        //Clase Scanner
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado; " + titulo + " " + usuario);
    }

    static void tarea02() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }

    static void tiposPrimitivos() {
        //
        /*
            Tipos primitivos entero: byte, short, int, long
         */
        byte numeroByte = 10;
        byte numeroByte2 = (byte) 129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);//-128
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);//127
        System.out.println("");

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);//-32768
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);//32767
        System.out.println("");

        int numeroInt = (int) 10000000000L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo short: " + Integer.MIN_VALUE);//-2147483648
        System.out.println("Valor maximo short: " + Integer.MAX_VALUE);//2147483647
        System.out.println("");

    }

    static void tiposFlotantes() {
        long numeroLong = (long) 100000000000F;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);//-9223372036854775808
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);//9223372036854775807
        System.out.println("");

        float numeroFloat = (float) 100000000000000D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);//1.4E-45
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);//3.4028235E38
        System.out.println("");

        double numeroDouble = (double) 1000000000000000D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);//4.9E-324
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);//1.7976931348623157E308
    }

    public static void main(String args[]) {
        tiposPrimitivos();
        tiposFlotantes();
    }
}
