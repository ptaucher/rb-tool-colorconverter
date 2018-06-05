package com.rball.tools;

import java.awt.*;

/**
 * ColorConverter</b>
 * Usage:<br/
 * java ColorConverter int2hex -16777216<br/>
 * java ColorConverter hex2int FF0000<br/>
 */
public class ColorConverter {

    public ColorConverter() {
        // Empty default constructor
    }

    public static void main(String... args) {
        boolean usage = false;
        if (args.length > 0) {
            int i;
            if ("int2hex".equals(args[0])) {
                if (args.length < 2) {
                    usage = true;
                } else {
                    for (i = 1; i < args.length; ++i) {
                        System.out.println(args[i] + "=" + colorInt2Hex(Integer.valueOf(args[i])));
                    }
                }
            } else if ("hex2int".equals(args[0])) {
                if (args.length < 2) {
                    usage = true;
                } else {
                    for (i = 1; i < args.length; ++i) {
                        System.out.println(args[i] + "=" + colorHex2Int(args[i]));
                    }
                }
            } else {
                usage = true;
            }
        } else {
            usage = true;
        }

        if (usage) {
            System.out.println("Usage:");
            System.out.println("\t java ColorConverter int2hex -16777216 ");
            System.out.println("\t java ColorConverter hex2int FF0000 ");
        }

    }

    public static int colorHex2Int(String colorCode) {
        try {
            if (isNotEmpty(colorCode)) {
                if (!colorCode.startsWith("#")) {
                    colorCode = "#" + colorCode;
                }

                Color color = Color.decode(colorCode);
                return color.getRGB();
            }
        } catch (Exception var2) {
            System.out.println("Error while converting [" + colorCode + "] from hex to int value. " + var2);
        }

        return -1;
    }

    public static String colorInt2Hex(int colorValue) {
        StringBuilder hex = new StringBuilder();

        try {
            Color color = new Color(colorValue, false);
            String r = Integer.toHexString(color.getRed());
            String g = Integer.toHexString(color.getGreen());
            String b = Integer.toHexString(color.getBlue());
            if (r.length() < 2) {
                hex.append("0");
            }

            hex.append(r);
            if (g.length() < 2) {
                hex.append("0");
            }

            hex.append(g);
            if (b.length() < 2) {
                hex.append("0");
            }

            hex.append(b);
        } catch (Exception var6) {
            System.out.println("Error while converting [" + colorValue + "] from int to hex value. " + var6);
        }

        return hex.toString().toUpperCase();
    }

    public static boolean isNotEmpty(String str) {
        return str != null && str.length() > 0;
    }

    public static boolean isEmpty(String str) {
        return isEmpty(str, false);
    }

    public static boolean isEmpty(String str, boolean trim) {
        boolean result;
        if (str != null) {
            if (trim && str.trim().length() == 0) {
                result = true;
            } else if (str.length() == 0) {
                result = true;
            } else {
                result = false;
            }
        } else {
            result = true;
        }
        return result;
    }
}
