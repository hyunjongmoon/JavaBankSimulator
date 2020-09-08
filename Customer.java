class Customer extends Bank {

    private String cusName ;
    private String sex;
    private int age;
    private int height;

    public String HHJName()
    {
        this.cusName =  "하효정";
        return cusName;
    }

    public String HHJsex()
    {
        this.sex =  "여성";
        return sex;
    }

    public int HHJage()
    {
        this.age = 23;
        return age;
    }

    public int HHJheight()
    {
        this.height =  160;
        return height;
    }

    public String MHJName()
    {
        this.cusName =  "문현종";
        return cusName;
    }

    public String MHJsex()
    {
        this.sex =  "남성";
        return sex;
    }

    public int MHJage()
    {
        this.age = 28;
        return age;
    }

    public int MHJheight()
    {
        this.height =  180;
        return height;
    }

}
