package com.jellious.gauntlet.repository

import com.jellious.gauntlet.models.Character

interface ICharacterRepository {
    fun addCharacter(character : Character)
    fun getCharacter(name : String) : Character
    fun getCharacters() : List<Character>
    fun getCharacters(characterFitler : List<Character>): List<Character>
}