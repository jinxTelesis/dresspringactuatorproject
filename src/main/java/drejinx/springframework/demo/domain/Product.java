package drejinx.springframework.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private Date dateCreated;
    private Date lastUpdated;
    private String courseName;
    private String courseSubtitle;

    @Column(length  = 2000)
    private String courseDescription;

    private Designer designer;

    private BigDecimal price;

    @ManyToMany
    private List<ProductClassification> productClassificationList = new ArrayList<>();

    private String imageUrl;

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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSubtitle() {
        return courseSubtitle;
    }

    public void setCourseSubtitle(String courseSubtitle) {
        this.courseSubtitle = courseSubtitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Designer getDesigner() {
        return designer;
    }

    public void setDesigner(Designer designer) {
        this.designer = designer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<ProductClassification> getProductClassificationList() {
        return productClassificationList;
    }

    public void setProductClassificationList(List<ProductClassification> productClassificationList) {
        this.productClassificationList = productClassificationList;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        lastUpdated = new Date();
        if (dateCreated==null) {
            dateCreated = new Date();
        }
    }


}
