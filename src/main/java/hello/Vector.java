package hello;

public class Vector{
    
    public static float Dot(float[] vec1, float[] vec2){//Dot Product
        float ret = vec1[0]*vec2[0]+vec1[1]*vec2[1]+vec1[2]*vec2[2];
        return ret;
    }
    public static float[] Cross(float[] vec1, float[] vec2){//Cross Product
        float[] ret = {vec1[1]*vec2[2]-vec1[2]*vec2[1],vec1[2]*vec2[0]-vec1[0]*vec2[2],vec1[0]*vec2[1]-vec1[1]*vec2[0]};
        return ret;
    }
    public static float[] Sub(float[] vec1, float[] vec2){//Elementwise Subtraction
        float[] ret = {vec1[0]-vec2[0],vec1[1]-vec2[1],vec1[2]-vec2[2]};
        return ret;
    }
    public static float[] Add(float[] vec1, float[] vec2){//Elementwise addition
        float[] ret = {vec1[0]+vec2[0],vec1[1]+vec2[1],vec1[2]+vec2[2]};
        return ret;
    }
}