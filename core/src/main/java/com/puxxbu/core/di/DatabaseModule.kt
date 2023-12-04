package com.puxxbu.core.di

import android.content.Context
import androidx.room.Room
import com.puxxbu.core.data.source.local.room.PokemonDao
import com.puxxbu.core.data.source.local.room.PokemonDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): PokemonDatabase {
        val passphrase: ByteArray = SQLiteDatabase.getBytes("pokepedia".toCharArray())
        val factory = SupportFactory(passphrase)
        return Room.databaseBuilder(
            context,
            PokemonDatabase::class.java,
            "Pokemon.db"
        ).fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }


    @Provides
    fun providePokemonDao(database: PokemonDatabase): PokemonDao = database.pokemonDao()
}