package Model;
// Generated Jun 15, 2020 12:25:44 PM by Hibernate Tools 4.3.1



/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private Integer no;
     private String username;
     private String password;
     private Integer permit;

    public Account() {
    }

	
    public Account(String username) {
        this.username = username;
    }
    public Account(String username, String password, Integer permit) {
       this.username = username;
       this.password = password;
       this.permit = permit;
    }
   
    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getPermit() {
        return this.permit;
    }
    
    public void setPermit(Integer permit) {
        this.permit = permit;
    }




}


