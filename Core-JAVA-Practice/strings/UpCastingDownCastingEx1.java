package strings;

public class UpCastingDownCastingEx1 {

    public static void main(String[] args) {
        Box b1 = new Box(10);
        // System.out.println(b1.getValue());

        Box b2 = new Box("Hello, World!");
        // System.out.println(b2.getValue());

        Box b3 = new Box(3.14);
        // System.out.println(b3.getValue());

        Box b4 = new Box(true);
        // System.out.println(b4.getValue());

        // downcasting

        Integer intValue = (Integer) b1.getValue();
        System.out.println(intValue + 5);

        String strValue = (String) b2.getValue();
        System.out.println(strValue + " How are you?");

        Double doubleValue = (Double) b3.getValue();
        System.out.println(doubleValue + 2.0);

        Boolean boolValue = (Boolean) b4.getValue();
        System.out.println(boolValue + " , This is a boolean value.");

    }

}

class Box {
    private Object value;

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

// class Box {
// private int value;

// public Box(int value) {
// this.value = value;
// }

// public int getValue() {
// return value;
// }

// public void setValue(int value) {
// this.value = value;
// }
// }
