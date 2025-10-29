package com.sibsutis.devices;

public class Phone extends Device {

    public Phone(int id, int price) {
        super(id, price, null);
    }

    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "Phone";
    }

    @Override
    public void print() {
        System.out.println("Phone [id=" + id + ", price=" + price + ", ip=" + ip + "]");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Phone phone = (Phone) o;
        if (ip == null) {
            if (phone.ip != null) return false;
        } else {
            if (!ip.equals(phone.ip)) return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result;
        if (ip != null) {
            result += ip.hashCode();
        }
        return result;
    }
}
