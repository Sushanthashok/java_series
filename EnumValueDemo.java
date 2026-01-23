package Suskkoo;

enum Level {   // ← public
    LOW(1.2f), MEDIUM(2), HIGH(30);

    float value;

    Level(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}

class EnumValueDemo {
    public static void main(String[] args) {
        Level l = Level.LOW;
        System.out.println(l);           
        System.out.println(l.getValue());
    }
}
