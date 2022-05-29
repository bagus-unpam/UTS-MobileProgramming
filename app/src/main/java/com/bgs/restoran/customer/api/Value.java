package com.programming.restoran.customer.api;

import com.programming.restoran.customer.model.Hidangan;
import com.programming.restoran.customer.model.Komentar;
import com.programming.restoran.customer.model.Pelanggan;

import java.util.List;

public class Value {
    Boolean success;
    List<Hidangan> hidangan;
    List<Komentar> komentar;
//    Pelanggan pelanggan;
    List<Pelanggan> pelanggan;
    String message;

    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
    public List<Hidangan> getHidangan() {
        return hidangan;
    }
    public List<Komentar> getKomentar(){
        return komentar;
    }

    public List<Pelanggan> getPelanggan() {
        return pelanggan;
    }
}
