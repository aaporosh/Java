
interface Playable {
  void play();
}
class Football implements Playable {
  public void play() {
    System.out.println("Playing football");
  }
}
class cricket implements Playable {
    public void play() {
        System.out.println("Playing cricket");
    }
}
public class games {
    public static void main(String[] args) {
        Football foot = new Football();
        cricket cir= new cricket();
        foot.play();
        cir.play();
    }
}
