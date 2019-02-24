import java.util.LinkedList;

public class Account
{
    protected int customerID;
    protected int accountNumber;
    protected char accountType; // 'c' for checking, 'm' for mortgage
    protected double interestRate; // probably 0 for checking accounts
    protected double monthlyInterestRate; // interestRate / 12
    protected double currentMonthInterest;
    protected double balance;
    protected LinkedList<Transaction> transactionlist;

    public Account() {
    }

    public Account(int customerID, int accountNumber, char accountType, double interestRate, double monthlyInterestRate, double currentMonthInterest, double balance, LinkedList<Transaction> transactionlist) {
        this.customerID = customerID;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.monthlyInterestRate = monthlyInterestRate;
        this.currentMonthInterest = currentMonthInterest;
        this.balance = balance;
        this.transactionlist = transactionlist;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public char getAccountType() {
        return this.accountType;
    }

    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyInterestRate() {
        return this.monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public double getCurrentMonthInterest() {
        return this.currentMonthInterest;
    }

    public void setCurrentMonthInterest(double currentMonthInterest) {
        this.currentMonthInterest = currentMonthInterest;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LinkedList<Transaction> getTransactionlist() {
        return this.transactionlist;
    }

    public void setTransactionlist(LinkedList<Transaction> transactionlist) {
        this.transactionlist = transactionlist;
    }

    public Account customerID(int customerID) {
        this.customerID = customerID;
        return this;
    }

    public Account accountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public Account accountType(char accountType) {
        this.accountType = accountType;
        return this;
    }

    public Account interestRate(double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public Account monthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
        return this;
    }

    public Account currentMonthInterest(double currentMonthInterest) {
        this.currentMonthInterest = currentMonthInterest;
        return this;
    }

    public Account balance(double balance) {
        this.balance = balance;
        return this;
    }

    public Account transactionlist(LinkedList<Transaction> transactionlist) {
        this.transactionlist = transactionlist;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return customerID == account.customerID && accountNumber == account.accountNumber && accountType == account.accountType && interestRate == account.interestRate && monthlyInterestRate == account.monthlyInterestRate && currentMonthInterest == account.currentMonthInterest && balance == account.balance && Objects.equals(transactionlist, account.transactionlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, accountNumber, accountType, interestRate, monthlyInterestRate, currentMonthInterest, balance, transactionlist);
    }

    @Override
    public String toString() {
        return "{" +
            " customerID='" + getCustomerID() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", accountType='" + getAccountType() + "'" +
            ", interestRate='" + getInterestRate() + "'" +
            ", monthlyInterestRate='" + getMonthlyInterestRate() + "'" +
            ", currentMonthInterest='" + getCurrentMonthInterest() + "'" +
            ", balance='" + getBalance() + "'" +
            ", transactionlist='" + getTransactionlist() + "'" +
            "}";
    }


}