package Model;
// Generated Jun 15, 2020 12:25:44 PM by Hibernate Tools 4.3.1



/**
 * Remarking generated by hbm2java
 */
public class Remarking  implements java.io.Serializable {


     private Integer no;
     private String remarkId;
     private String studentId;
     private String fullname;
     private String subject;
     private String colExam;
     private Float mark;
     private String reason;
     private String status;

    public Remarking() {
    }

	
    public Remarking(String remarkId) {
        this.remarkId = remarkId;
    }
    public Remarking(String remarkId, String studentId, String fullname, String subject, String colExam, Float mark, String reason, String status) {
       this.remarkId = remarkId;
       this.studentId = studentId;
       this.fullname = fullname;
       this.subject = subject;
       this.colExam = colExam;
       this.mark = mark;
       this.reason = reason;
       this.status = status;
    }
   
    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getRemarkId() {
        return this.remarkId;
    }
    
    public void setRemarkId(String remarkId) {
        this.remarkId = remarkId;
    }
    public String getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getColExam() {
        return this.colExam;
    }
    
    public void setColExam(String colExam) {
        this.colExam = colExam;
    }
    public Float getMark() {
        return this.mark;
    }
    
    public void setMark(Float mark) {
        this.mark = mark;
    }
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


