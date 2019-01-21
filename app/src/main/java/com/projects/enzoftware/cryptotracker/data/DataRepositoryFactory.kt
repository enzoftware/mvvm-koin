package com.projects.enzoftware.cryptotracker.data

class DataRepositoryFactory constructor(
        private val localDataRepository: DataRepository,
        private val remoteDataRepository: DataRepository
) {
    fun retriveRemoteSource(): DataRepository {
        return remoteDataRepository
    }
    fun retrieveLocalSource(): DataRepository {
        return localDataRepository
    }
}