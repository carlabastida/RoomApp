package com.example.roomapp.di

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomapp.data.RoomDB
import com.example.roomapp.data.mockData.MockData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Singleton
import android.content.Context
import com.example.roomapp.data.repositories.HeroeRepositoryImpl
import com.example.roomapp.domain.repositories.HeroeRepository
import com.example.roomapp.domain.use_cases.getHeroe
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Volatile
    private var INSTANCE : RoomDB? = null

    @Provides
    @Singleton
    fun provideRoomDB(
        @ApplicationContext context : Context
    ) : RoomDB{
        return INSTANCE ?: synchronized(this){
            val instance = INSTANCE
            if(instance != null){
                return instance
            }
            else{
                var callback = object : RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        CoroutineScope(Dispatchers.IO).launch {
                            val db = INSTANCE ?: return@launch
                            val heroeDao = db.HeroeDao()
                            heroeDao.insertHeroe(MockData.heroe)
                        }
                    }
                }
                return Room.databaseBuilder(context.applicationContext,
                    RoomDB::class.java,"room_DB")
                    .addCallback(callback).build().also {
                        INSTANCE = it
                    }
            }
        }
    }

    @Provides
    @Singleton
    fun provideHeroeRepository(db : RoomDB) :HeroeRepository{
        return HeroeRepositoryImpl(db.HeroeDao())
    }

    @Provides
    @Singleton
    fun provideGetHeroe(heroeRepository:HeroeRepository) : getHeroe{
        return getHeroe(heroeRepository)
    }
}