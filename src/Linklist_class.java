import java.util.LinkedList;

public class Linklist_class {

    public static void main(String[] args) {

        LinkedList<Integer> Li=new LinkedList<Integer>();
        Li.add(21);
        Li.add(11);
        Li.add(61);
        Li.add(24);
        Li.add(65);
        Li.add(40);

        System.out.println(Li);
        System.out.println(Li.getFirst());
        System.out.println(Li.lastIndexOf(65));



    }

}
