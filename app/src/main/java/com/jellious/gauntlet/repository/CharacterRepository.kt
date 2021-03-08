package com.jellious.gauntlet.repository

import com.jellious.gauntlet.models.Character

class CharacterRepository {
    private val characters = arrayListOf<Character>()

    fun addCharacter(character: Character) {
        characters.add(character)
    }

    fun getCharacter(name : String) : Character {
        return characters.first { it.name == name }
    }

    fun getCharacters() : List<Character> {
        return characters
    }

    fun getCharacters(characterFitler : List<Character>) : List<Character> {
        return characters.filter { characterFitler.contains(it) }
    }
}