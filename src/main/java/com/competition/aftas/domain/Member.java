package com.competition.aftas.domain;
import jakarta.persistence.*;


import java.util.Date;
import java.util.Set;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num;
    private String name;
    private String familyName;
    private Date accessionDate;
    private String nationality;
    private IdentityDocumentType identityDocument;
    private String identityNumber;
    @OneToMany(mappedBy = "member")
    private Set<Hunting> huntings;

}
