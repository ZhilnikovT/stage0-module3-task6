package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void main(String[] args) {  
        FloatTypeCasting fl = new FloatTypeCasting();
        fl.roundNumber(19.5F);
    }
    public void roundNumber(float numberToBeRounded) {
        if (numberToBeRounded - (int)numberToBeRounded >= 0.5){
            System.out.println((int)numberToBeRounded + 1);
        }else{
            System.out.println((int)numberToBeRounded);
        }
    }
}
