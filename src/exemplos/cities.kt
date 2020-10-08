package exemplos

import java.util.*
import kotlin.collections.HashMap

class Cities(var cityId: String, var country: String, var name: String, var searchName: String,
             var stateShort: String, var stateName:String) {
    constructor() : this("", "", "", "", "", "")
}

class Notifications(var title: String, var message: String, var seen: Boolean, var createdAt: Date?) {
    constructor() : this("", "", false, null)
}

class Ratings(var ratingId: String, var authorId: String, var tourId: String, var tourCommentary: String, var guideId: String,
              var guideCommentary: String, val tourRating: Int, var guideRating: Int, val createdAt: Date?, val spotIdList: List<String>?,
              var spotCommentaryList: List<String>?, val spotRatingList: List<Int>?) {
    constructor() : this("", "", "", "", "", "", 0,
            0, null, null, null, null)
}

class Spots(val name: String, val searchName: String, val cityId: String, val cityName: String, val category: String,
            val categoryId: String, val spotId: String, val address: String, val imagesUrl: MutableList<String>?, val lastSchedule: Date?,
            val ratingCount: Int, val ratingTotal: Int, val ratingNumber: Float, val ratingCountList: MutableMap<String, Int>?) {
    constructor() : this("", "", "", "", "", "", "", "",
            null, null, 0, 0, 0f, null)
}

class Tours(var tourName: String, var tourId: String, var cityId: String, var cityName: String, var tourCountry: String,
            var guideId: String, var guideName: String, var meetingPoint: String, var howToGet: String, var about: String,
            var provided: String, var notProvided: String, var toBring: String, var warning: String, var status: String,
            var timeDoingTour: Int, var timeLivingRegion: Int, var price: Int, var duration: Int, var minimumAge: Int,
            var minimumPhysicalActivity: Int, var minNumberParticipants: Int, var maxNumberParticipants: Int, var transport: Int,
            var ratingCount: Int, var ratingTotal: Int, var ratingNumber: Int, var lastSchedule: Date?, var createdAt: Date?,
            var spotsList: List<String>?, var spotsNameList: MutableList<String>?, var languagesList: MutableList<String>?,
            var imagesUrl: MutableList<String>?, var categoryIdList: MutableList<String>?, var schedulesHours: List<Int>?,
            var schedules: List<Date>?, var handicapped: Boolean, var ratingCountList: HashMap<String, Int>?) {

    constructor() : this("", "", "", "", "", "", "", "", "", "",
            "", "", "", "", "", 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0,
            null, null, null, null, null, null, null,
            null, null, false, null)
}

data class Users(var userId: String, var firstName: String, var lastName: String, var email: String, var cellphoneArea: String,
                 var cellphoneNumber: String, var imageUrl: String, var about: String, var liveWhere: String, var password: String,
                 var cellphoneCountry: String, var documentNumber: String, var createdAt: Date?, var dateOfBirth: Date?) {
    constructor() : this("", "", "", "", "", "", "", "", "", "",
            "", "", null, null)
}