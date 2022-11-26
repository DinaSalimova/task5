package com.university.task5University;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "table_counter")
public class TableCounter {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="date_time")
    private String dateTime;

    @Column(name="client_info")
    private String clientInfo;

    @Column(name="count_value")
    private Integer countValue;

}
