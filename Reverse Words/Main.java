import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int t = in.nextInt(); //T cases
    String temp = "";

    temp = in.nextLine();

    for(int i = 1; i <= t; i++){
      temp = in.nextLine();

      String [] items = temp.split(" "); //Este array separa la frase de temp por cada " "
      List<String> itemsList = Arrays.asList(items); //Se pasa el array a un arrayList
      String itemsReverse = ""; //Esta variable será la que almacene itemsList a String una vez que se reversée


      Collections.reverse(itemsList); //Esta función reverséa todo lo de itemsList

      for(int ii = 0; ii < itemsList.size(); ii++){ //Se pasa itemsList a la variable itemsReverse
        if(ii == 0){
          itemsReverse = itemsList.get(ii);
        }else{
          itemsReverse = itemsReverse + " " + itemsList.get(ii);
        }
      }

      System.out.println("Case #" + i + ": " + itemsReverse); //Se imprime y luego se repite el proceso hasta terminar con todas las lineas
    }
  }
}
