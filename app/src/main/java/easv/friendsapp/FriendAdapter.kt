package easv.friendsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import easv.friendsapp.model.BEFriend

class FriendAdapter(context: Context, private val friends: Array<BEFriend>) : ArrayAdapter<BEFriend>(context, 0, friends) {
    override fun getView(position: Int, v: View?, parent: ViewGroup): View {
        var v1: View? = v
        if (v1 == null) {
            val mInflater = LayoutInflater.from(context)
            v1 = mInflater.inflate(R.layout.cell, null)

        }
        val resView: View = v1!!
        //resView.setBackgroundColor(colours[position % colours.size])
        val f = friends[position]
        val nameView = resView.findViewById<TextView>(R.id.txtName)
        val phoneView = resView.findViewById<TextView>(R.id.txtPhone)
        val favoriteView = resView.findViewById<ImageView>(R.id.imgFavoriteExt)
        nameView.text = f.name
        phoneView.text = f.phone

        favoriteView.setImageResource(if (f.isFavorite) R.drawable.happy else R.drawable.angry)

        return resView
    }


}