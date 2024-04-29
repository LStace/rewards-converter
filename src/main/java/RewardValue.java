public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cashValue){
        cash = cashValue;
        miles = (int) (cash / 0.0035);
    }

    public RewardValue(int milesValue){
        miles = milesValue;
        cash = miles * 0.0035;
    }

    public double getCashValue(){
        return cash;
    }

    public double getMilesValue(){
        return miles;
    }
}
