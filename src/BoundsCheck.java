public class BoundsCheck {

    /*
        Schreiben Sie eine Methode, die folgende int-Werte übergeben bekommt:
        x: x-Koordinate eines Punktes
        y: y-Koordinate eines Punktes
        w: Breite eines Canvas
        h: Höhe eines Canvas
        Die Methode soll true zurückgeben, wenn der Punkt außerhalb des Canvas liegt.
    */
    public static boolean intsBoundsCheck(int x, int y, int w, int h) {
        return true;
    }

    public static void main(String[] args) {
        int w = 20;
        int h = 20;

        int x1 = 10;
        int y1 = 15;
        boolean test1 = intsBoundsCheck(x1, y1, w, h);

        int x2 = 21;
        int y2 = 10;
        boolean test2 = intsBoundsCheck(x2, y2, w, h);

        if(test1 && !test2) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your boundscheck is not corrent.");
        }
    }
}
