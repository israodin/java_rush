package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types)
    {
        ImageReader reader = null;

            if (types==ImageTypes.JPG) {
                reader = new JpgReader();
            } else if (types==ImageTypes.PNG) {
                reader = new PngReader();
            } else if (types==ImageTypes.BMP) {
                reader = new BmpReader();
            }else
            {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }


        return reader;
    }
}
