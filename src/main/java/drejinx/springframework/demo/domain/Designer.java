package drejinx.springframework.demo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Designer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Version
    private Integer version;

    private Date dateCreated;
    private Date lastUpdated;

    private String firstName;
    private String lastName;
    private String image;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @PreUpdate
    public void updateTimeStamps(){
        lastUpdated = new Date();
        if(dateCreated==null){
            dateCreated = new Date();
        }
    }
}
