package bd;


public class SetterBranch {
    private int br_code;    
    private String br_street;
    private int br_num;
    private String br_city;

    public SetterBranch(int code, String street, int num, String city){
        this.br_code = code;
        this.br_street = street;
        this.br_num = num;
        this.br_city = city;
    }
 
    public int getCode(){
        return br_code;
    }
    
    public String getStreet(){
        return br_street;
    }
    
    public int getNum(){
        return br_num;
    }
    
    public String getCity(){
        return br_city;
    }
}
