package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.pl.PESEL;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

enum Role
{
	USER,
    MANAGER,
    MODERATOR,
	ADMIN
}

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id  //PRIMARY KEY  == NOT NULL + UNIQUE
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Min(value = 10,message = "Vozrast doljen bit minimum 10")
    @Max(value = 100,message = "Vozrast doljen bit maximum 100")
    Integer age;


    @NotNull(message = "Ne mojet bit null")
    private String name;
    @NotEmpty(message = "Ne mojet bit pustim")// !=null i size > 0
    private String title;


    @NotBlank // !=null !="" != "            "
    @Size(min = 10,max = 20,message = "dizapazon doljen bit ot 10,20") // string , array , map, collection
    private String letter;
    @Length(min = 1 , max = 0)
    private String letter2;

    @Range(min = 0,max = 100,message = "Ocenka studenta doljno bit ot 0 - 100")
    private Integer score;


    @Size(min = 1,max = 5,message = "v spiske mojet bit ot 1 do 5 elemnta")
    private  List<String> phones;



    @DecimalMin(value = "0.0",message = "zarplata doljna bit bolse 0")
    private BigDecimal salary;


//    @Positive(message = "Balans doljen bit polojitelnim")
//    @PositiveOrZero(message = "Balans doljen bit polojitelnim") // >= 0
//    @Negative(message = "Balans doljen bit otricatelnim")
//    @NegativeOrZero(message = "Balans doljen bit otricatelnim")
    private Double balance;


//    @Email(message = "format ne vernoy",regexp = "^[a-z]$")
//    String email;

//    @AssertTrue(message = "Vi doljni prinyat ucastie")
//    @AssertFalse(message = "Vi doljni prinyat ucastie")
//    private Boolean termsAccepted;

//    @UniqueElements(message = "Elementi doljni bit unikalnimi")
//    List<String> phones2;


    @URL   // /12#$^*&^%$#@   ""
    String path;

//    @Past(message = "Data rojdenie doljno bit v proslom")
//    @PastOrPresent(message = "Data rojdenie doljno bit v proslom")
//    @Future(message = "Data rojdenie doljno bit v proslom")
//    @FutureOrPresent(message = "Data rojdenie doljno bit v proslom")
//    private LocalDate birthday;
//
//    private  LocalDate birthDate;
//
//    @Transient
//    private Integer age;
//
//
//    public Integer getAge() {
//       if (birthDate != null) {
//           return LocalDate.now().getYear() - birthDate.getYear();
//       }
//
//       return null;
//    }

    @Enumerated(EnumType.STRING)
    @Column(name = "role",length = 10)
    private Role role;

//    private static int count;
//    @Transient
//    private int age = LocalDate.now().getYear() - bithday.getYear();

    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;

//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDate bithday;//1996-21-01


    @Column(
//            name = "box",
//            length = 100,
//            nullable = false,
//            unique = true,
//            updatable = false,
//            insertable = true,
//            precision = 10,
//            scale = 2,
            columnDefinition = "VARCHAR(50)"



    )


    //char(10)   varchar(10)
    //nchar   nvarchar
    private String name;
}
