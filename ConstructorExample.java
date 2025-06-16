public class ConstructorExample {
    int modelYear;
    String modelName;

    // Constructor name matches the class name, no return type
    public ConstructorExample(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstructorExample myCar = new ConstructorExample(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
