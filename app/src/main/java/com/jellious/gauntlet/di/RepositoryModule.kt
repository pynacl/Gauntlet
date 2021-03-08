package com.jellious.gauntlet.di

import com.jellious.gauntlet.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepostitoryModule {

    @Singleton
    @Provides
    fun provideMainRepositry() : CharacterRepository {
        return CharacterRepository()
    }
}