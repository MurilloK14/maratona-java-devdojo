package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'a';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");//String para int
        boolean verdadeiro = Boolean.parseBoolean("true");
    }
}
