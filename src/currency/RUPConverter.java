package currency;

public class RUPConverter {

    // rupee to usd
    public double RUPtoUSD (double RUP){
        return RUP * 0.012;
    }

    // rupee to euro
    public double RUPtoEUR (double RUP){
        return RUP * 0.011;
    }

    // rupee to pound
    public double RUPtoGBP (double RUP){
        return RUP * 0.0099;
    }

    // rupee to yen
    public double RUPtoJPY (double RUP){
        return RUP * 1.81;
    }

    // rupee to yuan
    public double RUPtoCHY (double RUP){
        return RUP * 0.088;
    }
}
