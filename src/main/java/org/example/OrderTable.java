package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class OrderTable {
    @Id
    private Long id;

    @Lob
    private String xmlContent;

    // Getters and setters
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getXmlContent(){
        return this.xmlContent;
    }
    public void setXmlContent(String xmlContent){
        this.xmlContent = xmlContent;
    }
}
