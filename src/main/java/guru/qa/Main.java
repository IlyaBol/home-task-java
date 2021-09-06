package guru.qa;

public class Main {

    public static void main(String[] args) {
        BuildPc Pc1 = new BuildPc("Asus", 2, 12, 14, true, true);
        BuildPc Pc2 = new BuildPc("Dexp", 4, 24, 15, false, false);
        BuildPc Pc3 = new BuildPc("Hp", 6, 32, 16, true, true);
        BuildPc Pc4 = new BuildPc("Acer", 2, 32, 14, false, false);
        BuildPc Pc5 = new BuildPc("Dell", 4, 24, 15, false, true);
        BuildPc Pc6 = new BuildPc("lenovo", 6, 12, 16, true, false);


        Pc1.showPcInfo();
        Pc2.ShowModel();
        Pc3.CoreStatus();
        Pc4.BluetoothStatus();
        Pc5.FingerStatus();
        Pc6.CdSpeedStatus();
        Pc2.ShowMonitor();
        Pc1.PcsettingsType();


    }

}



