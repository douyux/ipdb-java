package net.ipip.ipdb;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CityTest {

    private static City cityDb;

    static {
        try {
            InputStream input = CityTest.class.getClassLoader().getResourceAsStream("ipipfree.ipdb");
            cityDb = new City(input);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void findAsnInfo() {
        try {
            CityInfo cityInfo = cityDb.findCity("111.199.81.160", "CN");
            System.out.println(cityInfo.getDistrictInfo());
            System.out.println("\n");
            System.out.println(cityInfo.getRoute());
            System.out.println("\n");
            AsnInfo[] infos = cityInfo.getAsnInfos();
            for (int i = 0; i < infos.length; i++) {
                AsnInfo info = infos[i];
                System.out.println(info.ASN);
                System.out.println(info.Registry);
                System.out.println(info.Country);
                System.out.println(info.NetName);
                System.out.println(info.OrgName);
            }
            System.out.println(infos.length);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void find() {

        try {
            CityInfo cityInfo = cityDb.findCity("111.199.81.160", "CN");
            System.out.println(cityInfo.getDistrictInfo());
            System.out.println("\n");
            System.out.println(cityInfo.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
