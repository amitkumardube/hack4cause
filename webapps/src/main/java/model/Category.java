package model;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "cat_name")
    private String catName;

    @Column(name = "cat_desc")
    private String catDesc;

    @Column(name = "cat_color")
    private String catColor;

}
