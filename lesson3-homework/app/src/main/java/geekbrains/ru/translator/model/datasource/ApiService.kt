package geekbrains.ru.translator.model.datasource

import geekbrains.ru.translator.model.data.DataModel
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/v2/entries/en/{word}")
    fun searchAsync(@Path("word") wordToSearch: String): Deferred<List<DataModel>>
}
