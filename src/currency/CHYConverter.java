package currency;

public class CHYConverter {

    // yuan to usd
    public double CHYtoUSD (double CHY){
        return CHY * 0.14;
    }

    // yen to euro
    public double CHYtoEUR (double CHY){
        return CHY * 11.36;
    }

    // yen to pound
    public double CHYtoGBP (double CHY){
        return CHY * 0.11;
    }

    // usd to rupee
    public double CHYtoRUP (double CHY){
        return CHY * 11.36;
    }

    // yuan to yen
    public double CHYtoJPY (double CHY){
        return CHY * 20.50;
    }
}
