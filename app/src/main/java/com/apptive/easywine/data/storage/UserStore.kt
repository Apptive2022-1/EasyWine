package com.apptive.easywine.data.storage


import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

val Context.dataStore by preferencesDataStore("user")

class UserStore @Inject constructor(@ApplicationContext context: Context) {
	private val store = context.dataStore

	suspend fun setToken(token: String) { store.edit { it[USER_TOKEN] = token } }
	fun getToken(): Flow<String> { return store.data.map { it[USER_TOKEN] ?: "token null" } }

	companion object {
		private val USER_TOKEN = stringPreferencesKey("token")
	}
}