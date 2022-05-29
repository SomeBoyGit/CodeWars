package CamelCase;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println("[" + camelCase("ca") + "]");
        System.out.println("[" + camelCase("camelCasing") + "]");
        System.out.println("[" + camelCase("camelCasingTest") + "]");
        System.out.println("[" + camelCase("camelcasingtest") + "]");
    }

    public static String camelCase(String input) {
        return String.join(" ", input.split("(?=[A-Z])"));
    }
}