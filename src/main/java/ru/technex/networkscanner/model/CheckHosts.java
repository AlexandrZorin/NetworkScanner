package ru.technex.networkscanner.model;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Set;

public class CheckHosts {
    private Set<String> IPSet = new HashSet<>(300);

    public String checkHosts(String subnet) {
        int timeout = 1500;

        for (int i = 1; i < 255; i++) {
            try {
                String host = subnet + "." + i;
                System.out.println(host + InetAddress.getByName(host).isReachable(timeout));
                if (InetAddress.getByName(host).isReachable(timeout)) {
                    IPSet.add(host);
                    System.out.println(IPSet.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return IPSet.toString();
    }
}