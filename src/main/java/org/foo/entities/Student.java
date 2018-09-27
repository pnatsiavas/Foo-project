package org.foo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
 
    @Id
    private long id;
     
    private String first_name;
    
    private String last_name;
     
}
