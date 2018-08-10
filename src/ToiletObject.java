public class ToiletObject {
    protected String name; //protected アクセス修飾子　privateとpublicの中間→ToiletPaperとShitは見れる

    public ToiletObject(){
        name = "none";
    }

    public void flush(){
        System.out.println("--------------------------flushed " + name);
    }
}

/* 親と子の関係を設けることで、nameを複数に渡せる。*/