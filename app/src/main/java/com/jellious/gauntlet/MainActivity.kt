package com.jellious.gauntlet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.jellious.gauntlet.models.Character
import com.jellious.gauntlet.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create dummy inventory list
        val inventory = listOf("Hood", "Silver dagger", "Leather pants", "Deer skin boots")

        // add character via view model with injected repository
        viewModel.addCharacter(Character("Ragnar","Ogre", "Rogue", inventory))

        // retrieve character from injected repository
        val selectedCharacter = viewModel.getCharacter("Ragnar")

        // show our character successfully passed through the repository
        text.text = selectedCharacter.toString()
    }
}
