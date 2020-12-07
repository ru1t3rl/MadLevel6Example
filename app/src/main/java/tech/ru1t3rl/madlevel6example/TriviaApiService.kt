package tech.ru1t3rl.madlevel6example

import retrofit2.http.GET

interface TriviaApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}
