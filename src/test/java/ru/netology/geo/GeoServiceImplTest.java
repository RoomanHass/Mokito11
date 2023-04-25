package ru.netology.geo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {
    GeoServiceImpl geoService = new GeoServiceImpl();

    @Test
    public void IsLocalhostEqualsIp1() {

        Assertions.assertEquals(new Location(null, null, null, 0), geoService.byIp("127.0.0.1"));
    }

    @Test
    public void IsLocalhostEqualsIp2() {

        Assertions.assertEquals(new Location("Moscow", Country.RUSSIA, "Lenina", 15), geoService.byIp("172.0.32.11"));
    }

    @Test
    public void IsLocalhostEqualsIp3() {

        Assertions.assertEquals(new Location("New York", Country.USA, " 10th Avenue", 32), geoService.byIp("96.44.183.149"));
    }

    @Test
    public void IsLocalhostEqualsIp4() {

        Assertions.assertEquals(new Location("Moscow", Country.RUSSIA, null, 0), geoService.byIp("172.0.32.12"));
    }

    @Test
    public void IsLocalhostEqualsIp5() {

        Assertions.assertEquals(new Location("New York", Country.USA, " 10th Avenue", 32), geoService.byIp("96.44.183.333"));
    }

    @Test
    public void locationByCoordinates() {
        Assertions.assertThrows(RuntimeException.class, () -> geoService.byCoordinates(100.1, 50.6));
    }
}

