public class HomeWork_6 {
    
    public static void main(String[] args) {
        System.out.println(determineTriangleType(3, 3, 3));   // Равносторонний треугольник
        System.out.println(determineTriangleType(3, 4, 3));   // Равнобедренный треугольник
        System.out.println(determineTriangleType(2, 4, 5));   // Разносторонний треугольник
    }

    public static String determineTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "Равносторонний треугольник";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Равнобедренный треугольник";
        } else {
            return "Разносторонний треугольник";
        }
    }
}
