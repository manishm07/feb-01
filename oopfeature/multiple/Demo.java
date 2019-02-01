package oopfeature.multiple;

public class Demo implements Shape,Color {

    @Override
    public void getshape() {
        System.out.println("color");
    }

    @Override
    public void getcolor() {
        System.out.println("shape");
    }

    public static void main(String[] args) {

        Demo demo=new Demo();
        demo.getshape();
        demo.getcolor();
    }
}
