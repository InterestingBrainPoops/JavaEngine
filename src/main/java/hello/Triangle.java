package hello;
public class Triangle{
    float[] a,b,c,normal;
    public Triangle(float[] point1, float[] point2,float[] point3, float[] surfaceNormal){//points CW starting with the most top left one.
        a = point1;
        b = point2;
        c = point3;
        normal = surfaceNormal;
    }
    public void appTranslation(float[] translation){
        for(int x = 0; x<3; x++){
            a[x] += translation[x];
            b[x] += translation[x];
            c[x] += translation[x];
        }
    }
    //TODO:
    /**
     * for now, I need a function that can rotate it around a point, or a elementwise translator. but the main issue right know is that aparapi does not support 2d arrays.
     * the elementwise translator could easily just be a matrix elementwise addition scheme, but I could just extend the app translation to take in 2 more arguments and replace translation with translation a,b,c.
     */
}