package DecoratorPattern;

import FactoryMethodPattern.Book;

public class ExtendedBorrowing extends Borrowing{

    private int extraDays = 7;

    public ExtendedBorrowing(Borrowing borrowing) {
        super(borrowing.book);
        this.dueDays = borrowing.dueDays;
    }

    public String getDetails() {
        return super.getDetails() + " Extended by " + extraDays + " days";
    }
}
