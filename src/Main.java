import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Region region = Region.valueOf(scanner.nextLine().toUpperCase());
        switch (region) {
            case NARYN -> System.out.println(Region.NARYN);
            case BATKEN -> System.out.println(Region.BATKEN);
            case OSH -> System.out.println(Region.OSH);
            case YSYKKOL -> System.out.println(Region.YSYKKOL);
            case DJALALABAT -> System.out.println(Region.DJALALABAT);
            case CHUI -> System.out.println(Region.CHUI);
            case TALAS -> System.out.println(Region.TALAS);
        }
    }
}

