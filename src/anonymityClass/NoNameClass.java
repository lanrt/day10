package anonymityClass;

import demo.InterfaceA;

public class NoNameClass {
    public static void main(String[] args) {
        InterfaceA impl = new InterfaceA() {
            @Override
            public void method01() {
                System.out.println("匿名内部类方法1，实现接口");
            }
            @Override
            public void method02() {
                System.out.println("匿名内部类方法2，实现接口");
            }

        };
        impl.method01();


    }
}
