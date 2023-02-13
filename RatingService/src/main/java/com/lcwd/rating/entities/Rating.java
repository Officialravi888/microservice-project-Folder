package com.lcwd.rating.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_rating")
public class Rating {
    @Id
    private int ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
