package com.hrms.Hrms.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification")
public class verification {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "mernis_verification")
    private boolean mernisVerification;

    @Column(name = "email_verification")
    private boolean emailVerification;

    @Column(name = "admin_verification")
    private boolean adminVerification;

    @Column(name = "verification_id")
    private int verificationId;

}
