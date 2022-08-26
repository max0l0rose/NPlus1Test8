package com.example.nplus1test.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@ToString(of = "name")
public class Beach extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "beach"
            //, fetch = FetchType.EAGER
    )
    //@Fetch(FetchMode.SUBSELECT)
    @BatchSize(size = 2)
    private List<Lifeguard> lifeguards;
}


