package com.example.transaction.leetcode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Cascade({CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.LOCK, CascadeType.DELETE_ORPHAN, CascadeType.REFRESH, CascadeType.REMOVE })
    private int id;
    private String model;
    private Integer Speed;


}
