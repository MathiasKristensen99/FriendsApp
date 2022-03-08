package easv.friendsapp

import android.content.Context
import android.widget.ArrayAdapter
import easv.friendsapp.model.BEFriend

class FriendAdapter(context: Context, private val friends: Array<BEFriend>) : ArrayAdapter<BEFriend>(context, 0, friends) {

}