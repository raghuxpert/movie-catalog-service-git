package com.raghav.moviecatalogservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghav.moviecatalogservice.model.MovieCatalog;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@RequestMapping("/{userId}")
	public MovieCatalog getMovieCatalog(@PathVariable ("userId") String userId) {
		if (userId.equals("Raghav"))
		return new MovieCatalog("X001", "Titanic" , "Romantic movie");
		else 
			return new MovieCatalog("X002", "Mela" , "faltu movie");
	}

}
