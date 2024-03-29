package me.dio.simulator.data;

import java.util.List;

import retrofit2.Call;
import me.dio.simulator.domain.Match;
import retrofit2.http.GET;


public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
