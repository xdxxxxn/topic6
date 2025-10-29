package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    protected int id;
    protected int price;
    protected String ip;

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId() { return id; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }

    public void setId(int id) { this.id = id; }
    public void setPrice(int price) { this.price = price; }
    public void setIp(String ip) { this.ip = ip; }

    public abstract String getDeviceType();

    public int split() {
        return this.price / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return id == device.id && price == device.price;
    }
    
    @Override
    public int hashCode() {
        return 31 * id + price;
    }
}
