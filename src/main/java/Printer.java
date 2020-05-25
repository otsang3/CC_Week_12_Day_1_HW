public class Printer {

    private int remainingSheets;

    public Printer(int remainingSheets){
        this.remainingSheets = remainingSheets;
    }

    public int getRemainingSheets(){
        return remainingSheets;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int sheetsRequired = numberOfPages * numberOfCopies;
        if (remainingSheets > sheetsRequired) {
            remainingSheets = remainingSheets - sheetsRequired;
        }

    }

}
