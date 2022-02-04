package nearside.interview.android.ui.main

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.util.Base64
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.ViewModel
import java.io.ByteArrayOutputStream

const val IMAGE_URL = "https://picsum.photos/25?grayscale"

class MainViewModel : ViewModel() {


}

private fun Drawable?.drawableToBytes(): ByteArray {
    val bitmap = this?.toBitmap(25, 25) ?: return byteArrayOf()
    val bytes = ByteArrayOutputStream(bitmap.allocationByteCount).use {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 75, it)
        it.toByteArray()
    }
    bitmap.recycle()
    return bytes
}

private fun ByteArray.bytesToHexString() = joinToString(separator = "") { "%02x".format(it) }
private fun ByteArray.toBase64() = Base64.encodeToString(this, Base64.DEFAULT)