package co.istad.generictype;

public class GenericTypeDemo {

    private static <T, S, U> void print(T data, S data2, U data3) {
        System.out.println("Data is " + data);
        System.out.println("Data2 is " + data2);
        System.out.println("Data3 is " + data3);
    }

    public static void main(String[] args) {

        print("Coca", 123, 3.14);
        print(123, "Hello", true);
        print("1", "Test", 12.1F);
        print(true, true, "Test3");

        /*Box<Double, String> box = new Box<>();
        box.setData(3.14);
        box.setSecondaryData("PI");

        System.out.println(box.getData());
        System.out.println(box.getSecondaryData());*/
    }
}
