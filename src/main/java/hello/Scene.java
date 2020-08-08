package hello;
public class Scene{
    private Camera cam;
    private Light light;
    public Scene(Camera camera, Light lightsource){
        cam = camera;
        light = lightsource;
    }
    public float getFocal(){
        return cam.getFocal();
    }
    public float[] getLightPos(){
        return light.getPos();
    }
    public void setFocal(float newFocal){
        cam.setFocal(newFocal);
    }
    public void moveCamera(float[] translate){
        cam.movePosition(translate);
    }
    public void moveLight(float[] translate){
        light.movePos(translate);
    }
    public Camera getCamera(){
        return cam;
    }
    public Light getLight(){
        return light;
    }
}