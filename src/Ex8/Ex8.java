package Ex8;
class Bonus{
    public static float calbonus(float s){
        return 0.05f*s;
    }
}
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Bonus = "+Bonus.calbonus(4000)+"บาท");
    }
}
