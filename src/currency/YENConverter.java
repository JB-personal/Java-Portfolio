package currency;

public class YENConverter {

    // yen to usd
    public double JPYtoUSD (double JPY){
        return JPY * 0.0067;
    }

    // yen to euro
    public double JPYtoEUR (double JPY){
        return JPY * 0.0063;
    }

    // yen to pound
    public double JPYtoGBP (double JPY){
        return JPY * 0.0055;
    }

    // usd to rupee
    public double JPYtoRUP (double JPY){
        return JPY * 0.55;
    }

    // use to yuan
    public double JPYtoCHY (double JPY){
        return JPY * 0.049;
    }
}
