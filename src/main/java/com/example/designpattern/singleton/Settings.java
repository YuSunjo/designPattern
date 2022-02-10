package com.example.designpattern.singleton;

public class Settings {

//    public static volatile Settings instance;

    private Settings() {
    }

    // 이렇게 되면 멀티 스레드일 경우 문제가 발생
//    public static Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }

//    public static synchronized Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }

//    // double checked locking  -> volatile 추가해줘야함
//    public static Settings getInstance() {
//        if (instance == null) {
//            synchronized (Settings.class) {
//                if (instance == null) {
//                    instance = new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

//    RunTime runTime = Runtime.getRuntime();

}
