public class Mortgage extends Account
{
    private int termInYears;
    private int termInMonths;
    private double periodicPayment;
    private double balanceRepaid;

    public Mortgage() {
    }

    public Mortgage(int termInYears, int termInMonths, double periodicPayment, double balanceRepaid) {
        this.termInYears = termInYears;
        this.termInMonths = termInMonths;
        this.periodicPayment = periodicPayment;
        this.balanceRepaid = balanceRepaid;
    }

    public int getTermInYears() {
        return this.termInYears;
    }

    public void setTermInYears(int termInYears) {
        this.termInYears = termInYears;
    }

    public int getTermInMonths() {
        return this.termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public double getPeriodicPayment() {
        return this.periodicPayment;
    }

    public void setPeriodicPayment(double periodicPayment) {
        this.periodicPayment = periodicPayment;
    }

    public double getBalanceRepaid() {
        return this.balanceRepaid;
    }

    public void setBalanceRepaid(double balanceRepaid) {
        this.balanceRepaid = balanceRepaid;
    }

    public Mortgage termInYears(int termInYears) {
        this.termInYears = termInYears;
        return this;
    }

    public Mortgage termInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
        return this;
    }

    public Mortgage periodicPayment(double periodicPayment) {
        this.periodicPayment = periodicPayment;
        return this;
    }

    public Mortgage balanceRepaid(double balanceRepaid) {
        this.balanceRepaid = balanceRepaid;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mortgage)) {
            return false;
        }
        Mortgage mortgage = (Mortgage) o;
        return termInYears == mortgage.termInYears && termInMonths == mortgage.termInMonths && periodicPayment == mortgage.periodicPayment && balanceRepaid == mortgage.balanceRepaid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(termInYears, termInMonths, periodicPayment, balanceRepaid);
    }

    @Override
    public String toString() {
        return "{" +
            " termInYears='" + getTermInYears() + "'" +
            ", termInMonths='" + getTermInMonths() + "'" +
            ", periodicPayment='" + getPeriodicPayment() + "'" +
            ", balanceRepaid='" + getBalanceRepaid() + "'" +
            "}";
    }
}