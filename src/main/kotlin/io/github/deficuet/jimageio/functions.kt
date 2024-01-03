package io.github.deficuet.jimageio

import ar.com.hjg.pngj.FilterType
import it.geosolutions.imageio.plugins.png.PNGWriter
import java.awt.image.BufferedImage
import java.io.File
import java.io.FileOutputStream

fun BufferedImage.savePng(path: File, compressionLevel: Int = 7): BufferedImage {
    FileOutputStream(path).use { output ->
        PNGWriter().writePNG(
            this, output, (9f - compressionLevel) / 9f,
            FilterType.FILTER_DEFAULT
        )
    }
    return this
}
