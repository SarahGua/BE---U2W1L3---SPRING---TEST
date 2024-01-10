package sarah.guarneri.BE.U2W1L3;

public class ClassForTest {

    static public int sum(int a, int b){
        return a + b;
    }

    static public int sum(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++ ){
            sum +=numbers[i];
        }
        return  sum;
    }

    static public int multiply(int a, int b, int c){
        return a * b * c;
    }

    static public int numbers(int a, int b, String operation){
        switch (operation){
            case "add":
                return a + b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0 && b < a) {
                    return a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    static public int multiplyNum(int a, int b, int expectedResult){
        return a * b;
    }
}
