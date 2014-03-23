package de.fh_mainz.oo_prog.util;

import java.io.*;

import javax.swing.JOptionPane;

/**
  *
  * Klasse <code>Tastatur</code> enthält
  * statische Methoden zum Einlesen von
  * der Standardeingabe (Kommandozeile)x
  */

public class Tastatur {
      /**
        * Wartet auf Eingabe von der Kommandozeile,
        * liefert eine Instanz von <code>String</code>
        */

      public static String readString(String meldung) {
            BufferedReader reader =
                  new BufferedReader(new InputStreamReader(System.in));
            System.out.flush();
            System.out.print(meldung);
            System.out.print("?");
            try {
                  return reader.readLine();
            } catch (Exception e) {
                  System.out.println(e);
            }
            return new String("");
      }

      /**
        * Wartet auf Eingabe von der Kommandozeile,
        * liefert einen Wert vom Grundtyp <code>char</code>
        */

      public static char readchar(String meldung) {
            BufferedReader reader =
                  new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            System.out.flush();
            System.out.print(meldung);
            System.out.print("?");
            try {
                  line = reader.readLine();
                  if (line.length() > 0)
                        return line.charAt(0);
            } catch (Exception e) {
                  System.out.println(e);
            }
            return ' ';
      }
      /**
       * Wartet auf Eingabe von der Kommandozeile,
       * liefert einen Wert vom Grundtyp <code>int</code>
       */
      public static int readint(String meldung) {
            BufferedReader reader =
                  new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            System.out.flush();
            System.out.print(meldung);
            System.out.print("?");
            try {
                  line = reader.readLine();
            } catch (Exception e) {
                  System.out.println(e);
            }
            try {
                  return (new Integer(line)).intValue();
            } catch (Exception e) {
                  return 0;
            }
      }

      /**
        * Wartet auf Eingabe von der Kommandozeile,
        * liefert einen Wert vom Grundtyp <code>float</code>
        */
      public static float readfloat(String meldung) {
            BufferedReader reader =
                  new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            System.out.flush();
            System.out.print(meldung);
            System.out.print("?");
            try {
                  line = reader.readLine();
            } catch (Exception e) {
                  System.out.println(e);
            }
            try {
                  return (new Float(line)).floatValue();
            } catch (Exception e) {
                  return 0;
            }
      }
      /**
        * Wartet auf Eingabe von der Kommandozeile,
        * liefert einen Wert vom Grundtyp <code>double</code>
        */
      public static double readdouble(String meldung) {
            BufferedReader reader =
                  new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            System.out.flush();
            System.out.print(meldung);
            System.out.print("?");
            try {
                  line = reader.readLine();
            } catch (Exception e) {
                  System.out.println(e);
            }
            try {
            	return (new Double(line)).doubleValue();
            } catch (Exception e) {
                  return 0;
            }
      }
      public static String inputString(String meldung) {
      	String str;
      	String line;

      	str = meldung + "?";
       line = JOptionPane.showInputDialog(str);
       return(line);
      }

      public static char inputchar(String meldung) {
      	String str;
      	String line;
      	char   ch;

      	str = meldung + "?";
       line = JOptionPane.showInputDialog(str);
       if (line.length() > 0) ch = line.charAt(0); else ch = ' ';
       return(ch);
      }

      public static int inputint(String meldung) {
      	String str;
      	String line;

      	str = meldung + "?";
       line = JOptionPane.showInputDialog(str);
       return (new Integer(line)).intValue();
      }

      public static float inputfloat(String meldung) {
      	String str;
      	String line;

      	str = meldung + "?";
       line = JOptionPane.showInputDialog(str);
       return (new Float(line)).floatValue();
      }

      public static double inputdouble(String meldung) {
      	String str;
      	String line;

      	str = meldung + "?";
       line = JOptionPane.showInputDialog(str);
       return (new Double(line)).doubleValue();
      }


/*
      public static String readString() {
     	 return readString("?");
      }
      public static char readchar() {
     	 return readchar("?");
     }
      public static int readint() {
     	 return readint("?");
     }
      public static float readfloat() {
     	 return readfloat("?");
     }
      public static double readdouble() {
     	 return readdouble("?");
     }
*/
}
