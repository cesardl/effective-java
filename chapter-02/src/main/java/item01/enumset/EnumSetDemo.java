package item01.enumset;

import java.util.EnumSet;
import java.util.Set;

/**
 * Simple Java Program to demonstrate how to use EnumSet. It has some
 * interesting use cases and it's specialized collection for Enumeration types.
 * Using Enum with EnumSet will give you far better performance than using Enum
 * with HashSet, or LinkedHashSet.
 *
 * @author Javin Paul
 * @see <a href="http://javarevisited.blogspot.com/2014/03/how-to-use-enumset-in-java-with-example.html">How to use EnumSet in Java with Example</a>
 */
public class EnumSetDemo {

    public static void main(String args[]) {
        // this will draw line in yellow color
        EnumSet<Color> yellow = EnumSet.of(Color.RED, Color.GREEN);
        drawLine(yellow);
        // RED + GREEN + BLUE = WHITE
        EnumSet<Color> white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        drawLine(white);
        // RED + BLUE = PINK
        EnumSet<Color> pink = EnumSet.of(Color.RED, Color.BLUE);
        drawLine(pink);
    }

    public static void drawLine(Set<Color> colors) {
        System.out.println("Requested Colors to draw lines : " + colors);
        for (Color c : colors) {
            System.out.println("drawing line in color : " + c + ", RGB: " + c.rgb());
        }
    }

    private enum Color {
        RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
        private int r;
        private int g;
        private int b;

        Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public String rgb() {
            return "(" + r + ", " + g + ", " + b + ")";
        }

    }

}
