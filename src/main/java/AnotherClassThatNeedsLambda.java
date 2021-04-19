public class AnotherClassThatNeedsLambda {
    ReturnOnlyOneThing returnOnlyOneThing1 = (numbers, eve) -> (eve>=numbers);
    public boolean findGreaterthanOrEqualTo(ReturnOnlyOneThing returnOnlyOneThing, int oneNumber, int anotherNumber){
       return returnOnlyOneThing1.saySomething(oneNumber, anotherNumber);
    }
}
