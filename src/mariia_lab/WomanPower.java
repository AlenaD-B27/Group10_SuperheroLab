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
    public void setInfo(String name){
        this.name = name;
        this.superPower1= " can do 3 things simultaneously";
        this.superPower2=" can coding";
        this.superPower3=" creates magic";
    }
    public final String useSuperPower1(){
        return name + " like a Caesar " + superPower1;
    }
    public final String useSuperPower2(){
        return name + " " + superPower2 + " all the night";
    }
    public final String useSuperPower3(){
        return name + " " + superPower3 +" with HTML+CSS+JavaScript ";
    }
    @Override
    public String toString() {
        return  name + " has these super powers: " +"\n1)"+
                superPower1 + "\n2)" +superPower2 +"\n3)"+ superPower3 +
                "\n" + useSuperPower1() + "\n" +useSuperPower2() + "\n" + useSuperPower3();
    }
}
