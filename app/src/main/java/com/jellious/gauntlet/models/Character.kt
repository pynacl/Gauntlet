package com.jellious.gauntlet.models

data class Character (
    var name: String,
    var race: String,
    var classType: String,
    var inventory : List<String>
)
