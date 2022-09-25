package com.tyc.Orienteering.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tblcompetitor")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    LocalDate birthDate;
    Long sportClubId;
}
