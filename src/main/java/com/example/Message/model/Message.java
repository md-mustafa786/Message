package com.example.Message.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "message_tbl")
public class Message {
    @Id
    private Integer id;
    private String name;

    private String Description;
    private Timestamp createdDate;

}
