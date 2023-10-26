package bd;


public class SetterWorker {
    private String wrk_AT;
    private String wrk_name;
    private String wrk_lname;
    private float wrk_salary;
    private int wrk_br_code;
    
    public SetterWorker(String AT, String name, String lname, float salary, int code){
        this.wrk_AT = AT;
        this.wrk_name = name;
        this.wrk_lname = lname;
        this.wrk_salary = salary;
        this.wrk_br_code = code;
    }
    
    public String getAT(){
        return wrk_AT;
    }  
    
    public String getName(){
        return wrk_name;
    }
    
    public String getLastName(){
        return wrk_lname;
    }
    
    public float getSalary(){
        return wrk_salary;
    }
    
    public int getCode(){
        return wrk_br_code;
    }    
    
}
