class Bank {

    private String bankName;
    private String bankAcc;
    private int balance ;
    private int transfer;
    private int deposit;
    public String HHJbankName()
    {
        this.bankName = "국민은행";
        return bankName;
    }

    public String HHJbankAcc()
    {
        this.bankAcc = "27-560204-15";
        return bankAcc;
    }

    public void setHHJbal(int balance)
    {
        this.balance = balance;
    }

    public int getHHJbal()
    {
        return balance;
    }

    public String MHJbankName()
    {
        this.bankName = "부산은행";
        return bankName;
    }

    public String MHJbankAcc()
    {
        this.bankAcc = "12-247601-50";
        return bankAcc;
    }

    public void setMHJbal(int balance)
    {
        this.balance = balance;
    }

    public int getMHJbal()
    {
        return balance;
    }

    public void Trans(int me, int input, int you)
    {
        me = me - input;
        you = you + input;
    }

}
