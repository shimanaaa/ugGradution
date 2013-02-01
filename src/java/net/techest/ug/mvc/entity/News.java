package net.techest.ug.mvc.entity;
// Generated Sep 17, 2011 9:40:05 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * News generated by hbm2java
 */
@Entity
@Table(name="news"
    ,catalog="uggradution"
)
public class News  implements java.io.Serializable {


     private Integer id;
     private String title;

     private String text;
     private Date addtime;
     private int authoruid;
     private int statu;

    public News() {
    }

    public News(String title,String text, Date addtime, int authoruid, int statu) {
        this.title=title;
       this.text = text;
       this.addtime = addtime;
       this.authoruid = authoruid;
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
    
    @Column(name="text", nullable=false, length=65535)
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="addtime", nullable=false, length=0)
    public Date getAddtime() {
        return this.addtime;
    }
    
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
    
    @Column(name="authoruid", nullable=false)
    public int getAuthoruid() {
        return this.authoruid;
    }
    
    public void setAuthoruid(int authoruid) {
        this.authoruid = authoruid;
    }
    
    @Column(name="statu", nullable=false)
    public int getStatu() {
        return this.statu;
    }
    
    public void setStatu(int statu) {
        this.statu = statu;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}


