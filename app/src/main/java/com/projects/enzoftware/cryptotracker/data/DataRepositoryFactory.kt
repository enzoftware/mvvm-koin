package com.projects.enzoftware.cryptotracker.data

class DataRepositoryFactory constructor(
        private val localDataRepository: LocalDataRepository,
        private val remoteDataRepository: RemoteDataRepository
) {
    fun retriveRemoteSource(): DataRepository {
        return remoteDataRepository
    }
    fun retrieveLocalSource(): DataRepository {
        return localDataRepository
    }
}