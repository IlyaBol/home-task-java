package guru.qa;

public class BuildPc {
    String model;
    int core;
    int CdSpeed;
    int MonitorSize;
    boolean Bluetooth;
    boolean Finger;
    String[] pcmodel = {"Asus", "Dexp", "Hp", "Acer", "Dell", "lenovo"};

    public BuildPc(String model, int core, int cdSpeed, int monitorSize, boolean bluetooth, boolean finger) {
        this.model = model;
        this.core = core;
        CdSpeed = cdSpeed;
        MonitorSize = monitorSize;
        Bluetooth = bluetooth;
        Finger = finger;

    }

    public void showPcInfo() {
        System.out.println("Модель: " + model + "\n"
                + "Скорость Диска: " + CdSpeed + "\n"
                + "Размер Монитора: " + MonitorSize + "\n"
                + "Блютуз: " + Bluetooth + "\n"
                + "Сканер Пальца: " + Finger + "\n"
        );
    }


    public void ShowModel() {
        System.out.println("Модель: " + model + "\n"
        );

    }

    public void ShowMonitor() {
        System.out.println(model + " " + "has" + " " + MonitorSize + " " + "inch.");
    }

    public void CoreStatus() {
        if (core >= 4) {
            System.out.println(model + ":Has fast core");
        } else {
            System.out.println(model + ":Has middle core");
        }

    }

    public void CdSpeedStatus() {
        if (CdSpeed >= 24) {
            System.out.println(model + ":Has fast CD");
        } else {
            System.out.println(model + ":Has slow CD");
        }

    }

    public void BluetoothStatus() {
        if (Bluetooth) {
            System.out.println(model + ":Has bluetooth");
        } else {
            System.out.println(model + ":Doesn't have bluetooth");
        }

    }

    public void FingerStatus() {
        if (Finger) {
            System.out.println(model + ":Has FingerScanner");
        } else {
            System.out.println(model + ":Doesn't have FingerScanner");
        }

    }

    void PcsettingsType() {
        int i = 0;
        while (i < pcmodel.length) {
            System.out.println(pcmodel[i]);
            i++;
        }
    }
}