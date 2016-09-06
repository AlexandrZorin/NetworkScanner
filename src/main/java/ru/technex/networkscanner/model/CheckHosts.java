package ru.technex.networkscanner.model;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

public class CheckHosts {
    private Map<String, String> IPMap = new HashMap<>(300);

    public String checkHosts(String subnet) {
        int timeout = 1100;

        for (int i = 1; i < 255; i++) {
            try {
                String host = subnet + "." + i;
                if (InetAddress.getByName(host).isReachable(timeout)) {
                    IPMap.put(host, InetAddress.getByName(host).getHostName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return IPMap.toString();
    }
}