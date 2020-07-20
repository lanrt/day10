package demo;

public class Demo01 {
    public InterfaceA demo(InterfaceA a){
        a.method01();
        a.method02();
        return new InterfaceAImpl02();
    }
}
