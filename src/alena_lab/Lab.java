package alena_lab;

public class Lab {
    public static void main(String[] args) {


        Cupid cupid1 = new Cupid("Ben", "make people fall in love", "fly", "be forever young");

        Cupid cupid2 = new Cupid("Paul", "make people hate each other", "fly", "be forever old and grumpy");

        System.out.println(cupid1);
        cupid1.useSuperpower1();
        cupid1.useSuperpower2();
        cupid1.useSuperpower3();
        System.out.println("===================");
        cupid2.useSuperpower1();
        cupid2.useSuperpower2();
        cupid2.useSuperpower3();

    }
}
