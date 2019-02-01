package oopfeature;


public class Parent {

    public void ParentMethod(){

        System.out.println("parent class method");
    }
}
class Uncle extends Parent {

    public void unclemethod() {

        System.out.println("uncle class method");
    }

}
    class Child extends Uncle{

        public void childmethod(){

            System.out.println("child class method");
        }

        public static void main(String[] args) {

            Child child=new Child();
            child.ParentMethod();
            child.unclemethod();
            child.childmethod();

        }
    }


