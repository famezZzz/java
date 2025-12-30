package com.example.demo.utils;

import com.example.demo.model.MovieApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestUtils {

    private final Environment env;

    @Autowired
    public RestUtils(Environment env) {
        this.env = env;
    }

    //
//    @Value("${movie.api.key}")
//    private String apiKey;
//    @Value("${movie.api.base.url}")
//    private String baseUrl;
//    //    @Value("${movie.genres}")
////    private  String[] genres ;
//    @Value("${movie.genres}")
//    private List<String> genres;
//    @Value("${movie.ports}")
//    private int[] ports;
//    @Value("${movie.page.size:100}")
//    private int pageSize;
//    @Value("${movie.is.sort:false}")
//    private Boolean isSort;

    @Autowired
    @Qualifier("restTemplateLong")
    private RestTemplate restTemplate;


    private void test() {
//        boolean isDevProfileActive = env.acceptsProfiles("dev");
//        System.out.println("isDevProfileActive: " + isDevProfileActive);
//        String[] defaultProfiles = env.getDefaultProfiles();
//
//        for(String profile : defaultProfiles){
//            System.out.println(profile);
//        }

//        String[] activeProfiles = env.getActiveProfiles();
//
//        for(String profile : activeProfiles){
//            System.out.println(profile);
//        }
//        String apiKey = env.getProperty("movie.api.key");
//        String apiKey = env.getProperty("movie.api.key",String.class,"default");
//        if (env.containsProperty("movie.api.key")) {
//             apiKey = env.getProperty("movie.api.key");
//        }else{
//            apiKey = "default";
//        }
//        System.out.println("apiKey: " + apiKey);

//        String[] genres = new String[]{env.getProperty("movie.genres")};
//        System.out.println(isSort);
//        System.out.println(pageSize);
//        for (String genre : genres) {
//            System.out.println(genre);
//        }
//
//        for (Integer port : ports) {
//            System.out.println(port);
//        }
    }

    public ResponseEntity<MovieApiResponse> search(String title, Integer page, Integer size) {

        test();
        String baseUrl = env.getProperty("movie.api.base.url");
       String apiKey = env.getProperty("movie.api.key");
        String url = baseUrl + "?s=" + title + "&apiKey=" + apiKey + "&page=" + page;

//        System.out.println("Zapros iz API : " + title);

        MovieApiResponse result = new MovieApiResponse();
        ResponseEntity<MovieApiResponse> response;


        title = title.toUpperCase();

//        System.out.println("Send request # 1");
        response = restTemplate.getForEntity(url, MovieApiResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            result = response.getBody();

            int totalResult = Integer.parseInt(result.totalResults);
            int pages = (int) Math.ceil(totalResult / 10.0);
            for (int i = 2; i <= pages; i++) {
                url = "https://www.omdbapi.com/?s=" + title + "&apiKey=266b43cd&page=" + i;
//                System.out.println("Send request # " + i);
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
