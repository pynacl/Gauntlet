package com.jellious.gauntlet.repository

import com.jellious.gauntlet.models.Character

class CharacterRepository : ICharacterRepository {
    private val characters = arrayListOf<Character>()

    override fun addCharacter(character: Character) {
        characters.add(character)
    }

    override fun getCharacter(name : String) : Character {
        return characters.first { it.name == name }
    }

    override fun getCharacters() : List<Character> {
        return characters
    }

    override fun getCharacters(characterFitler : List<Character>) : List<Character> {
        return characters.filter { characterFitler.contains(it) }
    }
}