package com.github.hugodutra.tspsolver.controlers;
import com.github.hugodutra.tspsolver.models.Pontos;
import com.github.hugodutra.tspsolver.models.TspRequestParams;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/build-shortest-path")
@CrossOrigin //To developer mode
@RequiredArgsConstructor
public class TspAlgorithmController {

    @PostMapping
    public ResponseEntity<TspRequestParams> buildShortestPath(@RequestBody TspRequestParams pathParams) throws InterruptedException {
        TspRequestParams tspRequestParams = new TspRequestParams();
        List<Pontos> pontos = Arrays.asList(pathParams.getPontos()).stream().sorted((a, b) -> (a.x > b.x) ? 1 : -1).collect(Collectors.toList());
        pathParams.setPontos(pontos.toArray(new Pontos[pontos.size()]));
        TimeUnit.SECONDS.sleep(3);//Delay simulation
        return ResponseEntity.ok(pathParams);
    }

}
