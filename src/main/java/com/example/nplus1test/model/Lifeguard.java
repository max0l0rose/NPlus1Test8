package com.example.nplus1test.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@ToString(of = "name")
public class Lifeguard extends BaseEntity {

    @ManyToOne(
//            fetch = FetchType.LAZY
    )
    //@JoinColumn
    private Beach beach;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    //@JoinColumn
    private Lifeguard boss;

    private String name;

    private Integer speed;

}
