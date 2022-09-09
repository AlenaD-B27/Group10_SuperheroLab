package alena_lab;

public class Cupid {
    String name;
    String superPower1;
    String superPower2;
    String superPower3;

    public Cupid(String name, String superPower1, String superPower2, String superPower3) {
        this.name = name;
        this.superPower1 = superPower1;
        this.superPower2 = superPower2;
        this.superPower3 = superPower3;
    }

    public void useSuperpower1(){
        System.out.println("Cupid " + name + " can " + superPower1);
    }

    public void useSuperpower2(){
        System.out.println("Cupid " + name + " can " + superPower2);
    }

    public void useSuperpower3(){
        System.out.println("Cupid " + name + " can " + superPower3);
    }

    @Override
    public String toString() {
        return "Cupid{" +
                "name='" + name + '\'' +
                ", superPower1='" + superPower1 + '\'' +
                ", superPower2='" + superPower2 + '\'' +
                ", superPower3='" + superPower3 + '\'' +
                '}';
    }
}
