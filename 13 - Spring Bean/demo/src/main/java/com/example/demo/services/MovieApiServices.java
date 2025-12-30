package com.example.demo.services;

import com.example.demo.model.MovieApiResponse;
import com.example.demo.model.SimpleCache;
import com.example.demo.utils.RestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieApiServices {

    @Autowired
    private SimpleCache cache;
    @Autowired
    private RestUtils restUtils;

    public ResponseEntity<MovieApiResponse> search( String title,  Integer page,  Integer size ) {
        MovieApiResponse cached = cache.get(title);
        if (cached != null) {
            System.out.println("Zapros iz KESHA : " + title);
            return ResponseEntity.ok(cached);
        }
        var result = restUtils.search(title, page, size);
        cache.put(title,result.getBody());
        System.out.println("Save in cached!!!");

        return result;
    }
}
