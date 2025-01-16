import java.io.PrintStream;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<Integer>();


        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(15);
        list1.add(39);
        list1.add(45);
        list1.add(40);

        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);


//        System.out.println(list1.size());
//        boolean checkisempty = list1.isEmpty();
//        System.out.println(checkisempty);
//        System.out.println(list1.contains(3));
//        list1.remove(1);
//        System.out.println(list1.size());

       System.out.println("----------Traversing list data");



        }


}
