interface ReturnOnlyOneThing{
    boolean saySomething(int numbers, int eve);
   default int addSome(int numbers, int evenNumbers ){
        return numbers+evenNumbers;
    };

    default void bookBorrowed() {
        System.out.println("You have borrowed a book");
    }
}