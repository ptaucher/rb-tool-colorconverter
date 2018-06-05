package com.rball.tools;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColorConverterTest {

    @Test
    public void colorHex2Int() {
        assertEquals(-16777216, ColorConverter.colorHex2Int("000000"));
        assertEquals(-1, ColorConverter.colorHex2Int("FFFFFF"));
        assertEquals(-3355444, ColorConverter.colorHex2Int("CCCCCC"));
        assertEquals(-12303292, ColorConverter.colorHex2Int("444444"));
        assertEquals(-16776961, ColorConverter.colorHex2Int("0000FF"));
        assertEquals(-8847159, ColorConverter.colorHex2Int("7900C9"));
        assertEquals(-5393409, ColorConverter.colorHex2Int("ADB3FF"));
        assertEquals(-16711681, ColorConverter.colorHex2Int("00FFFF"));
        assertEquals(-65536, ColorConverter.colorHex2Int("FF0000"));
        assertEquals(-8388608, ColorConverter.colorHex2Int("800000"));
        assertEquals(-27392, ColorConverter.colorHex2Int("FF9500"));
        assertEquals(-18984, ColorConverter.colorHex2Int("FFB5D8"));
        assertEquals(-256, ColorConverter.colorHex2Int("FFFF00"));
        assertEquals(-5724160, ColorConverter.colorHex2Int("A8A800"));
        assertEquals(-16711936, ColorConverter.colorHex2Int("00FF00"));
        assertEquals(-16748544, ColorConverter.colorHex2Int("007000"));
    }

    @Test
    public void colorInt2Hex() {
        assertEquals("000000", ColorConverter.colorInt2Hex(-16777216));
        assertEquals("FFFFFF", ColorConverter.colorInt2Hex(-1));
        assertEquals("CCCCCC", ColorConverter.colorInt2Hex(-3355444));
        assertEquals("444444", ColorConverter.colorInt2Hex(-12303292));
        assertEquals("0000FF", ColorConverter.colorInt2Hex(-16776961));
        assertEquals("7900C9", ColorConverter.colorInt2Hex(-8847159));
        assertEquals("ADB3FF", ColorConverter.colorInt2Hex(-5393409));
        assertEquals("00FFFF", ColorConverter.colorInt2Hex(-16711681));
        assertEquals("FF0000", ColorConverter.colorInt2Hex(-65536));
        assertEquals("800000", ColorConverter.colorInt2Hex(-8388608));
        assertEquals("FF9500", ColorConverter.colorInt2Hex(-27392));
        assertEquals("FFB5D8", ColorConverter.colorInt2Hex(-18984));
        assertEquals("FFFF00", ColorConverter.colorInt2Hex(-256));
        assertEquals("A8A800", ColorConverter.colorInt2Hex(-5724160));
        assertEquals("00FF00", ColorConverter.colorInt2Hex(-16711936));
        assertEquals("007000", ColorConverter.colorInt2Hex(-16748544));
    }

    @Test
    public void isNotEmpty() {
        assertTrue(ColorConverter.isNotEmpty("foo"));
        assertTrue(ColorConverter.isNotEmpty(" "));
        assertFalse(ColorConverter.isNotEmpty(""));
        assertFalse(ColorConverter.isNotEmpty(null));
    }

    @Test
    public void isEmpty() {
        assertFalse(ColorConverter.isEmpty("foo"));
        assertFalse(ColorConverter.isEmpty(" "));
        assertTrue(ColorConverter.isEmpty(""));
        assertTrue(ColorConverter.isEmpty(null));
    }

    @Test
    public void isEmptyTrimFalse() {
        assertFalse(ColorConverter.isEmpty("foo", false));
        assertFalse(ColorConverter.isEmpty(" ", false));
        assertTrue(ColorConverter.isEmpty("", false));
        assertTrue(ColorConverter.isEmpty(null, false));
    }

    @Test
    public void isEmptyTrimTrue() {
        assertFalse(ColorConverter.isEmpty("foo", true));
        assertTrue(ColorConverter.isEmpty(" ", true));
        assertTrue(ColorConverter.isEmpty("", true));
        assertTrue(ColorConverter.isEmpty(null, true));
    }
}