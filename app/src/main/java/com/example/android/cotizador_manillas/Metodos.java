package com.example.android.cotizador_manillas;

public class Metodos {

    public static int totalCompra(int cantidad, int cbMaterial, int cbDije, int cbTipo) {
        int valorU = 0;

        switch (cbMaterial) {
            case 1: {
                switch (cbDije) {
                    case 1: {
                        switch (cbTipo) {
                            case 1: {
                                valorU = cantidad * 100;
                                break;
                            }
                            case 2: {
                                valorU = cantidad * 100;
                                break;
                            }
                            case 3:{
                                valorU = cantidad * 80;
                                break;
                            }
                            case 4: {
                                valorU = cantidad * 70;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch (cbTipo) {
                            case 1: {
                                valorU = cantidad * 120;
                                break;
                            }
                            case 2: {
                                valorU = cantidad * 120;
                                break;
                            }
                            case 3:{
                                valorU = cantidad * 100;
                                break;
                            }
                            case 4: {
                                valorU = cantidad * 90;
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
            case 2:{
                switch (cbDije) {
                    case 1: {
                        switch (cbTipo) {
                            case 1: {
                                valorU = cantidad * 90;
                                break;
                            }
                            case 2: {
                                valorU = cantidad * 90;
                                break;
                            }
                            case 3:{
                                valorU = cantidad * 70;
                                break;
                            }
                            case 4: {
                                valorU = cantidad * 50;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch (cbTipo) {
                            case 1: {
                                valorU = cantidad * 110;
                                break;
                            }
                            case 2: {
                                valorU = cantidad * 110;
                                break;
                            }
                            case 3:{
                                valorU = cantidad * 90;
                                break;
                            }
                            case 4: {
                                valorU = cantidad * 80;
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        return valorU;
    }

    public static int cambiarMoneda(int resultado){

        return resultado * 3200;

    }
}