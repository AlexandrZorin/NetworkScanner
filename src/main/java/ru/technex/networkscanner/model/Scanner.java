package ru.technex.networkscanner.model;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private String scanner;
    private List<String> IPList = new ArrayList<>();

    public Scanner() {
    }

    public Scanner(String scanner) {
        this.scanner = scanner;
        checkHosts("192.168.101");
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    private String checkHosts(String subnet) {
        int timeout = 1000;

        for (int i = 1; i < 255; i++) {
            String host = subnet + "." + i;
            try {
                if (InetAddress.getByName(host).isReachable(timeout)) {
                    IPList.add(host);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return IPList.toString();
    }
}
