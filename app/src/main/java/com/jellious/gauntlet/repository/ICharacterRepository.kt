package com.jellious.gauntlet.repository

import com.jellious.gauntlet.models.Character

interface ICharacterRepository {
    fun addCharacter(character : Character)
    fun getCharacter(name : String) : Character
}