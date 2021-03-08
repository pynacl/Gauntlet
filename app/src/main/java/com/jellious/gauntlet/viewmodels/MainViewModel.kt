package com.jellious.gauntlet.viewmodels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.jellious.gauntlet.models.Character
import com.jellious.gauntlet.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    fun addCharacter(character: Character) {
        characterRepository.addCharacter(character)
    }

    fun getCharacter(name : String) : Character {
        return characterRepository.getCharacter(name)
    }

    fun getCharacters(): List<Character> {
        return characterRepository.getCharacters()
    }

    fun getCharacter(namesFilter : List<String>) {
        getCharacter(namesFilter)
    }
}
