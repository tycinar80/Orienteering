package com.tyc.Orienteering.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblmap")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String type;
    String city;
    String area;
    int distance;
}
