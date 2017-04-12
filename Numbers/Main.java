import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int cases = in.nextInt(); //N cases
    double number = 0;
    double operation = 6.7082039325;
    double pow = 0;
    double result = 0;

    
    for(int i = 1; i < cases+1; i++){

      number = in.nextInt();

      pow = Math.pow(6.7082039325, 5);

      // String [] items = temp.split(" "); //Este array separa la frase de temp por cada " "
      // List<String> itemsList = Arrays.asList(items); //Se pasa el array a un arrayList

      System.out.println(pow);

    }

  }
}