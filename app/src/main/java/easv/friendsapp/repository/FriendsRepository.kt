package easv.friendsapp.repository

import easv.friendsapp.model.BEFriend

class FriendsRepository {
    val friends = arrayOf<BEFriend>(
        BEFriend("Julian", "123", false, "wdad", ""),
        BEFriend("Christian", "1234", true, "wjd", ""),
        BEFriend("Mathias", "12345", true, "wdjawop", ""),
    )

    fun getAll():Array<BEFriend> = friends

}