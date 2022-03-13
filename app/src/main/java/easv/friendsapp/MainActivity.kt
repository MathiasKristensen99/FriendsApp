package easv.friendsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import easv.friendsapp.repository.FriendsRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = FriendAdapter(this, FriendsRepository().getAll())

        val lvFriends = this.findViewById<ListView>(R.id.lvFriends)
        lvFriends.adapter = adapter
        lvFriends.setOnItemClickListener { adapterView, view, position, id ->
            val i = Intent(this, FriendDetailActivity::class.java)
            startActivity(i)
        }
    }
}