package mariia_lab;

import java.security.SecureRandom;

public class WomanPower {
    String name;
    String superPower1;
    String superPower2;
    String superPower3;
    /* public void setInfo(String name, String superPower1, String superPower2, String superPower3){
         this.name = name;
         this.superPower1=superPower1;
         this.superPower2=superPower2;
         this.superPower3=superPower3;
     }*/
    public WomanPower(String name){
        this.name = name;
        superPower1= " can do 3 things simultaneously";
        superPower2=" can coding";
        superPower3=" creates magic";
    }
    public void useSuperPower1(){
        System.out.println(name + " like a Caesar " + superPower1);
    }
    public void useSuperPower2(){
        System.out.println(name + " " + superPower2 + " all the night");
    }
    public void useSuperPower3(){
        System.out.println(name + " " + superPower3 +" with HTML+CSS+JavaScript ");
    }
    @Override
    public String toString() {
        return  name + " has these super powers: " +"\n1)"+
                superPower1 + "\n2)" +superPower2 +"\n3)"+ superPower3;
    }
}
