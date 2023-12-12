package com.competition.aftas.domain;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Builder
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


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Date getAccessionDate() {
        return accessionDate;
    }

    public void setAccessionDate(Date accessionDate) {
        this.accessionDate = accessionDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public IdentityDocumentType getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocumentType identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }


}
