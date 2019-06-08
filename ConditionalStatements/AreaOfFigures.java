import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fig = input.nextLine();
        double area = 0.0d;

        if (fig.equals("square")) {
            double side = Double.parseDouble(input.nextLine());
             area = side * side;
        } else if (fig.equals("rectangle")) {
            double width = Double.parseDouble(input.nextLine());
            double length = Double.parseDouble(input.nextLine());
            area = width * length;
        } else if (fig.equals("triangle")) {
            double height = Double.parseDouble(input.nextLine());
            double base = Double.parseDouble(input.nextLine());
            area = (height * base) / 2;
        } else if (fig.equals("circle")) {
            double radius = Double.parseDouble(input.nextLine());
            area = Math.PI * radius * radius;
        }
        System.out.printf("%.3f", area);
    }
}
