package com.competition.aftas.DTO;

import com.competition.aftas.domain.IdentityDocumentType;

import java.util.Date;

public class MemberDTO {
    private Integer num;
    private String name;
    private String familyName;
    private Date accessionDate;
    private String nationality;
    private IdentityDocumentType identityDocument;
    private String identityNumber;


    public MemberDTO() {
    }


    public MemberDTO(Integer num, String name, String familyName, Date accessionDate,
                     String nationality, IdentityDocumentType identityDocument, String identityNumber) {
        this.num = num;
        this.name = name;
        this.familyName = familyName;
        this.accessionDate = accessionDate;
        this.nationality = nationality;
        this.identityDocument = identityDocument;
        this.identityNumber = identityNumber;
    }

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
