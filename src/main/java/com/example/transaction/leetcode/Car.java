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

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getId() == car.getId() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getSpeed(), car.getSpeed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getSpeed());
    }
}
