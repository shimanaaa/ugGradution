package net.techest.ug.mvc.entity;
// Generated Sep 15, 2011 3:56:31 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Papertrunk generated by hbm2java
 */
@Entity
@Table(name="papertrunk"
    ,catalog="uggradution"
)
public class Papertrunk  implements java.io.Serializable {


     private Integer id;
     private int mid;
     private int uid;
     private String tags;
     private String title;
     private String shortdesp;
     private String desp;
     private Date addtime;
     private int statu;
     
    public Papertrunk() {
    }

    public Papertrunk(int mid, int uid, String tags, String title, String shortdesp, String desp, Date addtime, int statu) {
       this.mid = mid;
       this.uid = uid;
       this.tags = tags;
       this.title = title;
       this.shortdesp = shortdesp;
       this.desp = desp;
       this.addtime = addtime;
       this.statu = statu;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="mid", nullable=false)
    public int getMid() {
        return this.mid;
    }
    
    public void setMid(int mid) {
        this.mid = mid;
    }
    
    @Column(name="uid", nullable=false)
    public int getUid() {
        return this.uid;
    }
    
    public void setUid(int uid) {
        this.uid = uid;
    }
    
    @Column(name="tags", nullable=false, length=65535)
    public String getTags() {
        return this.tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }
    
    @Column(name="title", nullable=false, length=128)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="shortdesp", nullable=false)
    public String getShortdesp() {
        return this.shortdesp;
    }
    
    public void setShortdesp(String shortdesp) {
        this.shortdesp = shortdesp;
    }
    
    @Column(name="desp", nullable=false)
    public String getDesp() {
        return this.desp;
    }
    
    public void setDesp(String desp) {
        this.desp = desp;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="addtime", nullable=false, length=0)
    public Date getAddtime() {
        return this.addtime;
    }
    
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
    
    @Column(name="statu", nullable=false)
    public int getStatu() {
        return this.statu;
    }
    
    public void setStatu(int statu) {
        this.statu = statu;
    }

}


