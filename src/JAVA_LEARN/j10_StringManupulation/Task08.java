package JAVA_LEARN.j10_StringManupulation;

public class Task08 {
       public static void main(String[] args) {
               /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
              String  h = "XYZABCDKLMNEFGHPQRSTUIJOVW";
              char f = h.charAt(h.indexOf('F'));
              char a = h.charAt(h.indexOf('A'));
              char r = h.charAt(h.indexOf('R'));
              char u = h.charAt(h.indexOf('U'));
              char k = h.charAt(h.indexOf('K'));
              System.out.println(""+f+a+r+u+k);
       }
       }


