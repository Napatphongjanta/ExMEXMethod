package Ex6;

class coins{
    int ten,five,one;
}
class ExchageCoins {
    public void findcoin(coins c,int m ){
        c.ten = m/10;
        c.five = m%10/5;
        c.one = m%10%1;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        int money= 42;
        coins coin = new  coins();
        ExchageCoins coindata = new ExchageCoins();
        coindata.findcoin(coin,money);
        System.out.println("เงิน"+money+"บาท แลกได้"+"เหรียญสิบ"+coin.ten+" เหรียญ เหรียญห้า"+coin.five+"เหรียญ เหรียญบาท"+coin.one+"เหรียญ");

    }
}
