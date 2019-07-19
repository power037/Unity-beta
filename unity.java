/**
*  unity - v-1.0
* 
*  @ver : 1.0
*  @fecha_mod : 
*  @By : SirRiuz
*/

/**
 *  [!] Este script es software libre. Pueden modificarlo,
 *  crear nuevas variantes y nuevas verciones, pero 
 *  por favor recuerden y dejen los creditos a mi
 *  SirRiuz :D
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class unity {

    private static int input;
    private static int x = 1;

    private static String fileName;
    private static String fileRuta;
    private static String commands;

    private static unity un = new unity();
    private static LocalTime myObj = LocalTime.now();
    private static String random_num;
    private static Scanner in = new Scanner(System.in);
    private static Random numeroR = new Random();

    private static boolean num_ran = false;

    public static void ruta() {
        System.out.print("[unity] por favor ingrese la ruta en la que se va a guardar el archivo : ");
        fileRuta = in.next();
    }

    public static void ramdom_num2() {
        System.out.print("[unity] quieres usar numeros randoms en las convinaciones ? [S/N]: ");
        random_num = in.next();

        System.out.print("\n[!] se generara una llave con numeros randoms\n");
    }

    public static void CreateFile() {
        System.out.print("\n[unity] por favor ingrese el nombre que le va a dar a su archivo : ");
        fileName = in.nextLine();
    }

    public static void shut() {
        System.out.print("\n[unity] ingrese el numero de palabras claves que vas a utilizar : ");

        try {
            input = in.nextInt();
        }

        catch (Exception e) {
            System.err.println("\n[!] Algo ha salido mal ...");
            System.err.println("[!] Recuerda que el texto no tiene que tener espacios");
            System.exit(0);
        }

        /**
         * En este arrayList se guardaran todas las palabras claves que introduscas en l
         * avariable (input_text). Puedes introducir el N cantidad de palabras claves
         */

        ArrayList<String> arrayKey = new ArrayList<String>();   /*El array root */

        System.out.println(" ");

        while (x <= input) {
            System.out.print(x + ") :: ");
            String input_text = in.next();
            arrayKey.add(input_text);
            x++;
        }

        String neutral;
        un.ini();
        System.out.println("[!] se creara un carchivo de texto con el nombre " + "'" + fileName + "'"
                + " y se guardara en la ruta " + "'" + fileRuta + "'" + "\n palabras claves que se van a utilizar "
                + "'" + input + "'" + "\n");

        for (int i = 0; i < input; i++) {
            System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(i) + "'");
        }

        if (num_ran == true) {

            for (int z = 0; z < input; z++) {
                System.out.println("Es trueee");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(z)
                        + numeroR.nextInt() + "') copia 1");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(z)
                        + numeroR.nextInt() + "') copia 2");
            }
        }

        for (int j = 0; j < input; j++) {
            System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(j)
                    + arrayKey.get(j) + "'");
        }

        while (input > 0) {

            input--;
            for (int t = 0; t < input; t++) {
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(input)
                        + arrayKey.get(t) + "'");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(t)
                        + arrayKey.get(input) + "'");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(input)
                        + numeroR.nextInt() + "'");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + arrayKey.get(t)
                        + numeroR.nextInt() + "'");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + numeroR.nextInt()
                        + arrayKey.get(t) + "'");
                System.out.println("[ " + myObj + " ]" + " [ INFO ]" + " se ha generado -> '" + numeroR.nextInt()
                        + arrayKey.get(input) + "'");
            }
        }
    }

    /**
     * En este apartado de codigo se generan los diccionarios en formato .txt
     */

    public static void createFile() throws IOException {
        try {

            File ruta_1 = new File(fileRuta + "\\" + fileName + ".txt");

            if (ruta_1.exists()) {
                System.out
                        .print("\n" + "[!] se ha creado el archivo " + "" + fileRuta + "\\" + fileName + ".txt" + "\n");
            } else {
                System.err.println(
                        "\n[!] error no se ha podido crear el archivo '" + fileRuta + "\\" + fileName + ".txt" + "'\n");
            }

        } catch (Exception e) {
            System.err.println("\n[!] error no se ha podido crear el archivo '" + fileName + "'");
            System.exit(0);
        }
    }

    public static void ini() {
        System.out.println("\n  __  __     _ __      ");
        System.out.println(" / / / /__  (_) /___ __");
        System.out.println("/ /_/ / _ \\/ / __/ // /");
        System.out.println("\\____/_//_/_/\\__/\\_, /  ");
        System.out.println("                /___/  By: SirRiuz - 1.0\n");
    }

    public static void main(String[] args) throws IOException {
        un.com();
    }

    public void com() throws IOException {

        System.out.print("\n[unity] :: ");
        Scanner imput_comand = new Scanner(System.in);
        commands = imput_comand.nextLine();

        /**
         * Bueno aqui estan los comandos que pueden utilizar :D
         */

        switch (commands) {
            
        case "--unity.create":
            un.CreateFile();
            un.ruta();
            un.ramdom_num2();
            un.shut();
            un.createFile();
            break;

        case "--unity.kill":
            System.err.println("\n" + "[!] has matado a unity :( ");
            System.exit(0);
            break;

        default:
            System.err.println("\n" + "[!] el comando '" + commands + "' no existe");
            break;

        case "--unity.info":
            System.out.println("\n+-----------------+");
            System.out.println("| Informacion     |");
            System.out.println("+-----------------+");
            System.out.println("|                 |");
            System.out.println("| by: SirRiuz     |");
            System.out.println("| ver: 1.0-[BETA] |");
            System.out.println("| patch: 0-p1     |");
            System.out.println("|                 |");
            System.out.println("+-----------------+");
            break;

        }
    }
}
