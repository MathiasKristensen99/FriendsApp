package easv.friendsapp.model

import java.io.Serializable

data class BEFriend(var name: String, var phone: String, var isFavorite: Boolean, var address: String, var image: String): Serializable
