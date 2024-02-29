package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaNotasTest {
    @Test
    public void mediaFinal() {
        MediaNotas media = new MediaNotas();
        media.CalculandoMedia();
        assertEquals(media, 7.5);
    }

}