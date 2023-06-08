package pl.coderslab.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Isbn can not be blank")
    @Size(min = 3, message = "At least 3 characters needed")
    private String isbn;

    @NotBlank(message = "Title can not be blank")
    @Size(min = 3, message = "At least 3 characters needed")
    private String title;

    @NotBlank(message = "Author can not be blank")
    @Size(min = 3, message = "At least 3 characters needed")
    private String author;

    @NotBlank(message = "Publisher can not be blank")
    @Size(min = 3, message = "At least 3 characters needed")
    private String publisher;

    @NotBlank(message = "Description can not be blank")
    @Size(max = 600 , message = "Can not be more than 600 characters")
    private String description;

}
