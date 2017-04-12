import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int cases = in.nextInt(); //N cases
    in.nextLine();
    String frase = "";
    String fraseT9 = "";
    boolean needSpace1 = false;
    boolean needSpace2 = false;

    Map<String, String> t9Abc = new HashMap<String, String>(); //

    t9Abc.put("a", "2"); //Seteamos el abc con un HashMap
    t9Abc.put("b", "22");
    t9Abc.put("c", "222");
    t9Abc.put("d", "3");
    t9Abc.put("e", "33");
    t9Abc.put("f", "333");
    t9Abc.put("g", "4");
    t9Abc.put("h", "44");
    t9Abc.put("i", "444");
    t9Abc.put("j", "5");
    t9Abc.put("k", "55");
    t9Abc.put("l", "555");
    t9Abc.put("m", "6");
    t9Abc.put("n", "66");
    t9Abc.put("o", "666");
    t9Abc.put("p", "7");
    t9Abc.put("q", "77");
    t9Abc.put("r", "777");
    t9Abc.put("s", "7777");
    t9Abc.put("t", "8");
    t9Abc.put("u", "88");
    t9Abc.put("v", "888");
    t9Abc.put("w", "9");
    t9Abc.put("x", "99");
    t9Abc.put("y", "999");
    t9Abc.put("z", "9999");
    t9Abc.put(" ", "0");

    for(int i = 1; i < cases+1; i++){
      frase = in.nextLine();
      
      String [] lettersArray = frase.split(""); //Este array guarda las letras de la frase
      List<String> lettersArrList = Arrays.asList(lettersArray); //Se pasa a un Array List

      for(int i2 = 0; i2 < lettersArrList.size(); i2++){
        if(i2 >= 1){
          needSpace1 = lettersArrList.get(i2-1).equals(lettersArrList.get(i2));
          if(fraseT9.substring(fraseT9.length()-1, fraseT9.length()).equals(t9Abc.get(lettersArrList.get(i2)).substring(0, 1))){
            needSpace1 = true;
          }
        }

        if(needSpace1 || needSpace2){
          fraseT9 = fraseT9 + " " + t9Abc.get(lettersArrList.get(i2));
        }
        else{
          fraseT9 = fraseT9 + t9Abc.get(lettersArrList.get(i2));
        }
      }

      System.out.println("Case #" + i + ": " + fraseT9);

      fraseT9 = ""; //Se borra la respuesta antigua para continuar con la siguiente
      needSpace1 = false;
      needSpace2 = false;

    }

  }
}