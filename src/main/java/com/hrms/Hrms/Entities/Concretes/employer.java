package com.hrms.Hrms.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employer")
public class employer {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "email")
    private String email;

    @Column(name = "tel_no")
    private Long telNo;

    @Column(name = "password")
    private int password;

    @Column(name = "passwordr")
    private int passwordr;
}
