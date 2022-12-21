package network

import com.squareup.moshi.Json

class MarsPhoto {
    data class MarsPhoto(
        @Json(name = "img_src") val imgSrcUrl: String
    )
}