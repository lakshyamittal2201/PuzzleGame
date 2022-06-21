package com.example.puzzlegame;

import java.security.SecureRandom;

public class Puzzle {

    private CompanyAndDevice[] companyAndDevices;
    private int currentDeviceModel;
    private  static final int NUMBER_OF_MODELS = 60;
    private static final SecureRandom secureRandomNumbers = new SecureRandom();


    public Puzzle() {
        String[] companies = {"Apple", "Google", "Sony", "Samsung", "HTC"};
        String[] devices = {"Xperia Z3", "iPhone 6", "Galaxy Note 8", "Galaxy Note 10", "iPodTouch"
                , "Htc M9", "Xperia Z5", "iPod Nano", "Xperia M",
                "Galaxy S6", "Nexus5", "Nexus10"};

        companyAndDevices = new CompanyAndDevice[NUMBER_OF_MODELS];
        currentDeviceModel = 0;

        for (int index = 0; index < companyAndDevices.length; index++) {

            companyAndDevices[index] = new CompanyAndDevice(companies[index / 12], devices[index % 12]);


        }
    }





    public void letsShuffleTheDevices() {

        currentDeviceModel = 0;

        for (int firstDevice = 0; firstDevice < companyAndDevices.length; firstDevice++ ) {

            int secondDevice = secureRandomNumbers.nextInt(NUMBER_OF_MODELS);
            CompanyAndDevice tempCompanyDevice = companyAndDevices[firstDevice];
            companyAndDevices[firstDevice] = companyAndDevices[secondDevice];
            companyAndDevices[secondDevice] = tempCompanyDevice;


        }


    }

    public CompanyAndDevice giveMeTheModels() {

        if (currentDeviceModel < companyAndDevices.length) {
            return companyAndDevices[currentDeviceModel++];
        }else {
            return null;
        }

    }


}
