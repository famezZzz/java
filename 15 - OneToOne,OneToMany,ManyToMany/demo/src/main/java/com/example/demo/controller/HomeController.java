package com.example.demo.controller;

import com.example.demo.model.MovieApiResponse;
import com.example.demo.model.Person;
import com.example.demo.model.SimpleCache;
import com.example.demo.services.ForRegistration;
import com.example.demo.services.MovieApiServices;
import com.example.demo.utils.RestUtils;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

//Bean
//Spring Container
//Spring Contex
//Dependency Injection (field , setter , contructor)


//@RestController ,@Controller     ->       dlya marsrut
//@Service                         ->       biznes loqiku
//@Repository                      ->       with db
//@Bean                            ->       object
//@Configuration                   ->       konfiquracionniy class
//@Component                       ->       vse ostalnoe


/// ///////////////////////////////////////////////////////////////////////////////////
///  Annotacii           //  Naznacenie                      //  Sloy               ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @Component          //  Universalniy Spring-komponent   //  Luboy              ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @Service            //  Biznes Loqika                   //  Service layer      ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @Repository         //  Raboda s BD                     //  Data Access Layer  ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @Controller         //  Web Controller (Views)          //  Presentation Laye  ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @RestController     //  REST API Controller (JSON)      //  Presentation Laye  ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @Configuration      //  Class confiquracii              //  Configuration      ///
/// ///////////////////////////////////////////////////////////////////////////////////
///  @Bean               //  Yavnoe sozdanie bean            //  Configuration      ///
/// ///////////////////////////////////////////////////////////////////////////////////

@RestController
@RequestMapping("/api/home")
public class HomeController {

    //    ForRegistration forRegistration;
    @Autowired
    ObjectFactory<ForRegistration> forRegistration;
    @Autowired
    MovieApiServices movieApiServices;

//    MovieApiServices movieApiServices = new MovieApiServices();
//    ForRegistration forRegistration = new ForRegistration();


//    @Autowired
//    ForRegistration forRegistration;
//    @Autowired
//    MovieApiServices movieApiServices;


    //    @Autowired
//    public void setForRegistration(ForRegistration forRegistration) {
//        this.forRegistration = forRegistration;
//    }
//    @Autowired
//    public void setMovieApiServices(MovieApiServices movieApiServices) {
//        this.movieApiServices = movieApiServices;
//    }

//    @Autowired
//    public HomeController(ForRegistration forRegistration, MovieApiServices movieApiServices) {
//        this.forRegistration = forRegistration;
//        this.movieApiServices = movieApiServices;
//    }

    @GetMapping("/search")
    public ResponseEntity<MovieApiResponse> search(
            @RequestParam String title,
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size // Dz
    ) {
        forRegistration.getObject().test();
        return movieApiServices.search(title, page, size);
    }


//    @GetMapping("/search")
//    public ResponseEntity<MovieApiResponse> search(
//            @RequestParam String title,
//            @RequestParam(required = false, defaultValue = "1") Integer page,
//            @RequestParam(required = false, defaultValue = "10") Integer size // Dz
//            ) {
//
//        MovieApiResponse cached = cache.get(title);
//        if (cached != null) {
//            System.out.println("Zapros iz KESHA : " + title);
//            return ResponseEntity.ok(cached);
//        }
//        System.out.println("Zapros iz API : " + title);
//        RestTemplate restTemplate = new RestTemplate();
//        MovieApiResponse result = new MovieApiResponse();
//        ResponseEntity<MovieApiResponse> response;
//
//
//        title = title.toUpperCase();
//        String url = "https://www.omdbapi.com/?s=" + title + "&apiKey=266b43cd&page=" + page;
//        System.out.println("Send request # 1");
//        response = restTemplate.getForEntity(url, MovieApiResponse.class);
//
//        if (response.getStatusCode().is2xxSuccessful()) {
//            result = response.getBody();
//
//            int totalResult = Integer.parseInt(result.totalResults);
//            int pages = (int) Math.ceil(totalResult / 10.0);
//
//            System.out.println("pages: " + pages);
//            System.out.println("totalResult: " + totalResult);
//
//            for (int i = 2; i <= pages; i++) {
//                url = "https://www.omdbapi.com/?s=" + title + "&apiKey=266b43cd&page=" + i;
//                System.out.println("Send request # " + i);
//                response = restTemplate.getForEntity(url, MovieApiResponse.class);
//                if (response.getStatusCode().is2xxSuccessful()) {
//                    MovieApiResponse body = response.getBody();
//                    result.search.addAll(body.search);
//
//                }
//            }
//        }
//
//        cache.put(title,result);
//        System.out.println("Save in cached!!!");
//
//        return ResponseEntity.ok(result);
//}

}
