package com.example.jpapractice.JPA;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "StudentInfo")
public class Student {
    private int Id;
    @Id
    private String name;
    private String className;
//    @ElementCollection
//    public List<Book> book = new ArrayList<>();
    @Embedded
    public Book book;
}
