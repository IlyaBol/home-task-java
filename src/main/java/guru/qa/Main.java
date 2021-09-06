package guru.qa;

public class Main {

    public static void main(String[] args) {
        BuildPc Pc1 = new BuildPc("Asus", 2, 12, 14, true, true);
        BuildPc Pc2 = new BuildPc("Dexp", 4, 24, 15, false, false);
        BuildPc Pc3 = new BuildPc("Hp", 6, 32, 16, true, true);
        BuildPc Pc4 = new BuildPc("Acer", 2, 32, 14, false, false);
        BuildPc Pc5 = new BuildPc("Dell", 4, 24, 15, false, true);
        BuildPc Pc6 = new BuildPc("lenovo", 6, 12, 16, true, false);
        BuildPc[] PcMass = new BuildPc[]{Pc1, Pc2, Pc3, Pc4, Pc5, Pc6};


        Pc1.showPcInfo(); // Вся информация о пк
        Pc2.ShowModel(); // Информация о модели
        Pc3.CoreStatus(); // Какой процессор имеет
        Pc4.BluetoothStatus(); // Имеет или нет блютуз
        Pc5.FingerStatus(); // Имеет ли сканер
        Pc6.CdSpeedStatus(); // Какая скорость диска
        Pc2.ShowMonitor(); // Размер монитора

    }

}



