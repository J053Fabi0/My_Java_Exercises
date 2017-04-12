import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int cases = in.nextInt(); //N cases
    in.nextLine();

    String numberSort = "";
    String number = "";

    int hey = 0;

    long numberInt = 0;
    long minus = 0;
    String minusStr;

    String[] numberStrArray;
    String[] minusArr;
    List<String> list;


    for (int i = 1; i <= cases; ++i) {
      number = in.nextLine();

      numberInt = Long.parseLong(number);

      numberStrArray = number.split("");
      Arrays.sort(numberStrArray);

      for(int i3 = 0; i3 < numberStrArray.length; i3++) {
        numberSort = numberSort + numberStrArray[i3];
      }

      while (true) {
        // System.out.println(number);
        if(numberSort.equals(number) ) {
          break;
        }
        numberInt = numberInt - 1;
        numberSort = Long.toString(numberInt);
        number = Long.toString(numberInt);

        numberStrArray = numberSort.split("");
        // Arrays.sort(numberStrArray);

        list = Arrays.asList(numberStrArray);

        // if(list.get(list.size()-1).equals("0") && list.size() > 10) {

        //   minusStr = "";

        //   for(int i3 = 0; i3 < list.size()-1; i3++) {
        //     minusStr = minusStr + list.get(i3);
        //   }
        //   System.out.println(minusStr);

        //   minusArr = list.toArray(new String[list.size()-1]);
          
        //   minus = Long.parseLong(minusStr);
        //   numberInt = numberInt-minus;

        //   numberSort = Long.toString(numberInt);
        //   number = Long.toString(numberInt);

        //   numberStrArray = numberSort.split("");
        // }

        Arrays.sort(numberStrArray);

        numberSort = "";

        for(int i4 = 0; i4 < list.size(); i4++) {
          numberSort = numberSort + list.get(i4);
        }

      }


      System.out.println("Case #" + i + ": " + numberInt);
      numberSort = "";
    }
    System.exit(0);
  }
}