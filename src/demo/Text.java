package demo;

public class Text {
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        InterfaceA a = new InterfaceAImpl01();
        d.demo(a);
        InterfaceA b = d.demo(d.demo(a));
        d.demo(b);
    }
}
