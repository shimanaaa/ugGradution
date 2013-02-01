package net.techest.ug.mvc.entity;
// Generated Sep 15, 2011 3:56:31 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Papersel generated by hbm2java
 */
@Entity
@Table(name="papersel"
    ,catalog="uggradution"
)
public class Papersel  implements java.io.Serializable {


     private Integer id;
     private int pid;
     private int yid;
     private int owneruid;
     private int leftsolts;
     private int maxslots;
     private int isdel;

    public Papersel() {
    }

    public Papersel(int pid, int yid, int owneruid, int leftsolts, int maxslots, int isdel) {
       this.pid = pid;
       this.yid = yid;
       this.owneruid = owneruid;
       this.leftsolts = leftsolts;
       this.maxslots = maxslots;
       this.isdel = isdel;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="pid", nullable=false)
    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    
    @Column(name="yid", nullable=false)
    public int getYid() {
        return this.yid;
    }
    
    public void setYid(int yid) {
        this.yid = yid;
    }
    
    @Column(name="owneruid", nullable=false)
    public int getOwneruid() {
        return this.owneruid;
    }
    
    public void setOwneruid(int owneruid) {
        this.owneruid = owneruid;
    }
    
    @Column(name="leftsolts", nullable=false)
    public int getLeftsolts() {
        return this.leftsolts;
    }
    
    public void setLeftsolts(int leftsolts) {
        this.leftsolts = leftsolts;
    }
    
    @Column(name="maxslots", nullable=false)
    public int getMaxslots() {
        return this.maxslots;
    }
    
    public void setMaxslots(int maxslots) {
        this.maxslots = maxslots;
    }
    
    @Column(name="isdel", nullable=false)
    public int getIsdel() {
        return this.isdel;
    }
    
    public void setIsdel(int isdel) {
        this.isdel = isdel;
    }




}


