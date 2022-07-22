package Ex1;

// Method no param , No Return

public class Ex1 {
    public int h;
    public float r;
    public void calwage (){
        float total = (40*r)+(h-40)*(1.5f*r);
        System.out.println("ค่าแรงรวม =" + total + "บาท");

    }
    public static void main(String[] args){
        Ex1 emp_wage = new Ex1();
        emp_wage.h = 50;
        emp_wage.r = 100.0f;
        emp_wage.calwage();
    }
}

