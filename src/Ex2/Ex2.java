package Ex2;
class Wage {
    public int h;
    public float r;
    public void calwage (int h , float r){
        float total = (40*r)+(h-40)*(1.5f*r);
        System.out.println("ค่าแรงรวม =" + total + "บาท");

    }
    }
public class Ex2 {
    public static void main(String[] args) {
        Wage emp_Wage = new Wage();
        emp_Wage.calwage(40,100.0f);
    }
}
