interface RemoteControlAccess{
    public void  powerOff();
    public void  powerOn();
    public void VolumeOn() ;
    public void VolumeOff() ;
}
class TV implements RemoteControlAccess{
    public void powerOff(){
        System.out.println("TV's power is off");
    }
    public void powerOn(){
    System.out.println("TV's power is on");
    }
    public void VolumeOff(){
         System.out.println("TV's Volume is off");
    }
    public void VolumeOn(){
         System.out.println("TV's Volume is on");
    }
}
class Stereo implements RemoteControlAccess{
    public void powerOff(){
         System.out.println("Stereo's power is off");
    }
    public void powerOn(){
    System.out.println("Stereo's power is on");
    }
    public void VolumeOff(){
         System.out.println("Stereo's volume is off");
    }
    public void VolumeOn(){
         System.out.println("Stereo's volume is on");
    }
}
public class re {
    public static void main(String[] args) {
        TV t= new TV();
        t.powerOff();
        Stereo s= new Stereo();
        s.powerOff();
    }
}
