package com.tyc.Orienteering.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblsportclub")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SportClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String city;
}
