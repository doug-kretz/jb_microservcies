package io.javabrains.ratingdataservice.resources;

import io.javabrains.ratingdataservice.models.Rating;
import io.javabrains.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }


    @RequestMapping("/users/{userId}")
    public UserRating getRatings(@PathVariable("userId") String userId){
        List ratings = Arrays.asList(
            new Rating("12345", 4),
            new Rating("5678", 5)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);

        return userRating;
    }
}
