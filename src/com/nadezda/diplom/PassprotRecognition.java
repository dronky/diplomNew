package com.nadezda.diplom;

import com.asprise.ocr.Ocr;

import java.io.File;

/**
 * Created by Sinky on 03.05.2017.
 */
public class PassprotRecognition {
    private void main(){
        Ocr.setUp(); // one time setup
        Ocr ocr = new Ocr(); // create a new OCR engine
        ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
        String s = ocr.recognize(new File[] {new File("test.png")},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT); // PLAINTEXT | XML | PDF | RTF
        System.out.println("Result: " + s);
        ocr.stopEngine();
    }
}
