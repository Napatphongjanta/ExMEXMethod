package Ex4;
class Wage {
    public float calWage(int hour,float rate){
        return (40*rate)+(hour-40)*(1.5f*rate);
    }
    private float caloat(int hour,float rate){
        return (40*rate)+(hour-40)*(1.5f*rate);
    }
}
public class Ex4 {
    public static void main(String[] args) {
        Wage emp_wage = new Wage();
        float total = emp_wage.calWage(50, 200.0f);
        System.out.println("ค่าแรงรวม = " + total + "บาท");


    }
}
