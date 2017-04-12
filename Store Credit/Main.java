import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    Random  rnd = new Random();

    int cases = in.nextInt(); //N cases
    int credit = 0; //Credit
    int numberItems = 0; //Number of items
    int pos1 = 1;
    int pos2 = 2;

    String itemsString = ""; //items

    for(int i = 1; i < cases+1; i++){
      credit = in.nextInt();
      numberItems = in.nextInt();
      in.nextLine(); //Scanner set the cursor to the next line, where the itmes are
      itemsString = in.nextLine();

      String [] itemsArray = itemsString.split(" "); //Este array separa los items por " "
      List<String> itemsList = Arrays.asList(itemsArray); //Se pasa el array a un arrayList
      Map<Integer, Integer> itemsAndPos = new HashMap<Integer, Integer>(); //El item y su posicion

      for(int i2 = 0; i2 < itemsList.size(); i2++){ //Tenemos el map que tiene la posición y el numero
        itemsAndPos.put(i2+1, Integer.parseInt(itemsList.get(i2)));
      }

      while((itemsAndPos.get(pos1) + itemsAndPos.get(pos2)) != credit){ //mientras no sean las respuestas que buscamos sigue intentando...
        pos1 = 1;
        pos2 = 1;

        while(pos1 == pos2){ // -esto evita que salgan 2 numero iguales-
          pos1 = rnd.nextInt(itemsAndPos.size())+1; // ...con numeros al azar, hasta lograr que 
          pos2 = rnd.nextInt(itemsAndPos.size())+1; // le atine a la respuesta correcta
        }
      }

      if(pos1 < pos2){ //Finalmente imprimimos los resultados, de menor a mayor
        System.out.println("Case #" + i + ": " + pos1 + " " + pos2);
      }
      else if(pos1 > pos2){
        System.out.println("Case #" + i + ": " + pos2 + " " + pos1);
      }
      else{
        System.out.println("Case #" + i + ": " + pos1 + " " + pos2);
      }

      pos1 = 1; //Esto evita que el siguiente caso tenga residuos de este caso
      pos2 = 2; //con residuos quiero decir las respuestas de este caso

    }
  }
}
