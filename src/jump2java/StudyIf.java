import java.util.ArrayList;

public class StudyIf {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("cash");

        if (pocket.contains("cash")) {
            System.out.println("돈이 있다");
        } else {
            System.out.println("돈어 없다");
        }
    }
    public static void main2(String[] args) {
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("cash");

        if (pocket.contains("cash")) {
            System.out.println("돈이 있다2");
        } else {
            System.out.println("돈어 없다2");
        }
    }
}
