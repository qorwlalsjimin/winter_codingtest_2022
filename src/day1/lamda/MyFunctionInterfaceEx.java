package day1.lamda;

public class MyFunctionInterfaceEx {
    public static void main(String[] args) {
        MyFunctionInterface1 fi;

        //메서드 구현(데이터 처리부)
        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method(); //호출

        fi = () -> System.out.println("method call2");
        fi.method();

        // ------------------------------------

        MyFunctionInterface2 fi2;

        //구현
        fi2 = (a,b) -> {
            System.out.println(a+b);
        };
        fi2.method1(3, 5); //호출

        fi2 = (a,b) -> {
            System.out.println(a*b);
        };
        fi2.method1(3, 5); //호출
    }
}
