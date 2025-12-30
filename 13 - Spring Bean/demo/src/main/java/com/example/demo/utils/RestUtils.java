package com.example.demo.utils;

import com.example.demo.model.MovieApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestUtils {

    private  String apiKey = "266b43cd";
    private  String baseUrl = "https://www.omdbapi.com/";

    @Autowired
    @Qualifier("restTemplateLong")
    private RestTemplate restTemplate;

    public ResponseEntity<MovieApiResponse> search( String title, Integer page, Integer size ) {
        String url = baseUrl + "?s=" + title + "&apiKey="+apiKey+"&page=" + page;

        System.out.println("Zapros iz API : " + title);

        MovieApiResponse result = new MovieApiResponse();
        ResponseEntity<MovieApiResponse> response;


        title = title.toUpperCase();

        System.out.println("Send request # 1");
        response = restTemplate.getForEntity(url, MovieApiResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            result = response.getBody();

            int totalResult = Integer.parseInt(result.totalResults);
            int pages = (int) Math.ceil(totalResult / 10.0);
            for (int i = 2; i <= pages; i++) {
                url = "https://www.omdbapi.com/?s=" + title + "&apiKey=266b43cd&page=" + i;
                System.out.println("Send request # " + i);
                response = restTemplate.getForEntity(url, MovieApiResponse.class);
                if (response.getStatusCode().is2xxSuccessful()) {
                    MovieApiResponse body = response.getBody();
                    result.search.addAll(body.search);

                }
            }
        }

        return ResponseEntity.ok(result);
    }
}
