package hello;
public class Camera{
    private int[] res;
    private float focusLen;
    private float[] dir;
    private float [] pos;
    public Camera(int[] Resolution, float focalLength, float[] direction, float[] position){
        res = Resolution;
        focusLen = focalLength;
        dir = direction;
        pos = position;
    }
    public int[] getRes(){
        return res;
    }
    public float getFocal(){
        return focusLen;
    }
    public float[] getDirection(){
        return dir;
    }
    public float[] getPosition(){
        return pos;
    }
    public void setFocal(float newFocal){
        focusLen = newFocal;//need to add the update clause to update the focal point itself, but I'm not in the mood to do the math.
    }
    public void setDirection(float[] newDirection){
        dir = newDirection; // same here
    }
    public void setPosition(float[] newPos){
        pos = newPos;
    }
    public void movePosition(float[] newPos){
        for(int x = 0; x<3; x++){
            pos[x]+= newPos[x];
        }
    }
    public void setRes(int[] newResolution){
        res = newResolution;
    }
    
}