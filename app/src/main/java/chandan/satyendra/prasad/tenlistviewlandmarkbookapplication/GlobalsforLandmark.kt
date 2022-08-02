package chandan.satyendra.prasad.tenlistviewlandmarkbookapplication

import android.graphics.Bitmap


class GlobalsforLandmark {
    companion object Chosen {
        var chosenImage: Bitmap? = null
        fun returnImage(): Bitmap {
            return chosenImage!!
        }
    }
}
