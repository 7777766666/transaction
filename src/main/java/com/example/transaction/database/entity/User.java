package com.example.transaction.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User implements BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;


    @Column(name = "birth_date", unique = true, nullable = false)
    private LocalDate birthDate;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    List<UserChat> userChats = new ArrayList<>();


    @Override
    public void setID(Long id) {
        this.id = id;
    }
    @Override
    public Long getId() {
        return id;
    }

    public List<UserChat> getUserChats() {
        return userChats;
    }

}
