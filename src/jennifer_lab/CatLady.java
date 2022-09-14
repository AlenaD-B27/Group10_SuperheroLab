package jennifer_lab;

public class CatLady {
    String name;
    String superPower1;
    String superPower2;
    String superPower3;

    public CatLady() {
        this("Jennifer", "Leap over buildings ", "hide and become invisible ", "detect trouble from miles away ");
    }

    public CatLady(String name, String superPower1, String superPower2, String superPower3) {
        this.name = name;
        this.superPower1 = superPower1;
        this.superPower2 = superPower2;
        this.superPower3 = superPower3;

    }

    public void useSuperPower1() {
        System.out.println("Cat Lady " + name + " can " + superPower1 + ".");
    }

    public void useSuperPower2() {
        System.out.println("Cat Lady " + name + " can " + superPower2 + ".");
    }

    public void useSuperPower3() {
        System.out.println("Cat Lady " + name + " can " + superPower3 + ".");


    }

    @Override
    public String toString() {
        return "CatLady{" +
                "name='" + name + '\'' +
                ", superPower1='" + superPower1 + '\'' +
                ", superPower2='" + superPower2 + '\'' +
                ", superPower3='" + superPower3 + '\'' +
                '}';
    }
}