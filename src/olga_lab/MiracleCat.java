package olga_lab;

public class MiracleCat {

    String name;
    String superPower1;
    String superPower2;
    String superPower3;

    public MiracleCat(String name, String superPower1, String superPower2, String superPower3) {
        this.name = name;
        this.superPower1 = superPower1;
        this.superPower2 = superPower2;
        this.superPower3 = superPower3;
    }

  public void useSuperPower1(){
      System.out.println("Cat" + name + "can relieve stress right away");
  }

  public void useSuperPower2(){
      System.out.println("Cat" + name + "can bring luck");
  }

  public void useSuperPower3(){
      System.out.println("Cat" + name + "can jump enormous distances");
  }

}
