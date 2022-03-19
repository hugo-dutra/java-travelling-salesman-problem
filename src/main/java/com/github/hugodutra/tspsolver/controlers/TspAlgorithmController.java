package com.github.hugodutra.tspsolver.controlers;


import com.github.hugodutra.tspsolver.models.CoordenadasLocais;
import com.github.hugodutra.tspsolver.models.TspRequestParams;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/build-shortest-path")
@CrossOrigin //To developer mode
@RequiredArgsConstructor
public class TspAlgorithmController {

    @PostMapping
    public ResponseEntity<Object> buildShortestPath(@RequestBody Object pathParams){
        /*Gson gson = new Gson();
        TspRequestParams  tspRequestParams =  gson.fromJson(pathParams.toString(), TspRequestParams.class);
        System.out.println(pathParams);
        System.out.println(tspRequestParams);*/
        return ResponseEntity.ok(pathParams);
    }

}
