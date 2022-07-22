package Ex9;
class Tax{
    public static float calvat(float m){
        return 0.07f*m;
    }
}

public class Ex9 {
    public static void main(String[] args) {
        float money = 5000;
        float total_vat = Tax.calvat(money);
        float total_Fuel = Tax.calvat(money);
        System.out.println("สินค้าราคา " + money + " บาท คิดภาษีมูลค่าเพิ่ม 7% เป็นเงิน "
                + total_vat + " บาท \nคิดภาษีน้ำมัน 3% เป็นเงิน "+ total_Fuel+" บาท"
        );
        System.out.println("เหลือสุทธิ เป็นเงิน "+ (money - (total_vat+total_Fuel)));

    }
}
