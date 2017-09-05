import java.util.Scanner;

public class home2_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("имя:");
        String name=in.nextLine();
        System.out.println("город:");
        String town = in.nextLine();
        System.out.println("возраст:");
        String age = in.nextLine();
        System.out.println("хобби:");
        String hobby = in.nextLine();

        System.out.println(name + " : имя ");
        System.out.println(town + " : город ");
        System.out.println(age + " : возраст ");
        System.out.println(hobby + " : хобби ");
    }
}