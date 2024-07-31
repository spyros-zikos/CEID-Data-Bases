package bd;


public class SetterManages {
    private String mng_adm_AT;    
    private int mng_br_code;

    public SetterManages(String AT, int code){
        this.mng_adm_AT = AT;
        this.mng_br_code = code;
    }
 
    public String getAT(){
        return mng_adm_AT;
    }
    
    public int getCode(){
        return mng_br_code;
    }    
}
