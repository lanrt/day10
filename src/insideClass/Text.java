package insideClass;

public class Text {
    public static void main(String[] args) {
        Body body = new Body();
        Body.Heart heart = body.new Heart();
        body.work();
        body.boom();
        heart.boom();
        heart.text();
    }
}
