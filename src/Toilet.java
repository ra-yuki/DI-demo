public class Toilet {
    private ToiletObject toiletObject;

    public Toilet(ToiletObject toiletObj){
        this.toiletObject = toiletObj;
    }

    public void flush(){
        toiletObject.flush();
    }
}
