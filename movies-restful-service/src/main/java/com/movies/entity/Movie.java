package com.movies.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ApiModelProperty("Represents the ID which is unique to a movie")
    private Long movie_id;
    @ApiModelProperty("Represents name of a  movie")
    private String name;
    @ApiModelProperty("Represents the year the movie got released")
    private Integer year;
    @ApiModelProperty("Represents the cast of the movie")
    private String cast;
    @ApiModelProperty("Represents the release date of the movie")
    private LocalDate release_date;
}
