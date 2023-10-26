package bd;


public class SetterPhones {
    private int ph_br_code;    
    private String ph_number;

    public SetterPhones( int code,String number){
        this.ph_br_code = code;
        this.ph_number = number;
    }

    public int getCode(){
        return ph_br_code;
    }     
     
    public String getNumber(){
        return ph_number;
    }
    
}
