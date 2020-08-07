package hello;
public class Light{
    private float intensity;
    private float[] pos;
    public Light(float brightness, float[] position){
        intensity = brightness;
        pos = position;
    }
    public float[] getPos(){
        return pos;
    }
    public void setPos(float[] newPos){
        for(int x = 0; x <3; x++){
            pos[x] = newPos[x];
        }
    }
    public float getBrightness(){
        return intensity;
    }
    public void setBrightness(float Brightness){
        intensity = Brightness;
    }
}