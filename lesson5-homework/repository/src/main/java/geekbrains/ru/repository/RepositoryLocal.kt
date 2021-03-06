package geekbrains.ru.repository

import geekbrains.ru.model.data.AppState

interface RepositoryLocal<T> : Repository<T> {

    suspend fun saveToDB(appState: AppState)
}
